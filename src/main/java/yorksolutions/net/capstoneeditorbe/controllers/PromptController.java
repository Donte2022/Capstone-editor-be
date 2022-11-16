package yorksolutions.net.capstoneeditorbe.controllers;

import org.springframework.web.bind.annotation.*;
import yorksolutions.net.capstoneeditorbe.dto.PromptRequestDTO;
import yorksolutions.net.capstoneeditorbe.entities.Prompt;
import yorksolutions.net.capstoneeditorbe.services.PromptService;

@RestController
@CrossOrigin
@RequestMapping("/api/prompt")
public class PromptController {

    PromptService promptService;

    public PromptController(PromptService promptService) {
        this.promptService = promptService;
    }

    @PostMapping
    public Prompt create(@RequestBody PromptRequestDTO requestDTO) {
        return this.promptService.create(requestDTO);
    }

    @GetMapping("/all")
    public Iterable<Prompt> getPrompts() {
        return this.promptService.getPrompts();
    }

    static class Message {
        public String message;
        Message(String message) {
            this.message = message;
        }
    }
    @DeleteMapping("/{id}")
    PromptController.Message deleteById(@PathVariable Long id) {
        return new Message(promptService.deleteById(id) ? "Stage successfully deleted" :
                "fail to delete stage");
    }

    @PutMapping("/{id}")
    public Prompt updatePrompt(@RequestBody PromptRequestDTO requestDTO, @PathVariable Long id) {
        return promptService.updatePrompt(requestDTO, id);
    }
}
