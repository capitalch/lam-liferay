public interface Animal {
    void makeSound();
}
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Cow implements Animal {
    public void makeSound() {
        System.out.println("Moo");
    }
}
