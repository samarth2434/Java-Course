
public class recursion{
    static int factorial(int n){
            if(n==0 || n==1){
                return 1;
            }
            else{
                return n* factorial(n-1);
            }
        }
    public static void main(String[] args) {
        //reeursion -- a function in java can call itself such calling of function by itself is called recursion 

        int n=5;
        System.out.println("The value of factorial is: " + factorial(n));

    }
}