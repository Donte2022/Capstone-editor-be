package yorksolutions.net.capstoneeditorbe.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Stage {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long iD;

    @Column(nullable = false, unique = true)

    private String StageTitle;

    @OneToMany
    private Set<Prompt> prompts;

    @OneToMany
    private Set<Process> process;

    private Date endDate;

    private Date startDate;

    private String description;

    public Stage() {
    }

    public Stage(String StageTitle, Date endDate, Date startDate, String description) {
        this.StageTitle = StageTitle;
//        this.process = process;
//        this.prompts = prompts;
        this.endDate = endDate;
        this.startDate = startDate;
        this.description = description;
    }

    public Long getiD() {
        return iD;
    }


    public String getStageTitle() {
        return StageTitle;
    }

    public void setStageTitle(String stageTitle) {
        StageTitle = stageTitle;
    }

    public Set<Prompt> getPrompts() {
        return prompts;
    }

    public void setPrompts(Set<Prompt> prompts) {
        this.prompts = prompts;
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
