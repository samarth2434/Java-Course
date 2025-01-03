class Base{
    public int x;

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am Samarth");
    }
}

class Derived extends Base{  //this extends is used to jo bhi base class me data hai vo sara derived me aajayega 
    public int y;

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

}

public class Inheritance1{
    public static void main(String[] args) {
        Base b = new Base();
        //here we use derived class becasue jo base class me detail hai wahi derived class me bhi rahegi
        Derived d = new Derived();
        b.setX(4);
        d.setX(43);
        System.out.println(b.getX());
        System.out.println(d.getX());

        
    }
    
}