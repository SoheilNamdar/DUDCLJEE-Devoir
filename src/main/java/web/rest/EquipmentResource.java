package web.rest;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import domain.Equipment;
import io.swagger.annotations.Api;
import repository.EquipmentRepository;

@Path("/equipment")
@Api(value="/equipment", description = "Personne resource")
public class EquipmentResource {
	
	private EquipmentRepository equipmentRepository = new EquipmentRepository();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Equipment> getAll() {
		
		return equipmentRepository.findAll();
	}

}
