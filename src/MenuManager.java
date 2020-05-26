import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		AnimalManager animalManager = getObject("animalmanager.ser");
		if (animalManager == null) {
			animalManager = new AnimalManager(in);
		}
		else {
			animalManager.setScanner(in);
		}		
		
		selectMenu(in, animalManager);
		putObject(animalManager, "animalmanager.ser");
		
	} 

	public static void selectMenu(Scanner in,AnimalManager animalManager ) {
		int num = -1;
		while(num != 5) {
			try {
			showMenu(); 
			num = in.nextInt();
			switch(num) {
			case 1:
				animalManager.addAnimal();
				logger.log("add an animal");
				break;
			case 2:	
				animalManager.deleteAnimal();
				logger.log("delete an animal");
				break;
			case 3:
				animalManager.editAnimal();
				logger.log("edit an animal");
				break;
			case 4:
				animalManager.viewAnimals();
				logger.log("view an animal");
				break;	
			default:
				continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if (in.hasNext()) {
					in.next();
				}
				num= -1;
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
	
	public static AnimalManager getObject(String filename) {
		AnimalManager animalManager = null;
		
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			animalManager = (AnimalManager)in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return animalManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return animalManager;		
	}
	public static void putObject(AnimalManager animalManager,String filename) {

		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(animalManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
}
