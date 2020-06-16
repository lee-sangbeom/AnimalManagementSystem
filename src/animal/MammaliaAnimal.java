package animal;

import java.util.Scanner;

public class MammaliaAnimal extends Animal {

	public MammaliaAnimal(AnimalKind kind) {
		super(kind);
	}
	public void getUserInput(Scanner in) {
		setAnimalName(in);
		setAnimalWeight(in);
		setAnimalHeight(in);
		setAnimalHabitat(in);
	}
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:"+ skind + "name:" + this.name + " weight:" + this.weight +" kg"+ " height:" + this.height + " cm" + " habitat:" + this.habitat);
	}
	public String getKindString() {
		String skind = "none";
		switch(this.kind) {
		case Mammalia:
			skind = "Mamma";
			break;
		case Birds:
			skind = "Bird";
			break;
		case Insects:
			skind = "Insect";
			break;		
		case Fish:
			skind = "Fish";
			break;
		default:

		}
		return skind;
	}

}
