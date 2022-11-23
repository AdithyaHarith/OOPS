package oops.blueprint;

public class Car implements ICar {

    public void drive() {
        System.out.println("Drive");
    }
    public void brake(){
        System.out.println("brake");
    }
    public void gear() {
        System.out.println("gear");
    }
    public void horn(){
        System.out.println("horn");
    }


}
