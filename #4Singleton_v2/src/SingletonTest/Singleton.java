package SingletonTest;

public class Singleton {
    // 一開始就建立物件，這樣只要一直回傳這個物件就是簡單的singleton
    private static Singleton instance = new Singleton();

    // private constructor，這樣其他物件就沒辦法直接用new來取得新的實體
    private Singleton(){}

    /*
    public static Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
        }
        return Singleton.instance;
    }*/

    // Use Double lock
    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if( instance == null){
                    instance = new Singleton();
                }
            }
        }
        return  instance;
    }

}
