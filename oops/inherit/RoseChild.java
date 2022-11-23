package oops.inherit;

public class RoseChild extends FlowerParent {
    String name;

    public RoseChild(String name) {
       // super(); // calls parent constructor
        this.name=name;
        System.out.println("RoseChild Constructor");
     }

    public void display() {
        System.out.println("display is called");
    }
}

