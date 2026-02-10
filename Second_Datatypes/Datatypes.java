package Second_Datatypes;
public class Datatypes{
    public static void main(String[] args){
        byte byteval = 10;
        short shortval = 10000; 
        int intval = 462632363;
        long longval= 9999999999l;
        float floatval = 5.3f;
        double doubleval = 54.85464;
        char charval = 'c';
        boolean bollval = true;
        String name = "Karthikeya";
        String Wishes = "Happy diwali";
        byte time = 12 ;
        //int[] ids ={10,20,30,40,50};
        System.out.println(byteval);
        System.out.println(shortval);
        System.out.println(intval);
        System.out.println(longval);
        System.out.println(floatval);
        System.out.println(doubleval);
        System.out.println(charval);
        System.out.println(bollval);
        System.out.println(name);
        System.out.println(name + " "+Wishes +" "+ time);
        System.out.println("I will go to bed by "+time+1); //here it is following the concatination.
        System.out.println("I will go to bed by "+ (time+1));  //here we performimg the mathematical operation due to ()
        // System.out.println(ids);
        int a=10;
        int b= 20;
        System.out.println(a+b); // Due to same datatype
    }
}