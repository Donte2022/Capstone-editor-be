package yorksolutions.net.capstoneeditorbe.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Prompt {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToOne
    private Title title;

    private Long idOfTitle;

    private String prompt;

    public Prompt() {
    }

    public Prompt(Long idOfTitle, String prompt) {
        this.idOfTitle = idOfTitle;
        this.prompt = prompt;
    }

    public Long getId() {
        return id;
    }

    public Long getIdOfTitle() {
        return idOfTitle;
    }

    public void setIdOfTitle(Long idOfTitle) {
        this.idOfTitle = idOfTitle;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }
}
