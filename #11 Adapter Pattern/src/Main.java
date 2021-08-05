public class Main {

    public static void main(String args[]){
        Blackman blackman = new Blackman("Eric");
        blackman.helloEnglish();
        blackman.selfIntroEnglish();

        System.out.println("\n");

        TaiwanMan taiwanMan = new TaiwanMan(new BlackmanTranslator("Eric")); // 因為BlackmanTranslator有繼承 People 所以可以使用
        taiwanMan.hello();
        taiwanMan.selfIntro();



    }
}
