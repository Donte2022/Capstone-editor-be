package yorksolutions.net.capstoneeditorbe.services;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import yorksolutions.net.capstoneeditorbe.dto.ProcessRequestDTO;
import yorksolutions.net.capstoneeditorbe.entities.Stage;
import yorksolutions.net.capstoneeditorbe.repositories.ProcessRepository;

import java.util.Optional;

@Service
public class ProcessService {

    ProcessRepository processRepository;

    public ProcessService(ProcessRepository processRepository) {
        this.processRepository = processRepository;
    }


    public Process create(ProcessRequestDTO requestDTO) {

        try {
            return this.processRepository.save(
                    new Process(requestDTO.process));


        } catch (RuntimeException exception) {
            throw new ResponseStatusException(HttpStatus.SERVICE_UNAVAILABLE);
        }
    }

    public Iterable<Process> getTitle() {
        return processRepository.findAll();
    }

    public boolean deleteById(Long id) {

        try {
            var stage = processRepository.findById(id).orElseThrow();
            processRepository.deleteById(id);
            return true;

        } catch (Exception exception) {
            return false;
        }
    }

//    public Process updateStage(ProcessRequestDTO requestDTO, Long id) {
//
//        Optional<Process> updateProcess = this.processRepository.findById(id);
//        if(updateProcess.isEmpty()) {
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
//        }
//
//        Process process = updateProcess.get();
//        process.(requestDTO.Set<processes>);
//        process.setStage(requestDTO.stage);
//
//        return processRepository.save(process);
//    }
}
