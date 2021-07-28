package OrderSystem;

import SeatSystem.DisableSeat;
import SeatSystem.SeatChoose;

public class DisableUser implements UserOrder{
    @Override
    public SeatChoose chooseSeat(){
        System.out.println("You are a disable person.");
        return new DisableSeat();
    }

}
