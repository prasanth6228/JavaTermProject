/**
 * 
 */
package userInterface;
import objects.Plot;
import java.util.Scanner;
import businessAdmin.BusinessAdmin;
import objectImplementation.PlotImplementation;
/**
 * @author varma
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.out.println("*******************WELCOME TO LAMBTON HOUSING MANAGEMENT*****************************");
		System.out.println("Login as: \n"
							+"1.Business Admin \n"
							+"2.Customer\n");
	/*	Scanner userInput = new Scanner(System.in);
		String userSelection = userInput.next();
		System.out.println(":"+userInput+":");
		userInput.close();
		if(userSelection == "1") {
			System.out.println("Entered :"+userInput);
			BusinessAdmin.logIn();
			BusinessAdmin.businessUserOperationsMenu();
		}*/
		//Plot.createPlot();
		//Plot.generateId("plotId:plt-","plot");
		//Plot.generateId("-",",","plotId:plt-");
		//Plot.viewAllPlotData("");
		//Plot.getPlotQueryOptionsByPrefix("id");
		//Plot.getPlotQueryOptionsByPrefix("Province");
		PlotImplementation.createPlot();
	}
}


/*
Driver -> main class

plot class - methods
*/