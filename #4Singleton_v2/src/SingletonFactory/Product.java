package SingletonFactory;
// 產品和工廠介面

public abstract class Product {
    public String getName(){
        return this.getClass().getSimpleName();
    }


}
