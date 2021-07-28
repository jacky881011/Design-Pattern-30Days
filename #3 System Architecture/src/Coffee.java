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

    public void Show_coffee(){
        System.out.println("You order the "+ getCoffeeType()+"\nSuger: "+suger+"\n"+"Ice: "+ice+"\n");
    }




    enum CoffeeType{
        ATTE,MOCHA,WHITE,BLUE_MOUNTAIN,AMERICANO,ESPRESSO
    }
}
