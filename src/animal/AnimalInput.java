package animal;

import java.util.Scanner;

public interface AnimalInput {

	public String getName();
	
	public void setName(String name);
	
	public void setWeight(int weight);
	
	public void setHeight(int height);
	
	public void setHabitat(String habitat);
	
	public void getUserInput(Scanner in);
	
	public void printInfo();	
	
	public void setAnimalName(Scanner in);
	
	public void setAnimalWeight(Scanner in);
	
	public void setAnimalHeight(Scanner in);
	
	public void setAnimalHabitat(Scanner in);
}
