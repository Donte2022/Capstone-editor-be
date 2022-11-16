package yorksolutions.net.capstoneeditorbe.services;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import yorksolutions.net.capstoneeditorbe.dto.ProcessRequestDTO;
import yorksolutions.net.capstoneeditorbe.dto.TitleRequestDTO;
import yorksolutions.net.capstoneeditorbe.entities.Processes;
import yorksolutions.net.capstoneeditorbe.entities.Title;
import yorksolutions.net.capstoneeditorbe.repositories.TitleRepository;

import java.util.Optional;

@Service
public class TitleService {

    TitleRepository titleRepository;

    public TitleService(TitleRepository titleRepository) {
        this.titleRepository = titleRepository;
    }

    public Title create(TitleRequestDTO requestDTO) {

        try {
            return this.titleRepository.save(
                    new Title(requestDTO.title, requestDTO.startDate, requestDTO.endDate, requestDTO.description));


        } catch (RuntimeException exception) {
            throw new ResponseStatusException(HttpStatus.CONFLICT);
        }
    }

    public Iterable<Title> getTitle() {
        return titleRepository.findAll();
    }

    public boolean deleteById(Long id) {

        try {
            var stage = titleRepository.findById(id).orElseThrow();
            titleRepository.deleteById(id);
            return true;

        } catch (Exception exception) {
            return false;
        }
    }

//    public Title updateTitle(TitleRequestDTO requestDTO, Long id) {
//
//        Optional<Title> updateTitle = this.titleRepository.findById(id);
//        if(updateTitle.isEmpty()) {
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
//        }
//
//        Title titles = updateTitle.get();
//        Title.setTitle(requestDTO.title);
//        Title.setStartDate(requestDTO.startDate);
//        Title.setEndDate(requestDTO.endDate);
//        Title.setDescription(requestDTO.description);
//
//        return TitleRepository.save(titles);
//    }
}
