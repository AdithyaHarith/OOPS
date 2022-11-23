package oops.inherit;

public class ShopChild extends ShopParent{
    public int calculateAmount() {
        int TotalAmount=5000;
        int Discount=TotalAmount-100;
        return Discount;
    }
}
