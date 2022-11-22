package yorksolutions.net.capstoneeditorbe.entities;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Process {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String process;


//    private String stage;

    @OneToMany
    private Set<Prompt> prompt;

    public Process() {
    }

    public Process(String process) {
        this.process = process;
    }

    public Long getId() {
        return id;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public Set<Prompt> getPrompt() {
        return prompt;
    }

    public void setPrompt(Set<Prompt> prompt) {
        this.prompt = prompt;
    }
}
