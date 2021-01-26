package garage;
//Using Vehicle as a base class, create three derived classes (car, motorcycle etc.), each derived class should have its own attributes in addition to the normal Vehicle attributes. 
//
//
//Using a List implementation, store all your vehicles in a Garage class. 
// 
//
//Create a method in Garage that iterates through each Vehicle, calculating a bill for each type of Vehicle in a different way, depending on the type of vehicle it is.  You can decide how this bill is calculated based on any attributes you see fit. (You do not get extra marks for making the calculation overly complex) 
// 
//
//Garage should have methods that add Vehicle, remove Vehicle(s) (By ID, By Vehicle Type) fix Vehicle (Calculate bill) and empty the garage.  

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Garage {
	
	private static Scanner scan = new Scanner(System.in);
	static ArrayList<Car> carList = new ArrayList<Car>();
	static ArrayList<Truck> trucklist = new ArrayList<Truck>();
	static ArrayList<Motorbike> bikeList = new ArrayList<Motorbike>();
	static List<String> garage = new ArrayList<>();
	
	public static void start() {
		 
		 loadVehicles();
		 menuSystem.openGarage();
		
	}
	
	private static void loadVehicles(){
		//creates 5 Seller Objects
		Car car1 = new Car("001","BMW_BATTERY","BMW_BRAKES","BMW_ENGINE" , "BMW_FRAME", 4);
		Car car2 = new Car("002","AUDI_BATTERY","AUDI_BRAKES","AUDI_ENGINE" , "AUDI_FRAME", 4);
		Truck truck1 = new Truck("003","MAN_BATTERY","MAN_BRAKES","MAN_ENGINE" , "MAN_FRAME", 6);
		Truck truck2 = new Truck("004","SCANIA_BATTERY","SCANIA_BRAKES","SCANIA_ENGINE" , "SCANIA_FRAME", 6);
		Motorbike bike1 = new Motorbike("005","YAMAHA_BATTERY","YAMAHA_BRAKES","YAMAHA_ENGINE" , "YAMAHA_FRAME", 2);
		Motorbike bike2 = new Motorbike("006","HONDA_BATTERY","HONDA_BRAKES","HONDA_ENGINE" , "HONDA_FRAME", 2);

		
		//loads Sellers into List
		carList.add(car1);
		carList.add(car2);
		
		trucklist.add(truck1);
		trucklist.add(truck2);
		
		bikeList.add(bike1);
		bikeList.add(bike2);

		
	}
	


	
	

public static void Add_Vehicle() {

	System.out.println("-= Welcome to Garage =-"
			+ "\n ----------------------------------------------"
			+ "\n Please chose one of the machine you want to add( 1 - 6):"
			+ "\n "
			+ "\n  Cars: "
			+ "\n 1. BMW "
			+ "\n 2. AUDI"
			+ "\n Trucks: "
			+ "\n 3. MAN"
			+ "\n 4. SCANIA"
			+ "\n MotorBikes: "
			+ "\n 5. YAMAHA"
			+ "\n 6. HONDA"
			+ "\n ---------------------------------------------");
	
	int answer = scan.nextInt();
	
	while(true) {	
		
		switch (answer) {
		//depending on what number the User types, they are taken to each function
		case 0:
			
			continue;
		case 1:
			 
			continue;
		case 2:
			
			
			continue;
		case 3:
			
			
			continue;
		case 4:
			
			continue;
		case 5:
		
			continue;
		case 6:
			
			continue;


		default:
			//If user enters value that isn't 1,2,3, 4 or 5 they go back to the menu
			System.out.println("Invalid option, please enter a value between 1 & 5.");
		}
	}
	

	
	
}

public static void  Remove_Vehicle() {
	System.out.println("-= Vehicle in to remove =-");
	for (String i : garage){
		System.out.println(i);
		if (!(i == null )) {
			System.out.println("- " + i + "\n");
	
    	    } else {
    	    
    	    System.out.println("garage empty ,none to remove but dust");
    	}
	}
	}
	
	


public static void  Fix_Vehicle() {
	System.out.print("");
	
}
public static void  Empty_the_garage() {
	

	System.out.print("");
	
}

public static void Vehiclein() {
	
	for (String i : garage){
		
			 System.out.println("- " + i + "\n");

    	   } 
	if ( garage == null) {
		  System.out.println("garage empty");
	}
    	
	
    	  
	
	
}


	
    

}
