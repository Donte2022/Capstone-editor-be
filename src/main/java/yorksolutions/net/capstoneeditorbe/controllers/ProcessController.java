package yorksolutions.net.capstoneeditorbe.controllers;

import org.springframework.web.bind.annotation.*;
import yorksolutions.net.capstoneeditorbe.dto.ProcessRequestDTO;
import yorksolutions.net.capstoneeditorbe.entities.Processes;
import yorksolutions.net.capstoneeditorbe.services.ProcessService;

@RestController
@CrossOrigin
@RequestMapping("/api/processes")
public class ProcessController {

    ProcessService processService;

    public ProcessController(ProcessService processService) {
        this.processService = processService;
    }

    @PostMapping
    public Processes create(@RequestBody ProcessRequestDTO requestDTO) {
        return this.processService.create(requestDTO);

    }
}
