package polymorphismExample;  //overridding runtime polymorphisim

public class OverRiding {

	public void makeSound()
	{
		System.out.println("all animal havethere own sound");
	}
	
	
 class Dog extends Animal{
	 
	 public void makeSound()
	 {
		 System.out.println("BHaooo Bhaoooo");
	 }
 }
 class Cat extends Animal{
	 
	 public void makeSound()
	 {
		 System.out.println("Meowww Meowww");
	 } 
 }
 class  Elephant extends Animal{
	 
	 public void makeSound()
	 {
		 System.out.println("shdjksdhfjd");
	 }
 }
 
	}


package polymorphismExample;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal(); // Create an instance of the outer class

        // Create instances of the inner classes using the outer class instance
        Animal.Dog dog = animal.new Dog();
        Animal.Cat cat = animal.new Cat();
        Animal.Elephant elephant = animal.new Elephant();

        // Call makeSound() method for each object
        dog.makeSound();      // Output will be "BHaooo Bhaoooo"
        cat.makeSound();      // Output will be "Meowww Meowww"
        elephant.makeSound(); // Output will be "shdjksdhfjd"
    }
}
