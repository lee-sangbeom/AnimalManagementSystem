package animal;

import java.util.Scanner;

public class Animal {
	
	protected AnimalKind kind = AnimalKind.Mammalia;
	protected String name;
	protected int weight;
	protected int height;
	protected String habitat;

	public Animal() {
		
	}
	

	public Animal(String name, int weight, int height, String habitat) {
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


	public void setName(String name) {
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

	public void printInfo() {
		System.out.println("name:" + this.name + " weight:" + this.weight + " height:" + this.height + " habitat:" + this.habitat);
 	}
	
	public void getUserInput(Scanner in) {
		System.out.print("Animal name: ");
		String name = in.next();
		this.setName(name);
		
		System.out.print("Animal weight: ");
		int weight = in.nextInt();
		this.setWeight(weight);
		
		System.out.print("Animal height: ");
		int height = in.nextInt();
		this.setHeight(height);
		
		System.out.print("Animal habitat: ");
		String habitat = in.next();
		this.setHabitat(habitat);
		
	}
}