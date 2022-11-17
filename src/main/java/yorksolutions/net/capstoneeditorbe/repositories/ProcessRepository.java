package yorksolutions.net.capstoneeditorbe.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ProcessRepository extends CrudRepository<Process, Long> {

}
