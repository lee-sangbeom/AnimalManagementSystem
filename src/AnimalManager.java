import java.util.ArrayList;
import java.util.Scanner;

import animal.Animal;
import animal.AnimalKind;
import animal.BirdsAnimal;
import animal.FishAnimal;
import animal.InsectsAnimal;

public class AnimalManager {
	ArrayList<Animal> animals = new ArrayList<Animal>();
	Scanner in;
	AnimalManager(Scanner in){
		this.in = in;
	}
	public void addAnimal() {
		int kind = 0;
		Animal animal;
		while(kind != 1 && kind !=2) {

			System.out.println("1 for Mammalia ");
			System.out.println("2 for Birds ");
			System.out.println("3 for Insects ");
			System.out.println("4 for Fish ");
			System.out.print("Select num 1, 2, 3, or 4 for Animal Kind: ");
			kind = in.nextInt();
			if(kind == 1) {
				animal = new Animal(AnimalKind.Mammalia);
				animal.getUserInput(in);
				animals.add(animal);
				break;
			}
			else if(kind == 2) {
				animal = new BirdsAnimal(AnimalKind.Birds);
				animal.getUserInput(in);
				animals.add(animal);
				break;
			}
			else if(kind == 3) {
				animal = new InsectsAnimal(AnimalKind.Insects);
				animal.getUserInput(in);
				animals.add(animal);
				break;
			}
			else if(kind == 4) {
				animal = new FishAnimal(AnimalKind.Fish);
				animal.getUserInput(in);
				animals.add(animal);
				break;
			}
			else {
				System.out.print("Select num 1, 2, 3, or 4 for Animal Kind: ");
			}
		}
		
		
		
	
	}
	public void deleteAnimal() {
		System.out.print("Animal name: ");
		String animalname = in.next();
		int index = -1;
		for (int i = 0; i<animals.size(); i++) {
			if (animals.get(i).getName().equals(animalname) ) {
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
			if (animal.getName().equals(animalname)) {
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
						String name = in.next();
						animal.setName(name);

					}
					else if (num == 2) {
						System.out.print("Animal weight: ");
						int weight = in.nextInt();
						animal.setWeight(weight);
					}
					else if (num == 3) {
						System.out.print("Animal height: ");
						int height = in.nextInt();
						animal.setHeight(height);
					}
					else if (num == 4) {
						System.out.print("Animal habitat: ");
						String habitat = in.next();
						animal.setHabitat(habitat);
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
		System.out.println(" # of registered animals:" + animals.size());
		for (int i = 0; i<animals.size(); i++) {
			animals.get(i).printInfo();
		}


	} 
}
