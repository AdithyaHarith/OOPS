package oops.inherit;

public class SportsDemo {
    public static void main(String[] args) {
        SportsParent sp=new SportsParent();
        sp.swim();

        SportsChild sc=new SportsChild();
        sc.swim();
    }

}
