
// import java.lang.reflect.Array;
// import java.time.Year;

public class practice_set{
    public static void main(String[] args) {
        //question 1
        /*
        float [] marks = {43.5f, 46.5f, 56.5f, 76.5f, 55.5f};
        float sum = 0 ;
        for(float element:marks){
            sum = sum + element;
            System.out.println(sum);
        }
        System.out.println("The value of sum is " + sum);
        */
 
        //question 2 
/*
        float [] marks = {43.5f, 46.5f, 56.5f, 76.5f, 55.5f};
        float num = 43.5f;
        boolean isInarray = false;   //by default we can say it is not present in the array
        for(float element:marks){
            if(num==element){
                isInarray = true;
                break;
            }
        }
        if(isInarray){
            System.out.println("The value is present in the array");
        }
        else{
            System.out.println("The value is not present in the array");
        }
        */

       //question 3 
       /*
       float [] marks = {43.5f, 46.5f, 56.5f, 76.5f, 55.5f};
        float sum = 0 ;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of avg marks is " + sum/marks.length);
        */

        //question 4 
        /*
        int [][] mat1 = {{1,2,3},
                         {4,5,6}};
        int [][] mat2 = {{4,5,3},
                         {7,8,9}};
        int [][] result = {{0,0,0},
                         {0,0,0}};

        for(int i=0; i<mat1.length; i++){   // run rows no of times
            for(int j=0;j<mat1[i].length;j++){ // run cols number of times
                System.out.format(" setting value for i=%d and j=%d\n", i, j);
                result [i][j] = mat1[i][j] + mat2[i][j];

            }
        }
        // printing the element of 2D array 
        for(int i=0; i<mat1.length; i++){   // run rows no of times
            for(int j=0;j<mat1[i].length;j++){ // run cols number of times
                System.out.print(result[i][j] + " ");
                result [i][j] = mat1[i][j] + mat2[i][j];

            }
            System.out.println(""); //print new line   
        }
        */

       //question 5 write a progrsm to reverse the array
       // replace a[i] to a[l-i-1]
       /*
       int [] arr = {1,2,3,4,5,6};
       int l = arr.length;
       int n = Math.floorDiv(l, 2); 
       int temp;

       for(int i=0; i<n; i++){
        //swap a[i] and a[l-i-1]
        // a   b   temp
        temp = arr[i];
        arr[i] = arr[l-i-1];
        arr[l-i-1] = temp;
    }
    for(int element : arr){
        System.out.print(element + " ");
    }       
    */

   //question 6 
   /*
    int [] arr = {1,2,3,4,5,6};
    int max = 0;
    for(int element: arr){
        if(element>max){
            max=element; 
        }
    }
    System.out.println("The value of the maximum element in this array is: " + max);

    // question 7
    int [] arr1 = {1,2,3,4,5,6};
    int min = 12;
    for(int element: arr1){
        if(element<min){
            min=element; 
        }
    }
    System.out.println("The value of the minimum element in this array is: " + min);
    // System.out.println(Integer.MIN_VALUE);
    */

   //question 8
   boolean isSorted = true;
   int [] a = {1,4,6,3,2,5};
   for(int i=0; i<a.length-1; i++){
    if(a[i] > a[i+1]){
        isSorted = false;
        break;
    }
   }
   if(isSorted){
    System.out.println("The array is sorted");
   }
   else{
    System.out.println("The array is not sorted");
   }

    }
}