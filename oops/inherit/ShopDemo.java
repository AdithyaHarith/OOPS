package oops.inherit;

public class ShopDemo {
    public static void main(String[] args) {
        ShopParent sp=new ShopParent();
        System.out.println(sp.calculateAmount());

        ShopChild sc=new ShopChild();
        System.out.println(sc.calculateAmount());
    }
}
