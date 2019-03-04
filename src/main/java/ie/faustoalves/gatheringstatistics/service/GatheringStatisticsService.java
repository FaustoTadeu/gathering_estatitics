package ie.faustoalves.gatheringstatistics.service;

import ie.faustoalves.gatheringstatistics.dto.GatheringStatisticsDTO;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;

@Service
public class GatheringStatisticsService {

    private IntSummaryStatistics sumaryStatistics;

    public ArrayList<Double> GatheringStatistics(ArrayList<GatheringStatisticsDTO> gatheringStatitistcs) {
        Long idSelected = gatheringStatitistcs.get(0).getIdSelected();
        Integer acessedSelected = 0;
        for (int i = 0; i < gatheringStatitistcs.size(); i++) {
            GatheringStatisticsDTO gath = gatheringStatitistcs.get(i);
            if(gath.getIdKey() == idSelected) {
                acessedSelected = gath.getAcessed();
            }
        }
        sumaryStatistics = new IntSummaryStatistics();
        for (int i = 0; i < gatheringStatitistcs.size(); i++) {
            sumaryStatistics.accept(gatheringStatitistcs.get(i).getAcessed());
        }
        Long sumAcessed = sumaryStatistics.getSum();
        Long allRegistries = sumaryStatistics.getCount();
        Double percentByAllAccess = 0.0;
        Double percentByCount = ((double) 1) / ((double) allRegistries) * 100;
        if(acessedSelected > 0) {
            percentByAllAccess = ((double) acessedSelected) / ((double) sumAcessed.intValue()) * 100;
        }
        ArrayList<Double> result = new ArrayList<>();
        result.add((double) sumAcessed.intValue());
        result.add((double) allRegistries.intValue());
        result.add((double) acessedSelected);
        result.add(percentByAllAccess);
        result.add(percentByCount);
        return result;
    }
}
