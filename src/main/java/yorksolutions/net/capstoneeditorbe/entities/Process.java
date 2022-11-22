package yorksolutions.net.capstoneeditorbe.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Process {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String process;

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
