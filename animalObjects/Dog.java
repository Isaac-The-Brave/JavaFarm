package animalObjects;

import animalLogic.Animal;
import animalLogic.Predator;
import universalOrganismLogic.Feedable;

public class Dog extends Animal implements Predator {

private String barking;
private String breed;
private String species = "Dog";

public Dog(String species, int height, int width, String gender, int maxSize, String barking, String breed) {
	super(species, height, width, gender, maxSize);
	this.barking = barking;
	this.breed = breed;
	super.species = species;
}

@Override
public String chase() {
	return "Come here! LEMME EAT YOU UP!!!! *Chases*";
	
}

@Override
public String feed() {
	return "Yummy Yummy food. Finally! *Monch Monch*";
	
}

@Override
public String isHungry() {
	return "Feed me, mayne. I'm hungry.";
}

public String bark() {
	return barking;
	
}

@Override
public String perish() {
	
	return "The " + species + " has died";
}
}
