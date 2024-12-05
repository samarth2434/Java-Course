public class practiceset{
    //question 1
    static void multiplication(int n){
        for(int i=1; i<=10; i++){
            System.err.format("%d X %d = %d\n", n , i , n*i);
        }
    }
    //question 2 
    static void pattern1(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //question 3 
    // sum(n) = 1+2+3...+n
    // sum(n) = 1+2+3+...n-1+n
    // sum(n) = sum(n-1) + n
    static int sumRec(int n){
        //base condition 
        if(n==1){
            return 1;
        }
        else{
            return n + sumRec(n-1);
        }
    }

    //question 5 
    static int fib(int n){
        if(n==1 || n==2){
            return n-1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }

    //question 8
    static void pattern2(int n){
        
        if(n>0){
            pattern2(n-1);
            for(int i=0; i<n; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }


    public static void main(String[] args) {
        //question 1 
        multiplication(7);

        //question 2
        pattern1(5);

        //question 3 
       int c = sumRec(4);
       System.out.println(c);

       //question 5 
       // fibonacci series - 0,1,1,2,,3,5,8,13,21,34
       int n = 5;
       int result = fib(n);
       System.out.println(result);

       //question 8
       pattern2(9);

    }
}