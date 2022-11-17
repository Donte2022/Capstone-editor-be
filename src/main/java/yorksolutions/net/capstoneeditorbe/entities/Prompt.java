package yorksolutions.net.capstoneeditorbe.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Prompt {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

//    @OneToOne
//    private Title titleId;

    private Long idOfTitle;

    private String prompt;

    private String process;

    public Prompt() {
    }

    public Prompt( Long idOfTitle, String prompt, String process) {
//        this.titleId = titleId;
        this.idOfTitle = idOfTitle;
        this.prompt = prompt;
        this.process = process;
    }

    public Long getId() {
        return id;
    }

//    public Title getTitleId() {
//        return titleId;
//    }
//
//    public void setTitleId(Title titleId) {
//        this.titleId = titleId;
//    }

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

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }
}
