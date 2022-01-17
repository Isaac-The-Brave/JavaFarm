package animalLogic;

import universalOrganismLogic.Feedable;
import universalOrganismLogic.Perishable;

public abstract class Animal implements Perishable,Feedable{

	protected static String species;
	protected static int height;
	protected static int width;
	protected static String gender;
	protected static int maxSize;

	protected Animal(String species, int height, int width, String gender, int maxSize) {
		this.species = species;
		this.height= height;
		this.width = width;
		this.gender = gender;
		this.maxSize = maxSize;
	}
}
