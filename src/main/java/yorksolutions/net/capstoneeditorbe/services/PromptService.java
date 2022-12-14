package yorksolutions.net.capstoneeditorbe.services;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import yorksolutions.net.capstoneeditorbe.dto.PromptRequestDTO;
import yorksolutions.net.capstoneeditorbe.entities.Prompt;
import yorksolutions.net.capstoneeditorbe.repositories.PromptRepository;

import java.util.Optional;

@Service
public class PromptService {

    PromptRepository promptRepository;

    public PromptService(PromptRepository promptRepository) {
        this.promptRepository = promptRepository;
    }

    public Prompt create(PromptRequestDTO requestDTO) {

        try {
            return this.promptRepository.save(
                    new Prompt(requestDTO.prompt, requestDTO.prompt2, requestDTO.prompt3, requestDTO.prompt4, requestDTO.idOfTitle, requestDTO.process));


        } catch (RuntimeException exception) {
            throw new ResponseStatusException(HttpStatus.METHOD_NOT_ALLOWED);
        }
    }

    public Iterable<Prompt> getPrompts() {
        return promptRepository.findAll();
    }

    public boolean deleteById(Long id) {

        try {
            var stage = promptRepository.findById(id).orElseThrow();
            promptRepository.deleteById(id);
            return true;

        } catch (Exception exception) {
            return false;
        }
    }

    public Prompt updatePrompt(PromptRequestDTO requestDTO, Long id) {

        Optional<Prompt> updateThisPrompt = this.promptRepository.findById(id);
        if(updateThisPrompt.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        Prompt prompt = updateThisPrompt.get();
        prompt.setPrompt(requestDTO.prompt);
        prompt.setPrompt2(requestDTO.prompt2);
        prompt.setPrompt3(requestDTO.prompt3);
        prompt.setPrompt4(requestDTO.prompt4);
        prompt.setProcess(requestDTO.process);

        return promptRepository.save(prompt);
    }
}
