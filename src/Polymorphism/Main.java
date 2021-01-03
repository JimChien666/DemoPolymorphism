package Polymorphism;

public class Main {
	public static void main(String[] args) {
		Animal[] animals = new Animal[] {new Cat("貓"), new Dog("狗")};
		
		for(Animal animal: animals) {
			System.out.println(animal.getName()+":");
			animal.talk();
		}
	}
}
