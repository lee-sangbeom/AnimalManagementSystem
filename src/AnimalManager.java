import java.util.ArrayList;
import java.util.Scanner;

public class AnimalManager {
	ArrayList<Animal> animals = new ArrayList<Animal>();
	Scanner in;
	AnimalManager(Scanner in){
		this.in = in;
	}
	public void addAnimal() {
		Animal animal = new Animal();
		System.out.print("Animal name: ");
		animal.name = in.next();
		System.out.print("Animal weight: ");
		animal.weight = in.nextInt();
		System.out.print("Animal height: ");
		animal.height = in.nextInt();
		System.out.print("Animal habitat: ");
		animal.habitat = in.next();
		animals.add(animal);
	}
	public void deleteAnimal() {
		System.out.print("Animal name: ");
		String animalname = in.next();
		int index = -1;
		for (int i = 0; i<animals.size(); i++) {
			if (animals.get(i).name.equals(animalname) ) {
				index = i;
				break;
			}
		}

		if(index >= 0) {
			animals.remove(index);
			System.out.println("the animal" + animalname + "is deleted");	
		}
		else {
			System.out.println("the animal has not been registered");
			return;
		}


	}
	public void editAnimal() {
		System.out.print("Animal name: ");
		String animalname = in.next();
		for (int i = 0; i<animals.size(); i++) {
			Animal animal = animals.get(i);
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
					} // if
				} //while
				break;
			} // if

		}// for
	}
	public void viewAnimals() {
		//		System.out.print("Animal name: ");
		//		String animalname = in.next();
		for (int i = 0; i<animals.size(); i++) {
			animals.get(i).printInfo();
		}


	} 
}
