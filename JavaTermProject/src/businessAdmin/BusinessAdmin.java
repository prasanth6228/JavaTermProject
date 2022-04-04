/**
 * 
 */
package businessAdmin;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import objects.Plot;
/**
 * @author varma
 *
 */
public class BusinessAdmin {
	
	public BusinessAdmin() {
		
	}
	/*
	 * @user - specifies what type of user - Business Admin, Customer
	 * @fileName -specifies the file name that we need to interact
	 * 
	 * Use of Inheritance: Dynamic method for the purpose of user validation
	 * Both Business Admin and Customer can use this method for validation and change the file and user names
	 * */
	public static void logIn(String user, String fileName) {
		System.out.println("***********************\n"
				+ "Enter User name:");
		Scanner userInp = new Scanner(System.in);
		String userName = userInp.nextLine();
		System.out.println("2.Enter the password:");
		String password = userInp.nextLine();
		// validate the user and login 
		
	}
	
	public static void businessUserOperationsMenu() {
		System.out.println("***********************");
		System.out.println("Logged in, as Business Admin....");
		System.out.println("***********************");
		System.out.println("Select an Operation you want to perform.\n"
							+"1.Create/update/Delete Data\n"
							+"2.View Data");
		Scanner userInp = new Scanner(System.in);
		String userSele = userInp.next();
		userInp.close();
		if(userSele == "1") {
			BusinessAdmin.businessUserCreateUpdateDeleteMenu();
		}
	}
	
	public static void businessUserCreateUpdateDeleteMenu() {
		System.out.println("1.Customer\n"
				+ "2.Province \n"
				+ "3.regions \n"
				+ "4.plots\n"
				+ "5.Plan \n"
				+ "6.Home Items Category \n"
				+ "7.Home Items");
		Scanner userInput = new Scanner(System.in);
		String userSelection = userInput.nextLine();
		if(userSelection == "4") {
			// user is trying to create/update/delete plots data
			Plot.plotOptionsMenu();
		}
	}
	
	/*
	 * re-usable method for viewing data in objects
	 * Use this method in Customer class to view the data
	 * */
	public static void UserViewDataMenu(String user) {
		
	}
	
}
