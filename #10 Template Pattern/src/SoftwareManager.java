public class SoftwareManager extends BossMethod{
    @Override
    public String UI_Design(){
        System.out.println("找一個UI Designer去做");
        return "UI 成果";
    }

    @Override
    public String systemAnalysis(){
        System.out.println("找一個軟體分析師去做");
        return "軟體分析成果";
    }

    @Override
    public String systemDesign(){
        System.out.println("找一個系統設計師去做");
        return "系統設計成果";
    }

    @Override
    public String programming(){
        System.out.println("找一個軟體工程師去做");
        return "程式成果";
    }

    @Override
    public String test(){
        System.out.println("找一個tester去測試");
        return "測試成果";
    }

}
