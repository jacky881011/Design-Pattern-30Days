import Calculator.ChooseFunction;
import Calculator.FunctionSelect;
import OrderSystem.DisableUser;
import OrderSystem.NormalUser;
import OrderSystem.UserOrder;
import SeatSystem.SeatChoose;

public class Main {
    public static void main(String args[]){
        UserOrder member1 = new NormalUser();
        SeatChoose seat1 = member1.chooseSeat();
        System.out.println(seat1.getSeat());

        UserOrder member2 = new DisableUser();
        SeatChoose seat2 = member2.chooseSeat();
        System.out.println(seat2.getSeat());

        UserOrder member3 = new NormalUser();
        SeatChoose seat3 = member3.chooseSeat();
        System.out.println(seat3.getSeat());



        // Choose want the method

        FunctionSelect select_add = ChooseFunction.chooseFunction("add");
        int ans = select_add.inputVariable(4,5);
        System.out.println("The answer is: "+ ans);

        FunctionSelect select_divide = ChooseFunction.chooseFunction("Divide");
        int ans2 = select_divide.inputVariable(10,5);
        System.out.println("The answer is: "+ ans2);






    }
}
