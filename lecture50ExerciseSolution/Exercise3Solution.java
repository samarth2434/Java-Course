import java.util.Random;  //random no lega 
import java.util.Scanner;
//create class
class Game{
    //create const and const is used to create a random variable
    public int number;
    public int inputNumber;
    public int noofGusses = 0; //noofgusses ke liye geter and seter create karna hai
    //create geter and seter for noofgusses 
    public int getNoOfGusses(){
        return noofGusses;
    }

    public void setNoOfGusses(int noofGusses){
        this.noofGusses = noofGusses;
    }
    Game(){   //const ka koi return type nhi hota esliye humne Game ke pehele void nhi likha 
        Random rand = new Random();
        this.number = rand.nextInt(100);

    }
    //create takeuserinput function 
    void takeUserInput(){
        System.out.println("Guess the number: ");
        Scanner sc = new Scanner(System.in);   // use for take input number 
        inputNumber = sc.nextInt();
        
    }
    //create iscorrectNumber function 
    boolean iscorrectNumber(){     //apne number input kia toh apka number correct hai ki nhi toh vo ye wala function kaam karega 
    noofGusses++;
    if(inputNumber == number){
        System.out.format("Yes you guessed it right, it was %d\n you guessed it in %d attempt", number,noofGusses);
        return true; 
    }
    else if(inputNumber<number){
        System.out.println("Too low...");
    }
    else if(inputNumber>number){
        System.out.println("Too High...");
    }
    return false;
    
    }
}

public class Exercise3Solution{
    public static void main(String[] args) {
        //Guess the number solution of lecture 43
        Game g = new Game(); 
        boolean b = false;
        while(!b){
        g.takeUserInput();
        b = g.iscorrectNumber();
        }
    }
}