package Polymorphism;

public class AnimalSoundMain {

	public static void main(String[] args) {
		AnimalSound obj1 = new dog();
		obj1.sound();
		AnimalSound obj2 = new cat();
		obj2.sound();

	}

}
