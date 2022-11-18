package yorksolutions.net.capstoneeditorbe.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Stage {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false, unique = true)

    private String stageTitle;

//    @OneToMany
//    private Set<Prompt> prompts;

    @OneToMany
    private Set<Process> process;

    private Date endDate;

    private Date startDate;

    private String description;

    public Stage() {
    }

    public Stage(String stageTitle, Date endDate, Date startDate, String description) {
        this.stageTitle = stageTitle;
//        this.process = process;
//        this.prompts = prompts;
        this.endDate = endDate;
        this.startDate = startDate;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getStageTitle() {
        return stageTitle;
    }

    public void setStageTitle(String stageTitle) {
        this.stageTitle = stageTitle;
    }

    public Set<Process> getProcess() {
        return process;
    }

    public void setProcess(Set<Process> process) {
        this.process = process;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
