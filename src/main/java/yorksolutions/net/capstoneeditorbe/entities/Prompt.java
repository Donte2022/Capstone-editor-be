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

    private String prompt2;

    private String prompt3;

    private String prompt4;

    private String process;

    @OneToOne
    private Stage stage;

    public Prompt() {
    }

    public Prompt(String prompt, String prompt2, String prompt3, String prompt4, Long idOfTitle, String process) {
        this.prompt = prompt;
        this.prompt2 = prompt2;
        this.prompt3 = prompt3;
        this.prompt4 = prompt4;
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

    public String getPrompt2() {
        return prompt2;
    }

    public void setPrompt2(String prompt2) {
        this.prompt2 = prompt2;
    }

    public String getPrompt3() {
        return prompt3;
    }

    public void setPrompt3(String prompt3) {
        this.prompt3 = prompt3;
    }

    public String getPrompt4() {
        return prompt4;
    }

    public void setPrompt4(String prompt4) {
        this.prompt4 = prompt4;
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
