//create interface - is used to applybrake and spped up class banane hai usko force kar rha hai ki muhje implement karo 

interface Bicycle{
    int a =24;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    void blowHornktm();
    void blowHornbullet();
}

class AvonCycle implements Bicycle, HornBicycle{
    //now we have to implment the class apply brake and speedup
    //jab bhi hum implement karte hai toh public banana padhega 

    public void applyBrake(int decrement){
        System.out.println("Applying brake");
    }
    public void speedUp(int increment){
        System.out.println("SpeedUp");
    }

    public void blowHornktm(){
        System.out.println("Buuuuuu");
    }
    public void blowHornbullet(){
        System.out.println("Dubbbbb");
    }
}
//interface ek se jada implement kar sakte ho
//class AvonCycle extend Bicycle implement Bicycle

public class abs_vs_inte{
    public static void main(String[] args) {
        AvonCycle cycle = new AvonCycle();
        cycle.applyBrake(3);
        //you can create properties in interfaces 
        System.out.println(cycle.a);
        //you cannot modify the properties in interfaces as they are final
        // cycle.a = 45;
        // all the properties you make in the interface that is final for the code 

        // System.out.println(cycle.a);

        cycle.blowHornbullet();
        cycle.blowHornktm();

        //abstract class ek se jada use nhi kar sakte

    }
 }