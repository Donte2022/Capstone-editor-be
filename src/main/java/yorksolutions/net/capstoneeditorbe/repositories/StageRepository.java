package yorksolutions.net.capstoneeditorbe.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import yorksolutions.net.capstoneeditorbe.entities.Stage;

@Repository
public interface StageRepository extends CrudRepository <Stage, Long> {
}
