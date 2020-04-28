package animal;

import java.util.Scanner;

public class InsectsAnimal extends Animal {
	
	public InsectsAnimal(AnimalKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner in) {
		System.out.print("Animal name: ");
		String name = in.next();
		this.setName(name);

		char answer = 'x';
		while (answer != 'y' && answer != 'n' && answer != 'Y' && answer != 'N' ) {
			System.out.println("Is the body divided into the head and the chest? (Y/N)");
			answer = in.next().charAt(0);
			if(answer == 'Y' || answer == 'y') {
				System.out.print("Animal weight: ");
				int weight = in.nextInt();
				this.setWeight(weight);
				System.out.print("Animal height: ");
				int height = in.nextInt();
				this.setHeight(height);
				System.out.print("Animal habitat: ");
				String habitat = in.next();
				this.setHabitat(habitat);
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
		System.out.println("kind:"+ skind + "name:" + this.name + " weight:" + this.weight +"kg"+ " height:" + this.height + "m" + " habitat:" + this.habitat);
 	}
}


