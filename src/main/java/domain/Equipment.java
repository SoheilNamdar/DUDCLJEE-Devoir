package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Equipment {
	
	private long id;
	private static  double consommation;

	public Equipment(){
		super();
	}

	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public static double getConsommation() {
		return consommation;
	}

	public void setConsommation(double consommation) {
		Equipment.consommation = consommation;
	}
}
