
// 試著實現一個積極單例模式

public class SingleObject {
    //創建SingleObject 的一個對象
    private static SingleObject instance = new SingleObject();

    //將構造函數( Constractor )設為Private，這樣就不會被實例化
    private  SingleObject(){}

    //獲取唯一可以用的對象
    public static  SingleObject getInstance(){
        return instance;
    }

}
