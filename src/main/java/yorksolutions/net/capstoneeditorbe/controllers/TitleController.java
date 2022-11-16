package yorksolutions.net.capstoneeditorbe.controllers;

import org.springframework.web.bind.annotation.*;
import yorksolutions.net.capstoneeditorbe.dto.ProcessRequestDTO;
import yorksolutions.net.capstoneeditorbe.dto.TitleRequestDTO;
import yorksolutions.net.capstoneeditorbe.entities.Processes;
import yorksolutions.net.capstoneeditorbe.entities.Title;
import yorksolutions.net.capstoneeditorbe.services.ProcessService;
import yorksolutions.net.capstoneeditorbe.services.TitleService;

@RestController
@CrossOrigin
@RequestMapping("/api/titles")
public class TitleController {

    TitleService titleService;

    public TitleController(TitleService titleService) {
        this.titleService = titleService;
    }

    @PostMapping
    public Title create(@RequestBody TitleRequestDTO requestDTO) {
        return this.titleService.create(requestDTO);
    }

    @GetMapping("/all")
    public Iterable<Title> getTitle() {
        return this.titleService.getTitle();
    }


    static class Message {
        public String message;
        Message(String message) {
            this.message = message;
        }
    }
//    @DeleteMapping("/{id}")
//    TitleController.Message deleteById(@PathVariable Long id) {
//        return new TitleController(TitleService.deleteById(id) ? "Stage successfully deleted" :
//                "fail to delete stage");
//    }

//    @PutMapping("/{id}")
//    public Title updateStage(@RequestBody TitleRequestDTO requestDTO, @PathVariable Long id) {
//        return titleService.updateTitle(requestDTO, id);
//    }

}
