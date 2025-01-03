interface Camera{
    void takeSnap();
    void recordVideo();
    default void record4KVideo(){
        System.out.println("Recording in 4K...");
    }
}

interface wifi{
    String[] getNetworks();
    void connectToNetwork(String network);

}
class Mycellphone{
    void callNumber(int phoneNumber){
        System.out.println("Calling..."+ phoneNumber);
    }
    void pickcall(){
        System.out.println("Connecting...");
    }
    
}
 
class MySmartPhone extends Mycellphone implements wifi, Camera{
    public void takeSnap(){
        System.out.println("Taking snap....");
    }
    public void recordVideo(){
        System.out.println("Recording...");
    }
    // public void record4KVideo(){
    //     System.out.println("Recording in 4K...");
    // }
    public String[] getNetworks(){
        System.out.println("Geeting list of nNetworks");
        String[] networkList = {"sam", "hap", "aru"};
        return networkList;
    }
    public void connectToNetwork(){
        System.out.println("connecting...");
    }

    @Override
    public void connectToNetwork(String network) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}

public class Defaultmethod{
    public static void main(String[] args) {
        Mycellphone c = new Mycellphone();
        c.callNumber(909886009);
        c.pickcall();
        

        MySmartPhone ms = new MySmartPhone();
        String[] ar = ms.getNetworks();
        ms.record4KVideo(); 
        for(String item:ar){
            System.out.println(item);
        }

        

    }
}