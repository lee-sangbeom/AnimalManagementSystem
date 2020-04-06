
public class Animal {

	String name;
	int weight;
	int height;
	String habitat;

	public Animal() {
		
	}
	
	public Animal(String name) {
		this.name = name;
		
	}
	public Animal(String name, int weight, int height, String habitat) {
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.habitat = habitat;
	}
	
	public void printInfo() {
		System.out.println("name:" + name + " weight:" + weight + " height:" + height + " habitat:" + habitat);
 	}
}