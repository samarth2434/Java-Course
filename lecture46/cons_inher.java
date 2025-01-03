class Base1{
    Base1(){
        System.out.println("I am cons");
    }

     Base1(int x){
        System.out.println("I am an overloaded cons with value of x as: " + x);   //it is used when argument is pass throught in the derived class ex super(0);
    }
    public int x;

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x=x;
    }
}

class Derived1 extends Base1{
    Derived1(){
        // super(0); //it is argument 
        System.out.println("I am a derived class const");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am an overloaded cons of derived with value of y as: " + y); 
    }
}

class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am a child of derived cons");
    }
    ChildOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am an overloaded cons of derived with value of z as: " + z); 
    }
}

public class cons_inher{
    public static void main(String[] args) {
        // Base1 b = new Base1();
        // Derived1 d = new Derived1();
        // Derived1 d = new Derived1(14, 9);
        // ChildOfDerived cd = new ChildOfDerived();
        ChildOfDerived cd = new ChildOfDerived(2,3,4);

    }
}