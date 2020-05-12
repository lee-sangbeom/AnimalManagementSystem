package animal;

import java.util.Scanner;

public abstract class MiddleSizeAnimal extends Animal {

	public MiddleSizeAnimal(AnimalKind kind) {
		super(kind);
	}
	@Override
	public abstract void getUserInput(Scanner in);

	@Override
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:"+ skind + "name:" + this.name + " weight:" + this.weight +"kg"+ " height:" + this.height + "m" + " habitat:" + this.habitat);
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
	
	public void setAnimalWingwithYN(Scanner in) {
		char answer = 'x';
		while (answer != 'y' && answer != 'n' && answer != 'Y' && answer != 'N' ) {
			System.out.println("Do you have wings? (Y/N)");
			answer = in.next().charAt(0);
			if(answer == 'Y' || answer == 'y') {
				setAnimalWeight(in);
				setAnimalHeight(in);
				setAnimalHabitat(in);
				
				break;
			}
			else if(answer == 'N' || answer == 'n') {
				this.setWeight(0);
				this.setHeight(0);
				this.setHabitat("");
				break;
			}
			else {
			}
		}
	}
	public void setAnimalWaterYN(Scanner in) {
		char answer = 'x';
		while (answer != 'y' && answer != 'n' && answer != 'Y' && answer != 'N' ) {
			System.out.println("Do you live in the water? (Y/N)");
			answer = in.next().charAt(0);
			if(answer == 'Y' || answer == 'y') {
				setAnimalWeight(in);
				setAnimalHeight(in);
				setAnimalHabitat(in);

				break;
			}
			else if(answer == 'N' || answer == 'n') {
				this.setWeight(0);
				this.setHeight(0);
				this.setHabitat("");
				break;
			}
			else {
			}
		}

		
	}
	
}
