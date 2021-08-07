
// CareTaker : 負責保存備忘錄(memoto)的類別。


import java.util.ArrayList;
import java.util.List;

public class ComputerCareTaker {

    // 最多備份15筆資料
    private static  final  int MAX = 15;
    public List<ComputerMemoto> saves = new ArrayList<>();



    // 獲取電腦資訊
    public ComputerMemoto getSave(int index){
        if( index > saves.size() - 1)   // 因為式從零開始 saves.size() - 1 所以要去扣掉一
        {
            index = saves.size() - 1;
        }

        return  saves.get(index);           // list.get(value) 取得其中index的資料
    }

    public void saveMemoto(ComputerMemoto memoto){
        if(saves.size() > MAX){
            saves.remove(0);
        }
        saves.add(memoto);

    }
}
