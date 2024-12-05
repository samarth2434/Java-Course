import java.util.Scanner;

public class cbse{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your maths marks : ");
        int maths = sc.nextInt();

        System.out.println("Enter your phy marks : ");
        int phy = sc.nextInt();

        System.out.println("Enter your chem marks : ");
        int chem = sc.nextInt();

        System.out.println("Enter your hindi marks : ");
        int hindi = sc.nextInt();

        System.out.println("Enter your social marks : ");
        int social = sc.nextInt();

        float percentage = ((maths + phy + chem + hindi + social)/500.0f)*100;
        
        System.out.println("percentage : ");
        System.out.println(percentage);

    }
}