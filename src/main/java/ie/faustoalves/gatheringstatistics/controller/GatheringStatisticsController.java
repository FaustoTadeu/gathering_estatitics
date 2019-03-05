package ie.faustoalves.gatheringstatistics.controller;

import ie.faustoalves.gatheringstatistics.service.GatheringStatisticsService;
import ie.faustoalves.gatheringstatistics.dto.GatheringStatisticsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping(value = "/")
public class GatheringStatisticsController {
    private final static Logger LOGGER = Logger.getLogger(GatheringStatisticsController.class.getName());

    @Autowired
    private GatheringStatisticsService gatheringStatisticsService;

    @CrossOrigin(origins = "http://localhost:8100")
    @RequestMapping(value = "/statistics", method = RequestMethod.POST, consumes = {"application/json"})
    public ResponseEntity<List<Double>> shortenUrl(@RequestBody @Valid final ArrayList<GatheringStatisticsDTO> statistics, HttpServletRequest request) throws Exception {
        List<Double> list = gatheringStatisticsService.GatheringStatistics(statistics);
        return ResponseEntity.ok().body(list);
    }
}