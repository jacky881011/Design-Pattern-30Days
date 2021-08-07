
// RealSubject DoAction()

public class LittleEngineer implements IBuyHouse {

    @Override
    public void findHouse(){
        System.out.println("民生社區機能特好！當然找那邊的房子！");
    }

    @Override
    public void priceTooHigh(){
        System.out.println("現在台灣薪水那麼低，屋主開那麼高賣不掉啦！");
    }

    @Override
    public void defendPrice(){
        System.out.println("未來人口越來越少，我們也是自住而已！打我五折吧！");
    }

    @Override
    public void finish(){
        System.out.println("辛苦還房貸幾十年");
    }




}
