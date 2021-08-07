import com.sun.nio.sctp.Association;


public class Main {
    public static void main(String args[]){
        Sensor[] sensors = new Sensor[5000];        // 設5000個sensor列

        sensors[0] = new Sensor();
        sensors[0].setID(1);
        sensors[0].setName("Sensor第1版");
        sensors[0].setNickname("我的空氣探測器");
        sensors[0].setVersion("1.0.0");
        sensors[0].setWifiID("MYSENSORWIFIID1.0.0");
        sensors[0].setWifiPass("THISisWiFiPasssOuO");
        sensors[0].setData("None");

        for(int i=0; i<5000; i++){
            try {
                sensors[i] = (Sensor)sensors[0].clone();
                sensors[i].setID(i+1);
                sensors[i].setName("Sensor第"+(i+1)+"版");

            }catch(CloneNotSupportedException e){
                e.printStackTrace();
            }
        }

        // 顯示結果
        for(int i=0 ; i< 50 ; i++){
           System.out.println(sensors[i].getName());
        }


    }
}
