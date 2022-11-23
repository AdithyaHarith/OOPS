package oops.ood.car;

import java.util.ArrayList;
import java.util.List;

public class Factory {
    public static void main(String[] args) {
        List<Door> doors = new ArrayList<>();

        doors.add(new Door());
        doors.add(new Door());
        doors.add(new Door());
        doors.add(new Door());

       // Object o = new WoodenDoor();

        Engine engine = new Engine();
        Horn horn = new Horn();

        List<Light> lights = new ArrayList<>();
        lights.add(new Light());
        lights.add(new Light());

        List<Seat> seats = new ArrayList<Seat>();
        seats.add(new Seat());
        seats.add(new Seat());
        seats.add(new Seat());

        StearingWheel stearingWheel = new StearingWheel();
        List<Tyre> tyres = new ArrayList<>();
        tyres.add(new Tyre());
        tyres.add(new Tyre());
        tyres.add(new Tyre());
        tyres.add(new Tyre());

        Car car1 = new Car(doors, engine, horn, lights, seats, stearingWheel, tyres);
        car1.drive();

        List<Door> doors2 = new ArrayList<>();
        Engine engine2 = new Engine();
        Horn horn2 = new Horn();
        List<Light> lights2 = new ArrayList<Light>();
        List<Seat> seats2 = new ArrayList<Seat>();
        StearingWheel stearingWheel2 = new StearingWheel();
        List<Tyre> tyres2 = new ArrayList<>();

        Car car2 = new Car(doors2, engine2, horn2, lights2, seats2, stearingWheel2, tyres2);
        car2.drive();



    }
}
