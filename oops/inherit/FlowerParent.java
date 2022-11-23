package oops.inherit;

public class FlowerParent extends FlowerParent1  {

    protected String name;

    public FlowerParent(String name) {
        this(10);
        this.name=name;
       // this.name = name;
        System.out.println("FlowerParent constructor");
    }

    public FlowerParent(int i){
        System.out.println("FlowerParent Default Constructor");
    }

    public FlowerParent() {
    }

    public void color(){
    System.out.println(" is pink color");
}
}





