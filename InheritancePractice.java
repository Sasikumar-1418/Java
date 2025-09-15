package task.index;

// Parent class
class Animal {
     void sound() {  // non-static to allow overriding
        System.out.println("Animals make a sound");
    }
}

// Child class
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class InheritancePractice {
    public static void main(String[] args) {
        // Parent reference, child object → polymorphism
    	Animal ani = new Dog();
    	ani.sound();

    }
}
