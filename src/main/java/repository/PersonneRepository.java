package repository;

import java.util.ArrayList;
import java.util.List;

import domain.Equipment;
import domain.Personne;
import domain.Residence;

public class PersonneRepository {
	
	List<Personne> personnes = new ArrayList<Personne>();
	
	Personne p1 = new Personne();
	Personne p2 = new Personne();
	Personne p3 = new Personne();
	Personne p4 = new Personne();
	
	Residence r1 = new Residence();
	Residence r2 = new Residence();
	Residence r3 = new Residence();
	Residence r4 = new Residence();
	Residence r5 = new Residence();
	
	Equipment e1 = new Equipment();
	Equipment e2 = new Equipment();
	Equipment e3 = new Equipment();
	Equipment e4 = new Equipment();

	public List<Personne> findAll(int nh, int nj) {

		//1ére personne
		List<Equipment> equipments1 = new ArrayList<Equipment>();
		e1.setId(1);
		e1.setConsommation(105.25);
		e2.setId(2);
		e2.setConsommation(109.25);
		equipments1.add(e1);
		equipments1.add(e2);
		
		List<Equipment> equipments2 = new ArrayList<Equipment>();
		e3.setId(3);
		e3.setConsommation(75.95);
		e4.setId(4);
		e4.setConsommation(99.25);
		equipments2.add(e3);
		equipments2.add(e4);
		
		List<Residence> residences1 = new ArrayList<Residence>();
		r1.setId(1l);
		r1.setNbPiece(2);
		r1.setTaille(100);
		r1.setEquipments(equipments1);
		r2.setId(2l);
		r2.setNbPiece(3);
		r2.setTaille(50);
		r2.setEquipments(equipments2);
		residences1.add(r1);
		residences1.add(r2);
		
		p1.setId(1);
		p1.setMail("soheilnamdar@yahoo.com");
		p1.setNom("NAMDAR");
		p1.setPrenom("Soheil");
		p1.setResidences(residences1 );
		personnes.add(p1);
		
		//2éme personne
		List<Equipment> equipments3 = new ArrayList<Equipment>();
		e1.setId(5);
		e1.setConsommation(105.25);
		e2.setId(6);
		e2.setConsommation(109.25);
		equipments3.add(e1);
		equipments3.add(e2);
		
		List<Residence> residences2 = new ArrayList<Residence>();
		r3.setId(3l);
		r3.setNbPiece(3);
		r3.setTaille(110);
		r3.setEquipments(equipments3);
		residences2.add(r3);
		
		p2.setId(2);
		p2.setMail("sepehr@yahoo.com");
		p2.setNom("NAMDAR");
		p2.setPrenom("Sepehr");
		p2.setResidences(residences2 );
		personnes.add(p2);
		
		//3éme personne
		List<Equipment> equipments4 = new ArrayList<Equipment>();
		e3.setId(7);
		e3.setConsommation(105.15);
		e4.setId(8);
		e4.setConsommation(79.5);
		e1.setId(9);
		e1.setConsommation(100.15);
		equipments4.add(e3);
		equipments4.add(e4);
		equipments4.add(e1);
		
		List<Residence> residences3 = new ArrayList<Residence>();
		r4.setId(4l);
		r4.setNbPiece(1);
		r4.setTaille(40);
		r4.setEquipments(equipments4);
		residences3.add(r4);
		
		p3.setId(3);
		p3.setMail("worldjohn@hotmail.fr");
		p3.setNom("WORLD");
		p3.setPrenom("john");
		p3.setResidences(residences3);
		personnes.add(p3);
		
		//4éme personne
		List<Equipment> equipments5 = new ArrayList<Equipment>();
		e4.setId(10);
		e4.setConsommation(49.9);
		equipments5.add(e4);
		
		List<Residence> residences4 = new ArrayList<Residence>();
		r5.setId(5l);
		r5.setNbPiece(1);
		r5.setTaille(15);
		r5.setEquipments(equipments5);
		residences4.add(r5);
		
		p4.setId(4);
		p4.setMail("olivierDupont@yahoo.fr");
		p4.setNom("DUPONT");
		p4.setPrenom("Olivier");
		p4.setResidences(residences4);
		personnes.add(p4);
		
		return personnes;
	}

	public Personne consume(Personne p1, Personne p2, int nh, int nj) {
		Personne max = null;
		double sum1 = 0 ;
		double sum2 = 0 ;
		
		for ( Residence r : p1.getResidences()) {
			for(Equipment e : r.getEquipments() )
				sum1 += e.getConsommation() * nj * nh / 1000 ;
		}
		
		for ( Residence r2 : p2.getResidences()) {
			for(Equipment e : r2.getEquipments() )
				sum2 += e.getConsommation() * nj * nh / 1000 ;
		}
		
		if (sum1 < sum2) 
			max = p2; 
		else if (sum1 > sum2) 
			 max = p1;
		else
			System.out.println(" On a la meme consommation ! ");
				
		return  max;
	}

	public Personne getPersonById(int idP1, int nh, int nj) {
		
		this.findAll(nh, nj);
		
		return personnes.get(idP1);
	}
	
}
