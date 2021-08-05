
// 利用被翻譯出來的介面，讓繼承的物件都可以使用

public class TaiwanMan {

    private People people;

    public TaiwanMan(People people){
        this.people = people ;
    }

    public void hello(){
        people.hello();
    }

    public void selfIntro(){
        people.selfIntro();
    }
}
