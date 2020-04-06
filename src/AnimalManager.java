import java.util.Scanner;

public class AnimalManager {
	Animal animal;
	Scanner in;
	AnimalManager(Scanner in){
		this.in = in;
	}
	public void addAnimal() {
		animal = new Animal();
		System.out.print("Animal name: ");
		animal.name = in.next();
		System.out.print("Animal weight: ");
		animal.weight = in.nextInt();
		System.out.print("Animal height: ");
		animal.height = in.nextInt();
		System.out.print("Animal habitat: ");
		animal.habitat = in.next();
	}
	public void deleteAnimal() {
		System.out.print("Animal name: ");
		String animalname = in.next();
		if (animal == null) {
			System.out.println("the animal has not been registered");
			return;
		}
		if (animal.name == animalname) {
			animal = null;
			System.out.println("the animal is deleted");
		}
	}
	public void editAnimal() {
		System.out.print("Animal name: ");
		String animalname = in.next();
		if (animal.name == animalname) {
			System.out.println("the animal to be edited is " + animalname);
		}
	}
	public void viewAnimal() {
		System.out.print("Animal name: ");
		String animalname = in.next();
		if (animal.name == animalname) {
			animal.printInfo();
		}
	} 
}
