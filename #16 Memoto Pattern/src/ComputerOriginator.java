
// Originator : 提供建立Memoto或是回復到某個Memoto的狀態的方法。

public class ComputerOriginator {
    private String system = "MacOS";
    private String hardisk = "ssd";
    private String userDoc = "desk";
    private String userApp = "pages, numbers, .....";


    public ComputerMemoto save(){  // 此傳入的數值微上方的 global variab;es
        return new ComputerMemoto(system, hardisk , userDoc, userApp);
    }

    public void restore(ComputerMemoto memoto){
        this.hardisk = memoto.getHarDisk();
        this.system = memoto.getSystem();
        this.userApp = memoto.getUserApp();
        this.userDoc = memoto.getUserDoc();
    }



    // the same class from memoto
    public String getSystem(){
        return  system;
    }

    public void setSystem(String system){
        this.system = system;
    }

    public String getHarDisk(){
        return  hardisk;
    }

    public void setHarDisk(String harDisk){
        this.hardisk = harDisk;
    }

    public String getUserDoc(){
        return  userDoc;
    }

    public void setUserDoc(String userDoc){
        this.userDoc = userDoc;
    }

    public String getUserApp(){
        return  userApp;
    }

    public void setUserApp(String userApp){
        this.userApp = userApp;
    }





}
