package ie.faustoalves.gatheringestatistics.controller;

import ie.faustoalves.gatheringestatistics.dto.GatheringEstatisticsDTO;
import ie.faustoalves.gatheringestatistics.service.GatheringEstatisticsService;
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
public class GatheringEstatisticsController {
    private final static Logger LOGGER = Logger.getLogger(GatheringEstatisticsController.class.getName());

    @Autowired
    private GatheringEstatisticsService gatheringEstatisticsService;

    @CrossOrigin(origins = "http://localhost:8100")
    @RequestMapping(value = "/estatistics", method = RequestMethod.POST, consumes = {"application/json"})
    public ResponseEntity<List<Double>> shortenUrl(@RequestBody @Valid final ArrayList<GatheringEstatisticsDTO> estatistics, HttpServletRequest request) throws Exception {
        List<Double> list = gatheringEstatisticsService.GatheringEstatistics(estatistics);
        return ResponseEntity.ok().body(list);
    }
}