package oops.ood.bike;


import java.util.List;

public class Bike {


    EngineBike engineBike;
    HornBike hornbike;
    List<SeatBike> bikeseats;
    HandlebarBike handlebarBike;
    List<TyreBike> biketyres;

    List<MirrorBike> mirrorBikes;

    public Bike(EngineBike enginebike,
                HornBike hornbike, List<SeatBike> bikeseats,
                HandlebarBike handlebarBike, List<TyreBike> biketyres, List<MirrorBike> mirrorBikes) {

        this.engineBike = enginebike;
        this.hornbike = hornbike;
        this.bikeseats = bikeseats;
        this.handlebarBike = handlebarBike;
        this.biketyres = biketyres;

    }

    public void drive() {

        System.out.println("driving now");
    }

}


