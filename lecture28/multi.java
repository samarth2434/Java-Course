public class multi{
    public static void main(String[] args) {
        // int [] marks; //1 D array
        int [] [] flats; //2 D array
        flats = new int [2][3]; 
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 201;
        flats[1][2] = 201;

        //Displaying the 2D array using for loop
        System.out.println("Printing a 2D array using for loop");
        for(int i=0; i<flats.length; i++){
            for(int j=0; j<flats[i].length; j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
                }
                System.out.println("");
               
            }
    }
}