package ie.faustoalves.gatheringestatistics.service;

import ie.faustoalves.gatheringestatistics.dto.GatheringEstatisticsDTO;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;

@Service
public class GatheringEstatisticsService {

    private IntSummaryStatistics sumaryEstatistics;

    public ArrayList<Double> GatheringEstatistics(ArrayList<GatheringEstatisticsDTO> gatheringEstatitistcs) {
        Long idSelected = gatheringEstatitistcs.get(0).getIdSelected();
        Integer acessedSelected = 0;
        for (int i = 0; i < gatheringEstatitistcs.size(); i++) {
            GatheringEstatisticsDTO gath = gatheringEstatitistcs.get(i);
            if(gath.getIdKey() == idSelected) {
                acessedSelected = gath.getAcessed();
            }
        }
        sumaryEstatistics = new IntSummaryStatistics();
        for (int i = 0; i < gatheringEstatitistcs.size(); i++) {
            sumaryEstatistics.accept(gatheringEstatitistcs.get(i).getAcessed());
        }
        Long sumAcessed = sumaryEstatistics.getSum();
        Long totalRegistros = sumaryEstatistics.getCount();
        Double percentByAllAccess = ((double) acessedSelected) / ((double) sumAcessed.intValue()) * 100;
        Double percentByCount = ((double) acessedSelected) / ((double)totalRegistros) * 100;

        ArrayList<Double> result = new ArrayList<>();
        result.add((double) sumAcessed.intValue());
        result.add((double) totalRegistros.intValue());
        result.add(percentByAllAccess);
        result.add(percentByCount);

        return result;

    }
}
