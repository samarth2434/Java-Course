public class forloop{
    public static void main(String[] args) {
        int n = 4;
            // int i = 1;
            int factorial = 1;
            for(int i=1; i<=n; i++){
                factorial *= i;
            }
            // while(i<=n){
            //     factorial *= i;
            //     i++;
            // }
            System.out.println(factorial);
    }
}