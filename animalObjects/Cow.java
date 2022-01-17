package animalObjects;
import animalLogic.Animal;
import animalLogic.Prey;
import universalOrganismLogic.Feedable;

public class Cow extends Animal implements Feedable,Prey{

	private String hideQuality;
	private boolean madnessProne;
	private String species = "Cow";
	
public Cow(String species, int height, int width, String gender, int maxSize, String hideQuality, boolean madnessProne) {
	super(species, height, width, gender, maxSize);
	this.hideQuality = hideQuality;
	this.madnessProne = madnessProne;
	}

@Override
public String escape() {
	return "Moo!\n*The cow begins to escape*";
	
}

@Override
public String feed() {
	return "MOOOOO!. Finally FUDE! *Monch Monch*";
	
}

@Override
public String isHungry() {
	return "Feed me, you cow hater. I'm hungry!!!!";
}

@Override
public String perish() {
	return "The " + species + " has died";

}


}
