public class Coffee extends Drink{
    CoffeeType coffee;

    public Coffee(SugerType sugerType , IceType iceType){
        super(sugerType , iceType);
    }

    public void setCoffeeType( CoffeeType coffeeType){
        this.coffee = coffeeType ;
    }

    public CoffeeType getCoffeeType(){
        return  coffee;
    }




    enum CoffeeType{
        ATTE,MOCHA,WHITE,BLUE_MOUNTAIN,AMERICANO,ESPRESSO
    }
}
