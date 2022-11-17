package yorksolutions.net.capstoneeditorbe.entities;

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

    public Process(String process, Stage stage) {
        this.process = process;
//        this.stage = stage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

//    public Stage getStage() {
//        return stage;
//    }
//
//    public void setStage(Stage stage) {
//        this.stage = stage;
//    }
}
