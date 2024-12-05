public class method{
    // method syntax - datatype name(){method body}
    static int logic(int x, int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z;
    } 
    public static void main(String[] args) {
        
        int x = 5;
        int y = 7;
        int z;
        //Method invocation using the object creation 
        //calc obj = new calc();
        //c = obj.logic(a,b);
        z = logic(x,y);
        System.out.println(z);

        /*
        int a1 = 2;
        int b1 = 1;
        int c1;
        if(a1>b1){
            c1 = a1+b1;
        }
        else{
            c1 = (a1+b1)*5;
        }
        System.out.println(c);
        System.out.println(c1);
        */
        //but ye esa baar baar nhi karege if else baar baar use nhi karege so iskeliye we can use (method)
        // we create method and usko method ke andar dal dege then kitne baar bhi use karo 
        // method is like a function 
        //method is used to avoid the repeating the logic 

    }
}