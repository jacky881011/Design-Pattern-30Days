
// 介面 (Target) : 目的是要去提供轉換，利用抽象的類別(介面)

public abstract class People {
    String name ;
    public People(String name){
        this.name = name;
    }

    public abstract void hello();

    public abstract void selfIntro();

    public String getName(){
        return name;
    }
}
