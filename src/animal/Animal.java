package animal;

import java.io.Serializable;
import java.util.Scanner;

import exception.NameFormatException;

public abstract class Animal implements AnimalInput, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 263741550785304333L;
	
	protected AnimalKind kind = AnimalKind.Mammalia;
	protected String name;
	protected int weight;
	protected int height;
	protected String habitat;

	public Animal() {

	}
	public Animal(AnimalKind kind) {
		this.kind = kind;
	}


	public Animal(String name, int weight, int height, String habitat) {
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.habitat = habitat;
	}
	public Animal(AnimalKind kind, String name, int weight, int height, String habitat) {
		this.kind = kind;
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.habitat = habitat;
	}
	public AnimalKind getKind() {
		return kind;
	}


	public void setKind(AnimalKind kind) {
		this.kind = kind;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) throws NameFormatException {
		if (!name.contains("-")) {
			throw new NameFormatException();
		}

		this.name = name;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public String getHabitat() {
		return habitat;
	}


	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}


	public abstract void printInfo(); 

	public void setAnimalName(Scanner in) {
		String name = " ";
		while (!name.contains("-")) {
			System.out.print("Animal name: ");
			name = in.next();
			try {
				this.setName(name);
			} catch (NameFormatException e) {
				System.out.println("Incorrect Name Format. put the name that exclude blank");
			}
		}
	}
	public void setAnimalWeight(Scanner in) {
		System.out.print("Animal weight: ");
		int weight = in.nextInt();
		this.setWeight(weight);
	}

	public void setAnimalHeight(Scanner in) {
		System.out.print("Animal height: ");
		int height = in.nextInt();
		this.setHeight(height);
	}

	public void setAnimalHabitat(Scanner in) {
		System.out.print("Animal habitat: ");
		String habitat = in.next();
		this.setHabitat(habitat);
	}

}
