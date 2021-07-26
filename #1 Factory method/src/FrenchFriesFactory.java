public class FrenchFriesFactory implements Factory{

    //返回一般的薯條和 一般size的薯條
    @Override
    public Product getProduct(){
        return new FrenchFries();
    }

    //返回我們想要狀態的薯條
    public Product getProduct(String state,Integer size){
        return new FrenchFries(state,size);
    }
}
