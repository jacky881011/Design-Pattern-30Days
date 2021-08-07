
// 介面的實作方式 : 去繼承轉接的介面，使用其方法(抽象的類別)

public class BlackmanTranslator extends People{
    public BlackmanTranslator(String name){
        super(name);
    }
    @Override
    public void hello(){
        System.out.println(getName()+":哩甲霸咩～真的假的！？ ");
    }
    @Override
    public void selfIntro(){
        System.out.println("大家好我是"+getName()+"，現在在台北工作。");
    }


}
