import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = 5;
		while(num != 6) {
			System.out.println("*** Animal Management System Menu ***");
			System.out.println("1.Add Animal");
			System.out.println("2.Delete Animal");
			System.out.println("3.Edit Animal");
			System.out.println("4.View Animal");
			System.out.println("5.Show a menu");
			System.out.println("6.Exit");
			System.out.println("Select one number between 1~5 :");
			num = in.nextInt();
			if (num == 1) {
				addAnimal();
			}
			else if (num == 2) {
				deleteAnimal();
			}
			else if (num == 3) {
				editAnimal();
			}
			else if (num == 4) {
				viewAnimal();
			}
			else {
				continue;
			}
		}
	}
	public static void addAnimal() {
		Scanner in = new Scanner(System.in);
		System.out.print("Animal name: ");
		String animalname = in.next();
		System.out.println("Animal weight: ");
		int animalweight = in.nextInt();
		System.out.println("Animal height: ");
		int animalheight = in.nextInt();
		System.out.println("Animal habitat: ");
		String animalhabitat = in.next();
	}
	public static void deleteAnimal() {
		Scanner in = new Scanner(System.in);
		System.out.print("Animal name: ");
		String animalname = in.next();
	}
	public static void editAnimal() {
		Scanner in = new Scanner(System.in);
		System.out.print("Animal name: ");
		String animalname = in.next();
	}
	public static void viewAnimal() {
		Scanner in = new Scanner(System.in);
		System.out.print("Animal name: ");
		String animalname = in.next();
	}

}
