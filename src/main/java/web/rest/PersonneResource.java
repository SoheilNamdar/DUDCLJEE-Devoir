package web.rest;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import domain.Personne;
import io.swagger.annotations.Api;
import repository.PersonneRepository;

@Path("/personne")
@Api(value="/personne", description = "Personne resource")
public class PersonneResource {
	
	private PersonneRepository personRepository = new PersonneRepository();
	
	@Path("get/{nh}/{nj}")
	@GET
    @Produces(MediaType.APPLICATION_JSON)
	public List<Personne> getAll(
			@PathParam("nh") int nh,
			@PathParam("nj") int nj) {
		return personRepository.findAll(nh, nj);
	}
	
	@Path("consume/{p1}/{p2}/{nh}/{nj}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Personne cosumeAll(
			@PathParam("p1") int p1,
			@PathParam("p2") int p2,
			@PathParam("nh") int nh,
			@PathParam("nj") int nj) {
		
		Personne per1 = personRepository.getPersonById(p1, nh , nj);
		Personne per2 = personRepository.getPersonById(p2, nh, nj);
		
		return personRepository.consume(per1 , per2, nh, nj);
	}

}
