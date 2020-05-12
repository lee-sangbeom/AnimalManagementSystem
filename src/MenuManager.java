import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		AnimalManager animalManager = new AnimalManager(in);

		int num = -1;
		while(num != 5) {
			showMenu(); 
			num = in.nextInt();
			switch(num) {
			case 1:
				animalManager.addAnimal();
				break;
			case 2:	
				animalManager.deleteAnimal();
				break;
			case 3:
				animalManager.editAnimal();
				break;
			case 4:
				animalManager.viewAnimals();
				break;	
			default:
				continue;
			}
		}
	} 

	public static void showMenu() {
		System.out.println("*** Animal Management System Menu ***");
		System.out.println("1.Add Animal");
		System.out.println("2.Delete Animal");
		System.out.println("3.Edit Animal");
		System.out.println("4.View Animals");
		System.out.println("5.Exit");
		System.out.println("Select one number between 1~5 :");
	}
}
