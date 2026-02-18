package Sixth_oops;

//blueprint for car navigator functionality
public class CarNavigator {
    // Characteristics - Variable
    //Instance variables
    String color;
    String brandmodel;
    double price;
    
    //static variables
    static String website ="Car Dekho";

    //Show car details - Method
    public void displaycarinfo(){
        int rating=4;
        System.out.println("Car color:"+color);
        System.out.println("Car brandmodel:"+brandmodel);
        System.out.println("Car price:"+price);
        // System.out.println("Car rating:"+rating); //rating not iinitialized

        System.out.println("Car rating:"+rating);
    }


}
