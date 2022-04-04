/**
 * 
 */
package objectImplementation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import Utils.Utils;
import objects.Plot;

/**
 * @author varma
 *
 */
public class PlotImplementation {
	
	public static void createPlot() {
		Plot plt;
		try {
			plt = readPlotDataFromUser();
			plt.setPlotId(String.valueOf(Plot.generateId("-",Plot.getSeperator(),Plot.getPlotidprefix())));
		    	
			Set<String> recordData = new HashSet<String>();
		    recordData.add("\n"+Plot.getPlotidprefix()+plt.getPlotId()+Plot.getLineseperator());
		    recordData.add(Plot.getPlotnameprefix()+plt.getPlotName()+Plot.getLineseperator());
		    recordData.add(Plot.getPlotpriceprefix()+String.valueOf(plt.getPlotPrice())+Plot.getLineseperator());
		    recordData.add(Plot.getPlotstatusprefix()+plt.getStatus()+Plot.getLineseperator());
		    recordData.add(Plot.getPlotprovinceprefix()+plt.getProvince()+Plot.getLineseperator());
		    recordData.add(Plot.getPlotcityprefix()+plt.getCity()+Plot.getLineseperator());
		    recordData.add(Plot.getPlotstreetprefix()+plt.getStreet()+Plot.getLineseperator());
		    recordData.add(Plot.getPlotzipcodeprefix()+plt.getZipCode()+Plot.getLineseperator());
		    recordData.add("=====");
		    Utils.createRecord(recordData,"plot.txt");
		    
		} catch (Exception e) {
			System.out.println("An error occurred.");
		    e.printStackTrace();
		}
	}
	
	public static void updatePlot() {
		
	}
	
	public static void deletePlot() {
		
	}
	
	// read plot data method
		public static Plot readPlotDataFromUser() {
			//System.out.println();
			System.out.println("Reading plot Data.......");
				
			Scanner plotInput = new Scanner(System.in);
				
			System.out.println("Please enter the plot name:");
			String plotName = plotInput.nextLine();
				
			System.out.println("Please enter the plot price:");
			double plotPrice = plotInput.nextDouble();
				
			System.out.println("Please enter the plot staus:");
			String plotSatus = plotInput.nextLine();
				
			System.out.println("Please enter the plot province:");
			String plotProvince = plotInput.nextLine();
				
			System.out.println("Please enter the plot city:");
			String plotCity = plotInput.nextLine();
				
			System.out.println("Please enter the plot street:");
			String plotStreet = plotInput.nextLine();
				
			System.out.println("Please enter the plot zipcode:");
			String plotzipCode = plotInput.nextLine();
				
				
			plotInput.close();
				
			Plot plotRef = new Plot(plotName,plotPrice,plotProvince,plotSatus,plotCity,plotStreet,plotzipCode);
			return plotRef;
		}
}
