package animal;

import java.util.Scanner;

import exception.NameFormatException;

public interface AnimalInput {

	public String getName();
	
	public void setName(String name) throws NameFormatException;
	
	public void setWeight(int weight);
	
	public int getWeight();
	
	public void setHeight(int height);
	
	public int getHeight();
	
	public void setHabitat(String habitat);
	
	public String getHabitat();
	
	public void getUserInput(Scanner in);
	
	public void printInfo();	
	
	public void setAnimalName(Scanner in);
	
	public void setAnimalWeight(Scanner in);
	
	public void setAnimalHeight(Scanner in);
	
	public void setAnimalHabitat(Scanner in);
}
