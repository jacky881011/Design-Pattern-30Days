public class RichPerson implements IBuyHouse{
    @Override
    public void findHouse(){
        System.out.println("我那麼有錢當然是買內湖區的房子！");
    }

    @Override
    public void priceTooHigh(){
        System.out.println("我那麼有錢真的是小事啦！");
    }

    @Override
    public void defendPrice(){
        System.out.println("隨便你啦！");
    }

    @Override
    public void finish(){
        System.out.println("直接下單免煩惱了");
    }

}
