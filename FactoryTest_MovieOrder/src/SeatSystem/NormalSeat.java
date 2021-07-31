package SeatSystem;

public class NormalSeat implements SeatChoose{
    int seat_num=300;



    @Override
    public String getSeat(){
        seat_num = seat_num-1;
        System.out.println("Only last: "+seat_num+" seats");
        return "You are a normal seat";
    }
}
