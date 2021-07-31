public class Main {
    public static void main(String args[]){
        IObserverable prodcast = new ProdcastA();
        IObserver student = new Students(prodcast);
        IObserver student2 = new Students(prodcast);

        prodcast.add(student);

        //預設節目是英文廣播
        prodcast.notifyObservers();

        //新增節目變更為今年流行歌曲
        ((ProdcastA) prodcast).name = "今年流行歌";      // 變更類別內的 name
        prodcast.notifyObservers();


        prodcast.add(student2);
        System.out.println("新增物件 Student2");
        prodcast.notifyObservers();





    }
}
