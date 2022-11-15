package yorksolutions.net.capstoneeditorbe.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import yorksolutions.net.capstoneeditorbe.entities.Processes;

import java.util.Optional;

@Repository
public interface ProcessRepository extends CrudRepository<Processes, Long> {

}
