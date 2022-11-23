package oops.inherit;

public class InheritDemo {
    public static void main(String[] args) {

        AnimalParent p = new AnimalParent();
        p.run();

        DogChild dogChild=new DogChild();
        dogChild.display();
        dogChild.run(); // overrides parent class run method
        dogChild.bark();

    }
}
