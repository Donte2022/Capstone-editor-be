package yorksolutions.net.capstoneeditorbe.dto;

import yorksolutions.net.capstoneeditorbe.entities.Prompt;

import java.util.Date;
import java.util.Set;

public class ProcessRequestDTO {


    public Date dateCreated;

    public String processTitle;

    public Set<Prompt> prompt;

}
