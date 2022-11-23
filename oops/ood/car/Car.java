package oops.ood.car;

import java.security.PublicKey;
import java.util.List;

public class Car {
   List<Door> doors;
   Engine engine;
   Horn horn;
   List<Light> lights;
   List<Seat> seats;
   StearingWheel sWheel;
   List<Tyre> tyres;

   public Car(List<Door> doors, Engine engine,
              Horn horn, List<Light> lights, List<Seat> seats,
              StearingWheel sWheel, List<Tyre> tyres){
     this.doors= doors;
     this.engine=engine;
     this.horn=horn;
     this.lights=lights;
     this.seats=seats;
     this.sWheel=sWheel;
     this.tyres=tyres;

   }

   public void drive() {
       System.out.println("driving now");
   }

}
