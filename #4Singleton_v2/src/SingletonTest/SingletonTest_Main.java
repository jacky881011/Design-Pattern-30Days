package SingletonTest;

public class SingletonTest_Main extends Thread{
    String myId;
    public SingletonTest_Main(String Id){
        myId = Id;
    }

    // 執行緒執行的時候就去呼叫Singleton.getInstance()
    public void run(){
        Singleton singleton = Singleton.getInstance();

        if(singleton != null){
            // 用hashCode判斷前後兩次取到的Singleton物件是否為同一個
            System.out.println(myId + "產生 Singleton: "+singleton.hashCode());
        }
    }
    public static  void main(String args[]){
        /*
        // 單行緒的時候，s1與s2確實為同一個物件
        Singleton s1  =  Singleton.getInstance();
        Singleton s2  =  Singleton.getInstance();
        System.out.println("s1:"+s1.hashCode() + " s2:" + s2.hashCode());
        System.out.println();
        */

        // 兩個執行緒同時執行 (造成兩個執行續彼此衝突)
        Thread t1 = new SingletonTest_Main("執行緒T1"); // 產生Thread物件
        Thread t2 = new SingletonTest_Main("執行緒T2"); // 產生Thread物件
        t1.start(); // 開始執行t1.run()
        t2.start();


    }

}
