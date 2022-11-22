package yorksolutions.net.capstoneeditorbe.entities;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Prompt {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;


    private Long idOfTitle;

    private String prompt;

    private String process;

    @OneToOne
    private Stage stage;

    public Prompt() {
    }

//    public Prompt(Long idOfTitle, String prompt) {
//
////        this.process = process;
//    }

//    public Prompt(String prompt, String process, Long idOfTitle) {
//        this.idOfTitle = idOfTitle;
//        this.process = process;
//        this.prompt = prompt;
//    }


//    public Prompt(Long idOfTitle, String prompt, String process) {
//        this.idOfTitle = idOfTitle;
//        this.prompt = prompt;
//        this.process = process;
//    }

    public Prompt(String prompt, Long idOfTitle, String process) {
        this.prompt = prompt;
        this.process = process;
        this.idOfTitle = idOfTitle;
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

    public Stage getStage() {
        return stage;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
}
