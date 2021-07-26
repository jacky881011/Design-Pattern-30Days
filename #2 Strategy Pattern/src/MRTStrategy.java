public class MRTStrategy implements IStrategy2{
    // 小於10公里為20元 每超過五公里多五元


    @Override
    public int calculate(int km){
        int count = 0;
        if (km<=0)
            return count;

        if(km <10){
            count = 20;
        }
        else if(km>=10){
            count = 20+((km-10)/5)*5;
        }

        return  count;
    }

}