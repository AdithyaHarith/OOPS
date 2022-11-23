package oops;

public class General {
    public static void main(String[] args) {
        Car car1 = new Car("xyz") ; // non-primitive user defined

        Car car2 = car1;

        Bird b = new Bird("b1", 4);

        Bird b1 = b;

        int val1 = 10;

      //  String s = val1;

        long val2 = val1;

        short s = (short) val1;


       // Car car2 = new Car();
       // car1.name="i10";
      //  car1.brand="hyundai";

        car1.drive();

        car1.brake(10); // static polymorphism

        car1.brake("test");

      //  Car car2 = new Car("xyz");
       // car2.name="xyz";
      //  car2.brand="benz";

//        car2.drive();
//        car2.brake();

  // syntax      class-name object-name = new class-name()
    }
}
