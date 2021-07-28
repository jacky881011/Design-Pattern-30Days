package OrderSystem;

import SeatSystem.NormalSeat;
import SeatSystem.SeatChoose;

public class NormalUser implements UserOrder {

    public SeatChoose chooseSeat(){
        System.out.println("You are a normal person");
        return new NormalSeat();
    }

}
