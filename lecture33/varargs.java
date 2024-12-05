
public class varargs{
    // static int sum(int a , int b){
    //     return a + b ;
    // }

    // static int sum(int a , int b, int c){
    //     return a + b + c ;
    // }

    //ye jo upper kia esa baar baar nhi karege toh iske liye var args hai 
    static int sum(int ...arr){
        // Available as int [] arr;
        int result = 0;
        for(int a: arr){
            result += a;
        }
        return result; 
    }
    
    public static void main(String[] args) {
    // in  varargs aap ek se jadha argument pass karwa sakte ho
    System.err.println("The sum of 4 and 5 is: " + sum(4,5));
    System.err.println("The sum of 4 5 and 3 is: " + sum(4,5,3));

    } 
}