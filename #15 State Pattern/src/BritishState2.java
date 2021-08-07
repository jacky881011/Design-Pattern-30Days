public class BritishState2 extends State{
    //    公制資料顯示成英制
    @Override
    public String tempToDisplay(Double temperature){
        System.out.println("顯示英制");
        return twoDecPlaces(temperature*9/5+32);
    }

    @Override
    public String vibToDisplay(Double vibration){
        System.out.println("顯示英制");
        return twoDecPlaces(vibration*25.4);
    }

    //    英制資料儲存成公制
    @Override
    public String tempToSave(Double temperature){
        System.out.println("儲存英制");
        return saveForm((temperature - 32) * 5/9);
    }

    @Override
    public String vibToSave(Double vibration){
        System.out.println("儲存英制");
        return saveForm(vibration/25.4);
    }


}
