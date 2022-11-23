package oops.blueprint.abs;

public class Dog extends Animal {
    void eating() {
        System.out.println("eating");
    }

    void sleep() { // concrete method
        System.out.println("sleeping");
    }

    void breathing() {
        System.out.println("breathing");
    }

}
