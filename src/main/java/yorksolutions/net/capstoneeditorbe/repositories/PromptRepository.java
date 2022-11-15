package yorksolutions.net.capstoneeditorbe.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import yorksolutions.net.capstoneeditorbe.entities.Prompt;

@Repository
public interface PromptRepository extends CrudRepository<Prompt, Long> {
}
