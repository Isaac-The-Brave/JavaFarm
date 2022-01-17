package plantObject;
import plantLogic.Growable;
import plantLogic.Plant;
import universalOrganismLogic.Feedable;

public class Corn extends Plant implements Growable{

	private String cornType = "None-Defined";
	private String species = "Corn";
	
	public Corn(int height, String species, double age, int maxSize, String cornType) {
		super(height, species, age, maxSize);
		this.cornType = cornType;
		
	}

	@Override
	public String growing(int maxSize) {
		if(height >= this.maxSize)
			return isFullyGrown(this.species);
		else
			return "I am momentarily growing";
	}

	@Override
	public String isFullyGrown(String species) {
		this.species = species;
		return "I'm a fully grown " + species;
	}

	@Override
	public String perish() {
		return "The " + species + " has died";
		
	}

}
