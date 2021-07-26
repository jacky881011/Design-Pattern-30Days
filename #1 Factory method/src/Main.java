public class Main {
    public static void main(String args[]){

        Factory friesFac = new FrenchFriesFactory();
        Product fries = friesFac.getProduct();          // 沒有任何指定的時候
        Product myfries = ((FrenchFriesFactory) friesFac).getProduct("not salt", 3);        //有指定特定的大小與調味等

        fries.describe();
        myfries.describe();

    }
}
