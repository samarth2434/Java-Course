//question 1 
class cylinder{
    private int radius ;
    private int height;

    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    //question 2 
    public double surfaceArea(){
        return 2*3.14*radius*radius+2*3.14*radius*height;
    }

     public double Volume(){
        return 3.14*radius*radius*height;
    }

    //question 3
    //create constructor
    public cylinder(int radius, int height){
        this.radius = radius;
        this.height = height;
    }

}
//question 4 
    // class Rectangle{
    //     private int length;
    //     private int breadth;

    //     public Rectangle(){
    //         this.length = 4;
    //         this.breadth = 5;
    //     }

    //     public Rectangle(int length, int breadth){
    //         this.length = length;
    //         this.breadth = breadth;
    //     }

    //     public int getLength(){
    //         return length;
    //     }

    //     public int getBreadth(){
    //         return breadth;
    //     }
    // }







public class practiceset{
    public static void main(String[] args) {
        //question 1 - Create a class cylinder and use getters and setters to set its readius and height 
        cylinder myCylinder = new cylinder(12,9);  //when we create const in question 3 then we have to give argument in this line so 12 and9 are argument 
        myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());

        myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());

        // question 2
        System.out.println(myCylinder.surfaceArea());

        System.out.println(myCylinder.Volume());

        //question 4
        // Rectangle r = new Rectangle();
        // System.out.println(r.getLength()); 

        // System.out.println(r.getBreadth()); 
         
    }
} 