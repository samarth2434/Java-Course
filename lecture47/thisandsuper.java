//Super keyword - A reference variable used to refer immediate parent class object 
  
class Ekclass{
    int a;

    public int getA(){
        return a ;
    }
    Ekclass(int v){
        this.a = v;
    }
    public int returnone(){
        return 1;
    }
}

class Doclass extends Ekclass{
    Doclass(int c){
        super(c);
        System.out.println("I am a const");
    }
}

public class thisandsuper{
    public static void main(String[] args) {
        // Ekclass e = new Ekclass(5);
        // System.out.println(e.getA());
        Doclass d = new Doclass(5);

    }
}