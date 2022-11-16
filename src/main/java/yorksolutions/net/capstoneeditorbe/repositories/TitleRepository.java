package yorksolutions.net.capstoneeditorbe.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import yorksolutions.net.capstoneeditorbe.entities.Title;

@Repository
public interface TitleRepository extends CrudRepository <Title, Long> {
}
