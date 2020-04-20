package animal;

import java.util.Scanner;

public class BirdsAnimal extends Animal {
	
	public void getUserInput(Scanner in) {
		System.out.print("Animal name: ");
		String name = in.next();
		this.setName(name);
		
		char answer = 'x';
		while (answer != 'y' && answer != 'n' && answer != 'Y' && answer != 'N' ) {
			System.out.println("Do you have wings? (Y/N)");
			answer = in.next().charAt(0);
			if(answer == 'Y' || answer == 'y') {
				System.out.print("Animal weight: ");
				int weight = in.nextInt();
				this.setWeight(weight);
				break;
			}
			else if(answer == 'N' || answer == 'n') {
				this.setWeight(weight);
				break;
			}
			else {
			}
		}
		
		System.out.print("Animal height: ");
		int height = in.nextInt();
		this.setHeight(height);
		
		System.out.print("Animal habitat: ");
		String habitat = in.next();
		this.setHabitat(habitat);
		
	}
}
