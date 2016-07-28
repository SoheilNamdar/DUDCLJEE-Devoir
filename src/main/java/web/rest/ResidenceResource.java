package web.rest;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import domain.Residence;
import io.swagger.annotations.Api;
import repository.ResidenceRepository;

@Path("/residence")
@Api(value="/residence", description = "Personne resource")
public class ResidenceResource {
	
	private ResidenceRepository residenceRepository = new ResidenceRepository();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Residence> getAll(){
		return residenceRepository.findAll();
	}

}
