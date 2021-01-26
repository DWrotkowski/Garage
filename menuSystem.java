package garage;
import java.util.Scanner;

public class menuSystem {
	private static Scanner scan = new Scanner(System.in);
public static void openGarage() {


		//eternal loop of main menu
		while(true) {	
			//Input in mainMenu method is used in switch
			switch (menu()) {
			//depending on what number the User types, they are taken to each function
			case "0":
				Garage.Vehiclein();
				continue;
			case "1":
				Garage.Add_Vehicle();
				continue;
			case "2":
				
				Garage.Remove_Vehicle();
				continue;
			case "3":
				
				Garage.Fix_Vehicle();
				continue;
			case "4":
				Garage.Empty_the_garage();
				continue;
			case "5":
			
				//returns to main method and exits system
				return;

			default:
				//If user enters value that isn't 1,2,3, 4 or 5 they go back to the menu
				System.out.println("Invalid option, please enter a value between 1 & 5.");
			}
		}
	}


private static String menu() {
	System.out.println("-= Welcome to Garage =-"
			+ "\n ----------------------------------------------"
			+ "\n Please chose one of the option below"
			+ "\n "
			+ "\n 0. Check Vehicle"
			+ "\n 1. Add Vehicle"
			+ "\n 2. Remove Vehicle"
			+ "\n 3. Fix Vehicle "
			+ "\n 4. Empty The Garage"
			+ "\n 5. Exit"
			+ "\n ---------------------------------------------");

	//response is what user inputs
		String answer = scan.nextLine();
		return answer;
}

}
