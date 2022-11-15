package yorksolutions.net.capstoneeditorbe.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Processes {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long iD;

    @Column(nullable = false, unique = true)
    private String processTitle;

    @OneToMany
    private Set<Prompt> prompt;

    private Date dateCreated;

    public Processes() {
    }

    public Processes(String processTitle, Set<Prompt> prompt, Date dateCreated) {

        this.processTitle = processTitle;
        this.prompt = prompt;
        this.dateCreated = dateCreated;
    }

    public Long getiD() {
        return iD;
    }

    public String getTitle() {
        return processTitle;
    }

    public void setTitle(String processTitle) {
        this.processTitle = processTitle;
    }

    public Set<Prompt> getPrompt() {
        return prompt;
    }

    public void setPrompt(Set<Prompt> prompt) {
        this.prompt = prompt;
    }

    public Date getDate() {
        return dateCreated;
    }

    public void setDate(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}
