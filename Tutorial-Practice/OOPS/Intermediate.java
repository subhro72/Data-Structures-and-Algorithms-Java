package OOPS;

// Parent class
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {

    Dog(String name) {
        super(name); // calling parent constructor
    }

    @Override
    void sound() {
        System.out.println(name + " barks");
    }
}

public class Intermediate {
    public static void main(String[] args) {

        Dog d1 = new Dog("Bruno");
        d1.sound();
    }
}