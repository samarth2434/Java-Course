abstract class parent2{
    //create const
    public parent2(){
        System.out.println("I am base2 constructor");
    }
    //create method 
    public void sayHello(){
        System.out.println("Hello");
    }
    //create abstract 
    abstract public void greet(); //ek abstract method puri class ko astract bana deti hai
    abstract public void greet2();
}

class child2 extends parent2{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon");
    }
}

abstract class child3 extends parent2{
    public void th(){
        System.out.println("I am good");
    }
}

public class Abstract{
    public static void main(String[] args) {
        //Abstract - Existing in thought or as an idea woithout concrete existance 
        // abstract method - A method that is declared without an impleentation 
        //ex - abstract void moveTo(double x, double y)

        //Abstract class - If a class include abstract methods, then the class itself must be declared abstract as in 
        // -- abstract class ek ese he class hai jiske need se aur class banaegi
        // abstract class ka obj nhi ban sakta 

        // parent2 p = new parent2(); //aap ye nhi kar sakte kyuki parent2 ek abstract class hai so uska object nhi banta 
        child2 c = new child2();  //but we can make obj for child2 because it is not an abstract class 
        
    }
}