class MyEmployee{
    private int id;
    private String name;

    public String getName(){  //method1
        return name;
    }
    public void setName(String n){  //method 2 
        name = n;
    }
     public void setId(int i){   //method 3 
        id = i;
    }
    public int getId(){   //method 4 
        return id;
    }
}

public class AccessModifier{
    public static void main(String[] args) {
        //Accessmodifier - where a property is accessible 
        // 4types - private public protected default
        MyEmployee sam = new MyEmployee();
        // sam.id = 24;
        // sam.name = "Samki"; ---> Tjis 2 line throws an error due to private access modifier 
        sam.setName("Codewithsam");
        System.out.println(sam.getName());
        sam.setId(32);
        System.out.println(sam.getId()); 

    }
}