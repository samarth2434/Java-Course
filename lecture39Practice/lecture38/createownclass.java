class Employee{
    int id;
    String name;
    int salary;
    //method
    public void printDetails(){
        System.out.println("My id is "+ id);
        System.out.println("and my name is "+ name);
        // System.out.println("My salary is: "+ salary);
        System.out.println(" ");
    } 

    public int getSalary(){
        return salary;
    }
}

public class createownclass{
    public static void main(String[] args) {
        Employee sam = new Employee(); //Instantiating a new employee objects 
        Employee john = new Employee(); //Instantiating a new employee objects
 
        // setting properties and attributes

        sam.id = 24;
        sam.name = "Samarth"; 
        sam.salary = 1234;

        john.id = 34;
        john.name = "aryan";
        john.salary = 2345;

        sam.printDetails();
        john.printDetails();
        int salary = john.getSalary();
        System.out.println(salary);


        // System.out.println(sam.id);
        // System.out.println(sam.name);

    }
}