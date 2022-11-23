package oops.inherit.dynamic;

public class VehicleDemo {
    public static void main(String[] args) {
      // Vehicle v = new Vehicle(); // parent // big
//        v.drive();
//        v.gear();

      //  b.drive();

//
//        Train t = new Train();
//        t.putBreak();;
//
//        Vehicle v1 = new Bike(); // implicit casting
//        v1.drive();
//
//        v1 = new Train();
//        v1.drive(); // runtime/dynamic polymorphism
//


//
//        v1.gear();


       // early binding  - static polymorphism - compile time
      //  late binding - dynamic polymorphism - run time

       //  parent class = base class
      //    child class = derived class

        // implicit casting = upcasting
        // explicit casting = downcasting

        Bike b = new Bike();

        Driver d = new Driver();
        d.driveIt(b);


        Train t = new Train();

        d.driveIt(t);


    }
}
