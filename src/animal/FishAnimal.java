package animal;

import java.util.Scanner;

public class FishAnimal extends MiddleSizeAnimal {
	public FishAnimal(AnimalKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner in) {
		setAnimalName(in);
		setAnimalWaterYN(in); 
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
