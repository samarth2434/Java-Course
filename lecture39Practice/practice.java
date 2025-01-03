//question 1 
class Employee1{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

}

//question 2 
class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callfriend(){
        System.out.println("Calling samki...");
    }

}

//question 3

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
// question 4 
class Rect{
    int length;
    int width;
    public int area(){
        return length*width;
    }
}

// question 5 

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("running from the enemy");
    }
    public void fire(){
        System.out.println("fireing on the enemy");
    }
}
public class practice{
    public static void main(String[] args) {
        /*
        //question 1 
        Employee1 harry = new Employee1();
        harry.setName("CodeWithHarry");
        harry.salary = 234;
        System.out.println(harry.getSalary());
        System.out.println(harry.getName());

        //question 2 
        //create or intialisation object 
        CellPhone apple = new CellPhone();
        apple.ring();
        apple.vibrate();
        apple.callfriend(); 
        */

       //question 3 
        Square sq = new Square();
        sq.side = 2;
        Rect rec = new Rect();
        rec.length = 3;
        rec.width = 4;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
        System.out.println(rec.area());

       // question 5 
       Tommy cat = new Tommy();
       cat.run();
       cat.fire();
       cat.hit();

    }
}