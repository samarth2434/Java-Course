

class MymainEmployee{
    private int id;
    private String name;

    // arguument pass karna hoga ye wala method run karne ke liye 
    public MymainEmployee(String myName, int myId){   //method 1
        id = myId;
        name = myName;
    }
    //cons overloading if argument pass nhi kia toh ye wla method run hoga 
    public MymainEmployee(){    //method 2
        id = 33;
        name = "Samarth is programming";
    }

    public String getName() {return name;}
    public void setName(String n) {this.name = n;}
    public void setId(int i) {this.id = i;}
    public int getId() {return id;}
}

public class constructors{
    public static void main(String[] args) {
        //method 1 run 
        MymainEmployee sam = new MymainEmployee("Samarth", 44);  // argument pass 
        //method 2 run
        // MymainEmployee sam = new MymainEmployee(); //argument does not pass 

        // sam.setName("Samarth");
        // sam.setId(34);
        // question - me baar har alag alag ke liye set name set id get name getid banaunga kya ? Nahi toh then we will use the contructors
        
        //constructors - A member fun used to intilialize an obj creating it
        
        System.out.println(sam.getId());
        System.out.println(sam.getName());
    }
}