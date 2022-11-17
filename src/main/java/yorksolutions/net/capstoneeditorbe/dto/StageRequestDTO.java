package yorksolutions.net.capstoneeditorbe.dto;

import yorksolutions.net.capstoneeditorbe.entities.Process;
import yorksolutions.net.capstoneeditorbe.entities.Prompt;

import javax.persistence.OneToMany;
import java.util.Date;
import java.util.Set;

public class StageRequestDTO {

    public String StageTitle;

//    public Set<Prompt> prompts;
//
//
//    public Set<Process> process;

    public Date endDate;

    public Date startDate;
}
