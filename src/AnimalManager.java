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
		if (animal.equals(null)) {
			System.out.println("the animal has not been registered");
			return;
		}
		if (animal.name.equals(animalname) ) {
			animal = null;
			System.out.println("the animal is deleted");
		}
	}
	public void editAnimal() {
		System.out.print("Animal name: ");
		String animalname = in.next();
		if (animal.name.equals(animalname)) {
			int num = -1;
			while(num != 5) {
				System.out.println("** Animal Management System Menu **");
				System.out.println("1.Edit Name");
				System.out.println("2.Edit Weight");
				System.out.println("3.Edit Height");
				System.out.println("4.Edit Habitat");
				System.out.println("5.Exit");
				System.out.println("Select one number between 1~5 :");
				num = in.nextInt();
				if (num == 1) {
					System.out.print("Animal name: ");
					animal.name = in.next();
			
				}
				else if (num == 2) {
					System.out.print("Animal weight: ");
					animal.weight = in.nextInt();
					
				}
				else if (num == 3) {
					System.out.print("Animal height: ");
					animal.height = in.nextInt();
					
				}
				else if (num == 4) {
					System.out.print("Animal habitat: ");
					animal.habitat = in.next();
					
				}
				else {
					continue;
				}
			}
			
		}
	}
	public void viewAnimal() {
		System.out.print("Animal name: ");
		String animalname = in.next();
		if (animal.name.equals(animalname)) {
			animal.printInfo();
		}
	} 
}
