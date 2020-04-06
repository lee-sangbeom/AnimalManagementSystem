import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		AnimalManager animalManager = new AnimalManager(in);

		int num = -1;
		while(num != 5) {
			System.out.println("*** Animal Management System Menu ***");
			System.out.println("1.Add Animal");
			System.out.println("2.Delete Animal");
			System.out.println("3.Edit Animal");
			System.out.println("4.View Animal");
			System.out.println("5.Exit");
			System.out.println("Select one number between 1~5 :");
			num = in.nextInt();
			if (num == 1) {
				animalManager.addAnimal();
			}
			else if (num == 2) {
				animalManager.deleteAnimal();
			}
			else if (num == 3) {
				animalManager.editAnimal();
			}
			else if (num == 4) {
				animalManager.viewAnimal();
			}
			else {
				continue;
			}
		}
	}  
}
