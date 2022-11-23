package oops.ood.bike;

import java.util.ArrayList;
import java.util.List;

public class FactoryBike {


    public static void main(String[] args) {

        List<SeatBike> bikeseats = new ArrayList<>();
        bikeseats.add(new SeatBike());

        EngineBike enginebike = new EngineBike();

        HornBike hornbike = new HornBike();

        HandlebarBike handlebarBike = new HandlebarBike();

        List<MirrorBike> mirrorBikes=new ArrayList<>();
        mirrorBikes.add(new MirrorBike());

        List<TyreBike> biketyres = new ArrayList<>();
        biketyres.add(new TyreBike());
        biketyres.add(new TyreBike());

        Bike bike1 = new Bike(enginebike,hornbike,bikeseats,handlebarBike,biketyres,mirrorBikes);
        bike1.drive();

        Bike bike2=new Bike(enginebike,hornbike,bikeseats,handlebarBike,biketyres,mirrorBikes);
        bike1.drive();

        List<SeatBike> bikeseats1 = new ArrayList<>();
        bikeseats1.add(new SeatBike());

        EngineBike enginebike1 = new EngineBike();

        HornBike hornbike1 = new HornBike();

        HandlebarBike handlebarBike1 = new HandlebarBike();

        List<MirrorBike> mirrorBikes1=new ArrayList<>();
        mirrorBikes.add(new MirrorBike());

        List<TyreBike> biketyres1 = new ArrayList<>();
        biketyres.add(new TyreBike());
        biketyres.add(new TyreBike());


    }
}


