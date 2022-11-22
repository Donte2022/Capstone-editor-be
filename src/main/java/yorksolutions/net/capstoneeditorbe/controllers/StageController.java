package yorksolutions.net.capstoneeditorbe.controllers;

import org.springframework.web.bind.annotation.*;
import yorksolutions.net.capstoneeditorbe.dto.StageRequestDTO;
import yorksolutions.net.capstoneeditorbe.entities.Stage;
import yorksolutions.net.capstoneeditorbe.services.StageService;

@RestController
@CrossOrigin
@RequestMapping("/api/stage")
public class StageController {

    StageService stageService;

    public StageController(StageService stageService) {
        this.stageService = stageService;
    }

    @PostMapping
    public Stage create(@RequestBody StageRequestDTO requestDTO) {
        return this.stageService.create(requestDTO);
    }

    @GetMapping("/all")
    public Iterable<Stage> getTitle() {
        return this.stageService.getStage();
    }


    static class Message {
        public String message;
        Message(String message) {
            this.message = message;
        }
    }
    @DeleteMapping("/{id}")
    Message deleteById(@PathVariable Long id) {
        return new Message(stageService.deleteById(id) ? "Stage successfully deleted" :
                "fail to delete stage");
    }

    @PutMapping("/{id}")
    public Stage updateTitle(@RequestBody StageRequestDTO requestDTO, @PathVariable Long id) {
        return stageService.updateStage(requestDTO, id);
    }

}
