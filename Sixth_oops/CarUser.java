package Sixth_oops;

public class CarUser {
    public static void main(String[] args){
        CarNavigator mahindra =new CarNavigator();  // Creating object
        CarNavigator maruthi =new CarNavigator();

        //assign data to object
        mahindra.color="red";
        mahindra.brandmodel="mahindra xuv700";
        mahindra.price=25.14;
        maruthi.color="gray";
        maruthi.brandmodel="maruthi swift";
        maruthi.price=15.14;


        //display cars
        System.out.println("Website:"+CarNavigator.website);
        mahindra.displaycarinfo();
        maruthi.displaycarinfo();

        //Working with instance variables.
        System.out.println(mahindra.color);

        //Working with local variables.
        //System.out.println(mahindra.rating);
    }
}
