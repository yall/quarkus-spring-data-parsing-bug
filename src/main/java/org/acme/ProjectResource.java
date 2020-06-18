package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import java.util.List;

@Path("/contacts")
@Produces("application/json")
public class ProjectResource {

    private ProjectRepository contactRepository;

    public ProjectResource(ProjectRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @GET
    public List<Project> findByOrganisation(@QueryParam("organization") String organization) {
        return contactRepository.findAllByOrganization(organization);
    }

}
