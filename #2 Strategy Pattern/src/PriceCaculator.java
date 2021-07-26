public class PriceCaculator {
    IStrategy2 strategy2;
    private  PriceCaculator(){};

    public PriceCaculator(IStrategy2 strategy2){
        this.strategy2 = strategy2;
    }

    public void setStrategy2(IStrategy2 strategy2){
        this.strategy2 = strategy2;

    }

    public int calculate(int km){
        return this.calculate(km, strategy2);
    }

    public int calculate(int km, IStrategy2 strategy2){
        this.strategy2 = strategy2;
        return  strategy2.calculate(km);
    }
}
