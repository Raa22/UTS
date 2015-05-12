/**
 * Created by RockStar on 5/12/2015.
 */
public class robot {
    public int sensor;
    public int servo;
    public int power;

    public robot(){
        sensor=4;
        System.out.println("jumlah sensor robot : "+sensor);
    }

}
class asimo24 extends robot{
    public int kamera;

    public asimo24(int snsr,int srv,int pwr,int kmr ){
        sensor=snsr;
        servo=srv;
        power=pwr;
        kamera=kmr;
    }
    public void CetakSpesifikasi(){
        System.out.println("Jumlah Sensor asimo24 = "+sensor);
        System.out.println("Jumlah servo = "+servo);
        System.out.println("kapasitas Power = "+power);
        System.out.println("Jumlah kamera = "+kamera);
    }
    public void upgrade(int x){
        sensor = x;
        System.out.println("asimo24 di upgrade dengan sensor = "+sensor);
    }

}