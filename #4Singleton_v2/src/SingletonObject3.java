
// 試著用雙重鎖實現

public class SingletonObject3 {
    public static SingletonObject3 instance = new SingletonObject3();

    private SingletonObject3(){}

    public static SingletonObject3 getInstance(){

        // 第一層判斷是要去避免不必要的同步
        if(instance == null){
            synchronized (SingletonObject3.class){
                // 第二層的判斷為了在null的狀況下建立實例
                if(instance == null){
                    instance = new SingletonObject3();     // 1. 給Singleton的實例分配記憶體 2. 呼叫Singleton的建構函數，初始化成員欄位； 3. 將instance物件指向分配的記憶體空間(此時instance不是null)。
                }
            }
        }
        return instance;
    }
}
