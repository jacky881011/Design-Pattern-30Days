public class Tea extends Drink {
    TeaType tea;

    public Tea(SugerType sugerType , IceType iceType){
        super(sugerType , iceType);
    }

    public void setTeaType(TeaType teaType){
        this.tea = teaType;
    }
    public TeaType getTeaType(){
        return  tea;
    }

    public void Show_Tea(){
        System.out.println("You order the "+ getTeaType()+"\nSuger: "+suger+"\n"+"Ice: "+ice+"\n");
    }


    enum TeaType{
        LEMON , OOLONG , GINGER , HONEY
    }
}
