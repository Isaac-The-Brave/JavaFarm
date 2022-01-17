package animalLogic;

public interface Prey {
	//Simply create a method without {} and now there is a command in any class that implements method predator called "Chase". This method must be overridden
	//every time in every new class it's used in.

	String escape();
}
