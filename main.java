import animalObjects.Bee;
import animalObjects.Cow;
import animalObjects.Dog;
import plantObject.Corn;

public class main {	
	//As a reminder. Plants have the following commands
	//isGrowing() isFullyGrown() growing() feed()
	
	//Animals can be Prey or Predator, and is also feedable! 
	//Prey can: escape() feed()
	//Predator can: chase() feed()
	
	//This is a time constraint thing, I don't want to build a whole universe here, but it does bring OOP concepts to light
	//What we consider universal organism logic or animal logic or plant logic will have a LOT of influence. Understanding
	//how the semantics can be gained or lost in specific sets of classes and interfaces is essential. Not easy to make a robust
	//ontology. Some animals can be both predators AND prey (usually the case). So, here it can be a bit more fun to think about it only.
	
	public static void main(String[] args) {
		
		//We create an object "Dog" which has this method public Dog(String species, int height, int width, String gender, int maxSize, String barking, String breed)
		//I will create two different dogs, each with a different breed age and different Bark!
		Dog jenterPes = new Dog("Dog", 17, 13, "Female", 52, "BerkBerk!", "Border-Colly");
		Dog penterJes = new Dog ("Dog",14, 11, "Male", 48, "Brak Brak!", "Mutt");
	
		//Make your dogs show their different barks.
		System.out.println("This is how our first dog, jenterPes sounds when it barks: " + jenterPes.bark());
		System.out.println("This is how our second dog, penterJes sounds when when it barks: " + penterJes.bark());
		
		//We create an object "Bee" which has this method public Bee(String species, int height, int width, String gender, int maxSize, String race)
		Bee buzzerBoi = new Bee("Bee", 1, 1, "Male", 2, "Honey-Bee");
		System.out.println("Our bee is hungry: " + buzzerBoi.isHungry());
		System.out.println("Our bee is currently feeding: " + buzzerBoi.feed());
		
		//We create an object "Cow" which has this method public Cow(String species, int height, int width, String gender, int maxSize, String hideQuality, boolean madnessProne)
		//Some fun can be had with the 'madnessProne' variable to create madCows in the future.
		Cow marthaBigs = new Cow("Cow",29,22,"Female",200,"Decent",true);
		System.out.println("This is how marthaBigs sounds like feeding" + marthaBigs.feed());
		
		//We create an object "Cow" which has this method public Corn(int height, String species, double age, int maxSize, String cornType) {
		Corn singularCorn = new Corn(3,"Corn",2.1,12,"Sweet-Corn");
		System.out.println(singularCorn.perish() + "\n\nHorrible news it was our last piece." );
		
		System.out.println("\nMore Horrible news. With the last piece of corn disappearing, all other animals die as well.");
		System.out.println(jenterPes.perish() + "jenterPes has passed");
		System.out.println(penterJes.perish() + "penterJes has passed");
		System.out.println(buzzerBoi.perish() + "buzzerBoi has Passed");
		System.out.println(marthaBigs.perish() + "marthaBigs has Passed");

		
		
	}
	
}
