public class PriceCaculator {

    IStrategy2 strategy2;                               // 有使用此介面的皆為此物件 所以 Bus 和MRT 若宣告物件就都是此IStrategy2的物件
    private  PriceCaculator(){};

    public PriceCaculator(IStrategy2 strategy2){        // 在建立物件的時候就先記錄好 是何種物件
        this.strategy2 = strategy2;
    }

    public void setStrategy2(IStrategy2 strategy2){
        this.strategy2 = strategy2;

    }

    public int calculate(int km){                       //因為在宣告物件就知道是哪一種物件 所以就可以直接去處理 return 下方宣告的方法 並回傳結果
        return this.calculate(km, strategy2);
    }

    public int calculate(int km, IStrategy2 strategy2){
        this.strategy2 = strategy2;
        return  strategy2.calculate(km);
    }
}
