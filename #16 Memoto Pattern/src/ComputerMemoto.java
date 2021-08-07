

// Memoto to create class : 負責儲存需要儲存的狀態的類。

public class ComputerMemoto {

    private String system;
    private String harDisk;
    private String userDoc;
    private String userApp;

    public ComputerMemoto(String system, String harDisk, String userDoc, String userApp){
        this.system = system;
        this.harDisk = harDisk;
        this.userDoc = userDoc;
        this.userApp = userApp;
    }


    public String getSystem(){
        return  system;
    }

    public void setSystem(String system){
        this.system = system;
    }

    public String getHarDisk(){
        return  harDisk;
    }

    public void setHarDisk(String harDisk){
        this.harDisk = harDisk;
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

    // Show all the result
    public String getAll(){
        return system+"\n"+harDisk+"\n"+userApp+"\n"+userDoc;
    }


}
