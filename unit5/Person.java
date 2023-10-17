public class Person{
	private String name;
	private int pets;

	public Person (String name, int pets){ //constructor is always public & never had return type
		this.name = name;
		this.pets = pets;
		//constructor only initializes the global variables
	}
	//function accesses private variables
	//public accessor functions
	public String accessName(){
		return this.name;
	}
	public int accessPets(){
		return this.pets;
	}
	//public member function
	public String greeting(){
		return ("Hello, my name is " + this.name + " and I have " + this.pets + " pets.");
	}
}