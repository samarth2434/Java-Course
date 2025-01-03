class Circle{
public int radius;
    //const
    Circle(int r){
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }    

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r, int h){
         super(r);   //hum cylinder wale ko excute karna hai toh pehele circle wala output print hoga because of super function then uske baad cylinder wale me jo output hai jo print hoga 
         System.out.println("I am cylinder1 parametiezed constructor");
         this.height = h;
    }
    
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;

    }
}

public class practice{
    public static void main(String[] args) {
         Circle objc = new Circle(12);
         Cylinder1 obj = new Cylinder1(12,4);
    }
}