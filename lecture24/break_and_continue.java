public class break_and_continue{
    public static void main(String[] args) {
        //break and continue using loops
        //-------------for loop
        // for(int i=0; i<5; i++){
        //     System.out.println(i);
        //     System.out.println("Java is great for learning");
        //     if(i==2){
        //         System.out.println("Ending the loop");
        //         break;
        //     }
        // }
        

        //----------while loop
        // int i=0;
        // while(i<5){
        //     System.out.println(i);
        //      System.out.println("Java is great for learning");
        //     if(i==2){
        //         System.out.println("Ending the loop");
        //         break;
        //     }
        //     i++;
        // }

        //-------------do while loop
        // int i=0;
        // do { 
        //     System.out.println(i);
        //     System.out.println("java is great");
        //     if(i==2){
        //         System.out.println("Ending the loop");
        //         break;
        //     }
        //     i++;
        // } while (i<5);
        // System.out.println("Loop ends here");

        //----------continue 

        for(int i=0; i<3; i++){
            if(i==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("java is great");
        }
    }
}