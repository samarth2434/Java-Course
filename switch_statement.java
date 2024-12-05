public class switch_statement{
    public static void main(String[] args) {
        // int age;
        // System.out.println("Enter the age: ");
        // Scanner sc = new Scanner(System.in);
        // age = sc.nextInt();
        // var can be an integer char or string 
        String var = "Sam";

        switch (var){
            case "Sam":
                System.out.println("You are going to become an Adult!");
                break;

            case "happ":
                System.out.println("You are going to join a job!");
                break;

            case "athu":
                System.out.println("You are going to get retired!");
                break;
            default:
                System.out.println("Enjoy your life!");
        }
        /*
        if (age>56){
            System.out.println("You are experienced!");
        }
        else if(age>46){
            System.out.println("You are semi-experienced!");
        }
        else if(age>36){
            System.out.println("You are semi-semi-experienced!");
        }
        else {
            System.out.println("You are not experienced!");
        }
        */


    }
}