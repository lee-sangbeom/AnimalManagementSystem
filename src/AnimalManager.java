import java.util.ArrayList;
import java.util.Scanner;

import animal.Animal;
import animal.AnimalInput;
import animal.AnimalKind;
import animal.BirdsAnimal;
import animal.FishAnimal;
import animal.InsectsAnimal;
import animal.MammaliaAnimal;

public class AnimalManager {
	ArrayList<AnimalInput> animals = new ArrayList<AnimalInput>();
	Scanner in;
	AnimalManager(Scanner in){
		this.in = in;
	}
	public void addAnimal() {
		int kind = 0;
		AnimalInput animalInput;
		while(kind != 1 && kind !=2) {

			System.out.println("1 for Mammalia ");
			System.out.println("2 for Birds ");
			System.out.println("3 for Insects ");
			System.out.println("4 for Fish ");
			System.out.print("Select num 1, 2, 3, or 4 for Animal Kind: ");
			kind = in.nextInt();
			if(kind == 1) {
				animalInput = new MammaliaAnimal(AnimalKind.Mammalia);
				animalInput.getUserInput(in);
				animals.add(animalInput);
				break;
			}
			else if(kind == 2) {
				animalInput = new BirdsAnimal(AnimalKind.Birds);
				animalInput.getUserInput(in);
				animals.add(animalInput);
				break;
			}
			else if(kind == 3) {
				animalInput = new InsectsAnimal(AnimalKind.Insects);
				animalInput.getUserInput(in);
				animals.add(animalInput);
				break;
			}
			else if(kind == 4) {
				animalInput = new FishAnimal(AnimalKind.Fish);
				animalInput.getUserInput(in);
				animals.add(animalInput);
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
		int index = findIndex(animalname);
		removefromAnimals(index, animalname);
	}
	
	public int findIndex(String animalname) {
		int index = -1;
		for (int i = 0; i<animals.size(); i++) {
			if (animals.get(i).getName().equals(animalname) ) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromAnimals(int index, String animalname) {
		if(index >= 0) {
			animals.remove(index);
			System.out.println("the animal" + animalname + "is deleted");
			return 1;
		}
		else {
			System.out.println("the animal has not been registered");
			return -1;
		}
	}
	public void editAnimal() {
		System.out.print("Animal name: ");
		String animalname = in.next();
		for (int i = 0; i<animals.size(); i++) {
			AnimalInput animal = animals.get(i);
			if (animal.getName().equals(animalname)) {
				int num = -1;
				while(num != 5) {
					showEditMenu();
					num = in.nextInt();
					switch(num) {
					case 1:
						animal.setAnimalName(in);
						break;
					case 2:
						animal.setAnimalWeight(in);
						break;
					case 3:
						animal.setAnimalHeight(in);
						break;
					case 4:
						animal.setAnimalHabitat(in);
						break;
					default:
						continue;
					}
					
				} //while
				break;
			} // if

		}// for
	}
	public void viewAnimals() {
		
		System.out.println(" # of registered animals:" + animals.size());
		for (int i = 0; i<animals.size(); i++) {
			animals.get(i).printInfo();
		}
	} 
	

	public void showEditMenu() {
		System.out.println("** Animal Management System Menu **");
		System.out.println("1.Edit Name");
		System.out.println("2.Edit Weight");
		System.out.println("3.Edit Height");
		System.out.println("4.Edit Habitat");
		System.out.println("5.Exit");
		System.out.println("Select one number between 1~5 :");
	}
}
