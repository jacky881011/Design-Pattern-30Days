public class Students implements IObserver {
    IObserverable iObserverable;

    public Students(IObserverable observerable){
        this.iObserverable = observerable;
    }

    @Override
    public void update(){
        System.out.println("聽了 "+ iObserverable.getName());
    }

}
