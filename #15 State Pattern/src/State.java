public abstract class State {

    //顯示數值
    abstract  public String tempToDisplay(Double temperature);
    abstract  public String vibToDisplay(Double vibration);

    // 儲存的數值
    abstract  public String tempToSave(Double temperature);
    abstract  public String vibToSave(Double vibration);



    public static String twoDecPlaces(Double value){
        return String.format("%.2f" , value);
    }

    public static String saveForm(Double value){
        return String.format("%f",value);
    }

}
