public abstract class BossMethod {

    // Boss's Opinion
    private String bossThink(){
        return "我覺得呢，這個東西應該要這樣子做這樣子做。";
    }

    // Boss's object to your idea
    private  String bossReject(){
        return "我覺得你們需要重做，因為跟我想的不一樣";
    }

    abstract String UI_Design();

    abstract String systemAnalysis();

    abstract String systemDesign();

    abstract String programming();

    abstract String test();

    // 顯示結果的部分
    public void completeSoftware(){
        System.out.println(
                bossThink() + UI_Design() + "\n"+
                        bossThink() + systemAnalysis() + "\n"+
                        bossThink() + systemDesign() + "\n"+
                        bossThink() + programming() + "\n"+
                        bossThink() + test()
        );
    }

    public void rejectSoftware(){
        System.out.println(bossReject());
        completeSoftware();
    }
}
