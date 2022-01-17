package plantLogic;
import universalOrganismLogic.Perishable;

public abstract class Plant implements Perishable,Growable {

	protected int height;
	protected String species;
	protected double age;
	protected int maxSize;
	
	protected Plant(int height, String species, double age, int maxSize) {
		this.height = height;
		this.species= species;
		this.age = age;
	}
	
}
