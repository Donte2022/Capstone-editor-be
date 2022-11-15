package yorksolutions.net.capstoneeditorbe.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Prompt {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToMany
    private Set<Responses> responses;

    private Long processId;

    private String question;

    public Prompt() {
    }

    public Prompt(Set<Responses> responses, Long processId, String question) {
        this.responses = responses;
        this.processId = processId;
        this.question = question;
    }

    public Long getId() {
        return id;
    }

    public Set<Responses> getResponses() {
        return responses;
    }

    public void setResponses(Set<Responses> responses) {
        this.responses = responses;
    }

    public Long getProcessId() {
        return processId;
    }

    public void setProcessId(Long processId) {
        this.processId = processId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
