import java.util.ArrayList;
import java.util.List;

public class ProdcastA implements IObserverable{
    List<IObserver> list = new ArrayList<>();

    //節目名稱
    String name = "預設英文廣播A";

    @Override
    public void add(IObserver observer)
    {
        list.add(observer);
    }

    @Override
    public void remove(IObserver observer)
    {
        list.remove(observer);
    }

    @Override
    public String getName()
    {
        return this.name;
    }



    @Override  
    public void notifyObservers()
    {
        for(IObserver o : list)
        {
            o.update();
        }
        System.out.println(list);
    }




}
