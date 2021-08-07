public class Main {
    public static  void main(String args[]){
        ComputerCareTaker careTaker = new ComputerCareTaker();
        ComputerOriginator originator = new ComputerOriginator();

        careTaker.saveMemoto(originator.save());
        System.out.println(careTaker.getSave(0).getAll());


        System.out.println("\n");
        originator.setSystem("windows");
        careTaker.saveMemoto(originator.save());        // 儲存新的狀踏
        System.out.println(careTaker.getSave(1).getAll());

        System.out.println("\n");
        originator.setUserApp("Android");
        careTaker.saveMemoto(originator.save());
        System.out.println(careTaker.getSave(2).getAll());

        System.out.println("\n");
        originator.setUserDoc("Word");
        originator.setHarDisk("HDD");
        careTaker.saveMemoto(originator.save());
        System.out.println(careTaker.getSave(3).getAll());

        // 最後可以發現到說每一次都會儲存新的資料，也可以回到特定時刻的資料，並顯示出來

        ComputerMemoto memoto = new ComputerMemoto("sss","hhhh","uuuuD","uuuuA");
        ComputerOriginator originator1 = new ComputerOriginator();
        originator1.restore(memoto);
        careTaker.saveMemoto(originator1.save());
        System.out.println(careTaker.getSave(4).getAll());

    }
}
