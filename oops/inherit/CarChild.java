package oops.inherit;

public class CarChild extends VehicleParent{

    public CarChild(String name){
        this.name=name;
    }

    public void display(){

        System.out.println("Displayed is called");
    }
}
