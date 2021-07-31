public class FrenchFries implements Product{
    String state = "have salt";
    Integer size = 2;

    //預設的建構
    protected FrenchFries(){ }

    // 帶入狀態的建構
    protected FrenchFries(String state, Integer size){
        this.state = state;
        this.size = size;
    }

    // 採用介面必須要去覆寫其方法
    @Override
    public void describe(){
        System.out.println("I'm "+ state +" FrenchFries"+" , size is "+size);
    }



}
