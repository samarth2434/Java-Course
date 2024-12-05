public class array_loop{
    public static void main(String[] args) {
        int [] marks ={12,34,45,36,76};
        // System.out.println(marks[2]);
        // System.out.println(marks.length);

        // Displaying the array (Naive way)
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // System.out.println(marks[3]);
        // System.out.println(marks[4]);

        // Displaying the array using for loop
        System.out.println("Printing using for loop");
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        //reverse order
        System.out.println("Printing reverse order using for loop");
        for(int i=marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }

        //Displaying the array (for each loop)
        System.out.println("Printing using for each loop");
        for(int element: marks){
            System.out.println(element); 
        } 



    }
}