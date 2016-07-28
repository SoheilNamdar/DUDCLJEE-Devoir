package repository;

import java.util.ArrayList;
import java.util.List;

import domain.Equipment;
import domain.Residence;

public class ResidenceRepository {
	
	public List<Residence> findAll() {
		
		List<Residence> residences = new ArrayList<Residence>();
		
		Residence r1 = new Residence();
		r1.setId(1l);
		r1.setNbPiece(2);
		r1.setTaille(100);
		
		Residence r2 = new Residence();
		r2.setId(2l);
		r2.setNbPiece(3);
		r2.setTaille(110);
		
		residences.add(r2);
		
		Equipment e1 = new Equipment();
		e1.setId(1);
		e1.setConsommation(105.25);
		
		Equipment e2 = new Equipment();
		e2.setId(2);
		e2.setConsommation(204.32);
		
		Equipment e3 = new Equipment();
		e3.setId(3);
		e3.setConsommation(202.52);
		
		List<Equipment> equipments = new ArrayList<Equipment>();
		
		equipments.add(e1);
		equipments.add(e2);
		equipments.add(e3);
		
		r1.setEquipments(equipments);
		
		residences.add(r1);
		
		return residences;
	}

}
