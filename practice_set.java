import java.util.Scanner;
public class practice_set{ 
    public static void main(String[] args) {

        //question 2 
        /*byte m1,m2,m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in maths: ");
        m1 = sc.nextByte();

        System.out.println("Enter your marks in phy: ");
        m2 = sc.nextByte();
         
        System.out.println("Enter your marks in chem: ");
        m3 = sc.nextByte();

        float avg = (m1+m2+m3)/3.0f;
        System.out.println("Overall percentage is: " + avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulations, You have been promoted!");
        }
        else{
            System.out.println("Sorry, You have not been promoted! please try again text time.");
        }
    */

    //    question 3 income income
    /*Scanner sc = new Scanner(System.in);
    System.out.println("Enter your income in Lakhs per annum");
    float tax = 0;
    float income = sc.nextFloat();
    if(income<=2.5){
        tax = tax +0;
    }

    else if(income>2.5f && income<=5f){
        tax = tax+0.05f*(income-2.5f);
    }
    else if(income>5f && income<=10.0f){
        tax = tax+ 0.05f*(5.0f-2.5f);
        tax = tax+ 0.2f*(income-5f);
    }

    else if(income>10.0f){
        tax = tax+ 0.05f*(5.0f-2.5f);
        tax = tax+ 0.2f*(10.0f-5f);
        tax = tax+ 0.3f*(income-10.0f);
    }

    System.out.println("The Total income paid by the employee is: " + income);
*/

//question 4

// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the case: ");
// int day = sc.nextInt(); 

// switch (day){
//     case 1 -> System.out.println("Monday");
//     case 2 -> System.out.println("Tuesday");
//     case 3 -> System.out.println("Wednesday");
//     case 4 -> System.out.println("Thrusday");
//     case 5 -> System.out.println("Friday");
//     case 6 -> System.out.println("Saturday");
//     case 7 -> System.out.println("Sunday");

// }

// question 6
Scanner sc = new Scanner(System.in);
String website = sc.next();
if(website.endsWith(".org")){
    System.out.println("This is an organizational website");
}
else if(website.endsWith(".com")){
    System.out.println("This is an Indian website");
}
else if(website.endsWith(".in")){
    System.out.println("This is an indian website"); 
}



    }
}