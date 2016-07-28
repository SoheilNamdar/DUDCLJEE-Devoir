package repository;

import java.util.ArrayList;
import java.util.List;

import domain.Equipment;

public class EquipmentRepository {
	
	public List<Equipment> findAll() {
		
		List<Equipment> equipments = new ArrayList<Equipment>();
		
		Equipment e1 = new Equipment();
		e1.setId(1);
		e1.setConsommation(105.25);
		
		Equipment e2 = new Equipment();
		e2.setId(2);
		e2.setConsommation(204.32);
		
		Equipment e3 = new Equipment();
		e3.setId(3);
		e3.setConsommation(202.52);
		
		equipments.add(e1);
		equipments.add(e2);
		equipments.add(e3);
		
		return equipments;
	}

}
