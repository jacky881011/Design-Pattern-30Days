public abstract class Drink {
    SugerType suger;
    IceType ice;

    private  Drink(){}   //預設的結構

    public Drink(SugerType sugerType,IceType iceType ){
        this.suger = sugerType;
        this.ice = iceType;
    }

    public SugerType getSuger(){
        return suger;
    }

    public IceType getIce(){
        return  ice;
    }

    public void setSuger(SugerType sugerType) {
        this.suger = sugerType;
    }

    public void setIce(IceType iceType){
        this.ice = iceType;
    }

    // 設定所需要的 冰塊多寡 甜度多少
    enum SugerType{
        REGULAR , LESS , HALF , QUARTER , FREE
    }
    enum IceType{
        REGULAR , EAZY , FREE , HOT
    }



}

