package yorksolutions.net.capstoneeditorbe.services;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import yorksolutions.net.capstoneeditorbe.dto.ProcessRequestDTO;
import yorksolutions.net.capstoneeditorbe.entities.Processes;
import yorksolutions.net.capstoneeditorbe.repositories.ProcessRepository;

import java.util.Optional;

@Service
public class ProcessService {

    ProcessRepository processRepository;

    public ProcessService(ProcessRepository processRepository) {
        this.processRepository = processRepository;
    }


    public Processes create(ProcessRequestDTO requestDTO) {

        try {
            return this.processRepository.save(
                new Processes(requestDTO.processTitle, requestDTO.prompt, requestDTO.dateCreated));


        }
        catch ( RuntimeException exception) {
            throw new ResponseStatusException(HttpStatus.SERVICE_UNAVAILABLE);
        }
    }

    public Iterable<Processes> getTitle() {
        return processRepository.findAll();
    }
}
