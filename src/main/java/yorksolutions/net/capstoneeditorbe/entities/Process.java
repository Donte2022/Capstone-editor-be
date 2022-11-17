package yorksolutions.net.capstoneeditorbe.entities;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
public class Process {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String process;

    @ManyToOne
    private Stage stage;

    public Process() {
    }

    @Autowired
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
}
