/*
3.Utilize an abstract class named Animal, featuring abstract methods sound() and move(), to 
design concrete subclasses such as Dog, Cat, and Bird that inherit from Animal and implement 
the necessary methods?
 */
package Assignment6;

abstract class Animal {

	abstract void sound();

	abstract void move();
}

class Dog extends TestAnimal {

	public void sound() {

		System.out.println("The Dog Barks....");
	}

	public void move() {
		System.out.println("Dog will walk....");
	}

}

class Cat extends TestAnimal {
	public void sound() {
		System.out.println("The Cat Meows...");
	}

	public void move() {
		System.out.println("Cat will walk....");
	}

}

class Bird extends TestAnimal {

	void sound() {
		System.out.println("The bird chirps..");
	}

	void move() {
		System.out.println("Bird will flies...");

	}

}

public class TestAnimal {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		dog.move();
		System.out.println("===================");
		Cat cat = new Cat();
		cat.sound();
		cat.move();
		System.out.println("===================");
		Bird bird = new Bird();
		bird.sound();
		bird.move();

	}
}