package animalObjects;
import animalLogic.Animal;
import animalLogic.Predator;
import animalLogic.Prey;
import universalOrganismLogic.Feedable;

public class Bee extends Animal implements Prey{


private String race;
private String species = "Bee";

public Bee(String species, int height, int width, String gender, int maxSize, String race) {
	super(species, height, width, gender, maxSize);
	this.race = race;
	}

@Override
public String escape() {
	return "The bee is buzzing away as fast as it can.";
}

public String perish() {
	
	return "The " + species + " has died";
}

@Override
public String feed() {
	return "*BUZZ BUZZZ BUZZZ*. A HAPPY BEE IS AN EATING BEE!";
	
}

@Override
public String isHungry() {
	return "*BUZZ BUZZ* The bee seeks food...";
	
}

}