package yorksolutions.net.capstoneeditorbe.controllers;

import org.springframework.web.bind.annotation.*;
import yorksolutions.net.capstoneeditorbe.dto.ProcessRequestDTO;
import yorksolutions.net.capstoneeditorbe.entities.Stage;
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
    public Process create(@RequestBody ProcessRequestDTO requestDTO) {
        return this.processService.create(requestDTO);
    }

    @GetMapping("/titles")
    public Iterable<Process> getTitle() {
        return this.processService.getTitle();
    }


    static class Message {
        public String message;
        Message(String message) {
            this.message = message;
        }
    }
    @DeleteMapping("/{id}")
    Message deleteById(@PathVariable Long id) {
        return new Message(processService.deleteById(id) ? "Stage successfully deleted" :
                "fail to delete stage");
    }

    @PutMapping("/{id}")
    public Process updateProcess(@RequestBody ProcessRequestDTO requestDTO, @PathVariable Long id) {
        return processService.updateStage(requestDTO, id);
    }
}
