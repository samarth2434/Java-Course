public class string_method{
    public static void main(String[] args){
        String name = "Samarth"; //string is immutable

        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring); 

        String nonTrimmedString = "      Harry     ";
        System.out.println(nonTrimmedString);

        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

        System.out.println(name.substring(2));

        System.out.println(name.substring(2,7));

        System.out.println(name.replace('a', 's'));

        System.out.println(name.equals("Samarth")); 

        //escape sequence
        System.out.println("I am escape sequence \" double quote");
    }
    }
