package domain;

import java.util.List;
import java.util.Scanner;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import repository.EquipmentRepository;
import repository.PersonneRepository;

@Entity
public class Residence {
	
	private Long id;

    private int taille;
    
    private int nbPiece;
    
    private List<Equipment> equipments;

    public Residence() {
        super();
    }

    @Id
    @GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public int getNbPiece() {
		return nbPiece;
	}

	public void setNbPiece(int nbPiece) {
		this.nbPiece = nbPiece;
	}

	public List<Equipment> getEquipments() {
		return equipments;
	}

	public void setEquipments(List<Equipment> equipments) {
		this.equipments = equipments;
	}

//	public double consumEquipment(int nh, int nj) { 
//		double sum = 0 ;
//		double consume;
//		
//		PersonneRepository personneRepository = new PersonneRepository();
//		
//		for ( Equipment e : equipments) {
//			consume = ( nh * nj * e.getConsommation() ) / 1000 ;
//			sum = sum + consume ;
//		}
//		return sum;
//	}
    
}
