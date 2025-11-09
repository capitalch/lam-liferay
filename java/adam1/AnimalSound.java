public class AnimalSound {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        Animal cow = new Cow();
        myDog.makeSound(); // Outputs: Woof
        myCat.makeSound(); // Outputs: Meow
        cow.makeSound();   // Outputs: Moo
    }
}
