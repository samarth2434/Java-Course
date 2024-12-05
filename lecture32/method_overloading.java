public class method_overloading{

    //method overloading method 
    static void foo(){
        System.out.println("Good Morning bro!");
    }

    static void foo(int a){
        System.out.println("Good Morning " + a + " bro!");
    }

    static void foo(int a, int b){
        System.out.println("Good Morning " + a + " bro!");
        System.out.println("Good Morning " + b + " bro!");
    }

    //method case 1  
    static void change(int a){
        a = 98;
    }
    //method case 2 
    static void change2(int[] arr){
        arr[0] = 98;
    }
    //method
    static void tellJoke(){
        System.out.println("I invented a new world!\n" + 
                "Plagiarism!");
    }
    public static void main(String[] args) {
        // tellJoke();
        //case 1: changing the integer 
        int x = 45;
        change(x);
        System.out.println("The value of x after running change is: " + x);

        // case2: changing the array
        int [] marks = {56,76,98,44,66};
        change2(marks);
        System.out.println("The value of x after running change is: " + marks[0]);
        //Note : changing in array me jo bhi aap method ke andar likhte ho wo he change hoga but not in integer case 
        // esa kyu? becasue in array case we are pass the refernce or object in the method and in integer case we are pass the value 

        //--------Method overloading - Two or more method can have same name but different parameter
        foo();
        foo(3000);
        foo(4000,5000);
        
        //Method overloading cannot be perferred by changing the return type of method 
        
    }
} 