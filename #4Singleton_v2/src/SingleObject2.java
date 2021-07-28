
// 試著實現一個懶散單例模式
// ( 但是這個實現方式每次都需要進行同步，效率會很很低。)

public class SingleObject2 {

    private static  SingleObject2 singleObject2;

    //私有的建構式讓別人不可以創造任何物件
    private SingleObject2(){}

    // 因為整個系統都要存取這個類別，很可能有多個process或thread同時存取
    // 為了讓線程安全添加synchronized在多線程下確保物件唯一性

    public static synchronized SingleObject2 getInstance(){
        if(singleObject2 == null) {
            singleObject2 = new SingleObject2();
        }
        return  singleObject2;
    }



}
