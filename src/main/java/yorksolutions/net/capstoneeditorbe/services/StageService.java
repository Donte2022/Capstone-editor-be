package yorksolutions.net.capstoneeditorbe.services;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import yorksolutions.net.capstoneeditorbe.dto.StageRequestDTO;
import yorksolutions.net.capstoneeditorbe.dto.TitleRequestDTO;
import yorksolutions.net.capstoneeditorbe.entities.Process;
import yorksolutions.net.capstoneeditorbe.entities.Stage;
import yorksolutions.net.capstoneeditorbe.entities.Title;
import yorksolutions.net.capstoneeditorbe.repositories.StageRepository;

import java.util.Optional;
import java.util.Set;

@Service
public class StageService {

    StageRepository stageRepository;

    public StageService(StageRepository stageRepository) {
        this.stageRepository = stageRepository;
    }

    public Stage create(StageRequestDTO requestDTO) {

        try {
            return this.stageRepository.save(
                    new Stage(requestDTO.StageTitle, requestDTO.startDate, requestDTO.endDate, requestDTO.description));


        } catch (RuntimeException exception) {
            throw new ResponseStatusException(HttpStatus.CONFLICT);
        }
    }

    public Iterable<Stage> getStage() {
        return stageRepository.findAll();
    }

    public boolean deleteById(Long id) {

        try {
            var stage = stageRepository.findById(id).orElseThrow();
            stageRepository.deleteById(id);
            return true;

        } catch (Exception exception) {
            return false;
        }
    }

    public Stage updateStage(StageRequestDTO requestDTO, Long id) {

        Optional<Stage> updateStage = this.stageRepository.findById(id);
        if(updateStage.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        Stage stage = updateStage.get();
        stage.setStageTitle(requestDTO.StageTitle);
        stage.setStartDate(requestDTO.startDate);
        stage.setEndDate(requestDTO.endDate);
        stage.setDescription(requestDTO.description);

        return stageRepository.save(stage);
    }
}
