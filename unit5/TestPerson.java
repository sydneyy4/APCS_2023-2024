public class TestPerson{
	public static void main (String [] args){
		Person sydney = new Person("Sydney", 1);
		System.out.println(sydney.accessName());
		System.out.println(sydney.accessPets());
		System.out.println(sydney.greeting());
	}
}