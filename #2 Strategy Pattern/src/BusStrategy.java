public class BusStrategy implements IStrategy2{
    // 一段票 15元
    // 十公里內算一段票，超過10公里為兩段票

    @Override
    public int calculate(int km){
        int count = 0;
        if(km < 10){
            count =1;
        }
        else if( km >=10){
            count = 2;
        }

        return  count*15;

    }
}


