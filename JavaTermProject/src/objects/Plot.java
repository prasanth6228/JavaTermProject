/**
 * 
 */
package objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
/**
 * @author Satya Dantuluri
 *
 */
public class Plot {
	
	private String plotId;
	private String plotName;
	private double plotPrice;
	private String status; // Sold,In-sale,No-Sale
	private String province;
	private String city;
	private String street;
	private String zipCode;
	//private String currency;
	
	private static final String prefixDataSeperator = ":";
	private static final String seperator = ",";
	private static final String lineSeperator = seperator+"\n";
	
	private static final String plotIdPrefix = "plotId"+prefixDataSeperator+"plt-";
	private static final String plotNamePrefix = "plotName"+prefixDataSeperator;
	private static final String plotPricePrefix = "plotPrice"+prefixDataSeperator;
	private static final String plotStatusPrefix = "plotSatus"+prefixDataSeperator;
	private static final String plotprovincePrefix = "plotProvince" + prefixDataSeperator;
	private static final String plotcityPrefix = "city" + prefixDataSeperator;
	private static final String plotStreetPrefix = "street" + prefixDataSeperator;
	private static final String plotZipCodePrefix = "zipCode" + prefixDataSeperator;
	
	//Param constructor to initialize the fields data
	public Plot(String plotName, 
				double plotPrice, 
				String province, 
				String status, 
				String city,
				String street, 
				String zipCode) {
		this.plotName = plotName;
		this.plotPrice = plotPrice;
		this.province = province;
		this.city = city;
		this.street = street;
		this.zipCode = zipCode;
	}
	// no-arg constructor, explicitly use set methods to set the data to fields
	public Plot(){
		
	}
	/**
	 * @return the prefixdataseperator
	 */
	public static String getPrefixdataseperator() {
		return prefixDataSeperator;
	}
	/**
	 * @return the seperator
	 */
	public static String getSeperator() {
		return seperator;
	}
	/**
	 * @return the lineseperator
	 */
	public static String getLineseperator() {
		return lineSeperator;
	}
	/**
	 * @return the plotidprefix
	 */
	public static String getPlotidprefix() {
		return plotIdPrefix;
	}
	/**
	 * @return the plotnameprefix
	 */
	public static String getPlotnameprefix() {
		return plotNamePrefix;
	}
	/**
	 * @return the plotpriceprefix
	 */
	public static String getPlotpriceprefix() {
		return plotPricePrefix;
	}
	/**
	 * @return the plotstatusprefix
	 */
	public static String getPlotstatusprefix() {
		return plotStatusPrefix;
	}
	/**
	 * @return the plotprovinceprefix
	 */
	public static String getPlotprovinceprefix() {
		return plotprovincePrefix;
	}
	/**
	 * @return the plotcityprefix
	 */
	public static String getPlotcityprefix() {
		return plotcityPrefix;
	}
	/**
	 * @return the plotstreetprefix
	 */
	public static String getPlotstreetprefix() {
		return plotStreetPrefix;
	}
	/**
	 * @return the plotzipcodeprefix
	 */
	public static String getPlotzipcodeprefix() {
		return plotZipCodePrefix;
	}
	
	// Setter and getter methods

	/**
	 * @return the plotId
	 */
	public String getPlotId() {
		return plotId;
	}

	/**
	 * @param plotId the plotId to set
	 */
	public void setPlotId(String plotId) {
		this.plotId = plotId;
	}

	/**
	 * @return the plotName
	 */
	public String getPlotName() {
		return plotName;
	}

	/**
	 * @param plotName the plotName to set
	 */
	public void setPlotName(String plotName) {
		this.plotName = plotName;
	}

	/**
	 * @return the price
	 */
	public double getPlotPrice() {
		return plotPrice;
	}

	/**
	 * @param price the price to set
	 */
	public void setPlotPrice(double plotPrice) {
		this.plotPrice = plotPrice;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * @param province the province to set
	 */
	public void setProvince(String province) {
		this.province = province;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public static void plotOptionsMenu() {
		System.out.println("Please select an operation to perform....\n"
							+"1.Create a plot\n"
							+ "2.Update a plot details\n"
							+ "3.Delete a plot\n");
		Scanner userInput = new Scanner(System.in);
		String userSelection = userInput.next();
		if(userSelection == "1") {
			Plot.createPlot();
		}else if(userSelection == "2") {
			Plot.updatePlot();
		}else if(userSelection == "3") {
			Plot.deletePlot();
		} 
	}
	
	//creates plot
	public static void createPlot() {
		Plot plt;
		try {
			plt = readPlotDataFromUser();
			//plt.setPlotId("3");
			plt.setPlotId(String.valueOf(Plot.generateId("-",seperator,plotIdPrefix)));
			
			File plotFile = new File("plot.txt");
		    if (plotFile.createNewFile()) {
		    	System.out.println("File created: " + plotFile.getName());
		    } else {
		    	System.out.println("File already exists.");
		    	//File myObj = new File("plots.txt");
		    	FileWriter PlotFilewriter = new FileWriter(plotFile, true);
		    	PlotFilewriter.write("\n"+plotIdPrefix+plt.getPlotId()+lineSeperator);
		    	PlotFilewriter.write(plotNamePrefix+plt.getPlotName()+lineSeperator);
		    	PlotFilewriter.write(plotPricePrefix+String.valueOf(plt.getPlotPrice())+lineSeperator);
		    	PlotFilewriter.write(plotStatusPrefix+plt.getStatus()+lineSeperator);
		    	PlotFilewriter.write(plotprovincePrefix+plt.getProvince()+lineSeperator);
		    	PlotFilewriter.write(plotcityPrefix+plt.getCity()+lineSeperator);
		    	PlotFilewriter.write(plotStreetPrefix+plt.getStreet()+lineSeperator);
		    	PlotFilewriter.write(plotZipCodePrefix+plt.getZipCode()+lineSeperator);
		    	PlotFilewriter.write("=========================================");
		    	PlotFilewriter.close();
		    }
		} catch (IOException e) {
			System.out.println("An error occurred.");
		    e.printStackTrace();
		}
	}
	
	public static int generateId(String start, String end, String objectPrefix) {
		int maxId=0;
		String s ="";
		try {
		File file = new File("./plot.txt");
		Scanner sc = new Scanner(file);
		int currentId;
	    while (sc.hasNextLine()) {	
	    	s =  sc.nextLine();
	    	if(s.contains(objectPrefix) && s.contains(start) && s.contains(end) ) { // plotId:plt-
	    		System.out.println("<<<<<"+s.substring((s.indexOf(start))+1,s.indexOf(end)));
	    		currentId = Integer.parseInt(s.substring((s.indexOf(start))+1,s.indexOf(end)));
	    		maxId = (maxId < currentId) ? currentId : maxId;
	    	}
	    }
	    System.out.println("maxId::::"+maxId);
	   
	    }catch(Exception e) {
	    	System.out.println("***** Exception occured *******"+e.getMessage());
	    }
		return maxId+1;
	}

	// updates a plot details
	public static void updatePlot() {
		//update plot by inputting id
		
		//update plot by selecting id from list of plots
	}
	
	//deletes a plot 
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
	
	/*Use this method to view the plot data
	 * By plotId
	 * View all plots
	 * 
	 * View plots by city(region)
	 * view plots by province
	 * */
	
	public static Set<String> getPlotQueryOptionsByPrefix(String filter) {
		String prefix="";
		String fieldData;
		//HashMap<String, String> plotMap = null; //new HashMap<String, String>();
		//List<String> outputList = new ArrayList<String>();
		
		Set<String> outputList = new HashSet<String>();
		if(filter.equalsIgnoreCase("id")) {
			prefix = plotIdPrefix;// "plotId:";
			//plotIdMap = new HashMap<String, String>();
		}else if(filter.equalsIgnoreCase("province")){
			prefix = plotprovincePrefix;//"plotProvince:";
		}
		try {
			File file = new File("./plot.txt");
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {	
				//System.out.println(sc.nextLine());
				fieldData = sc.nextLine();
				if(fieldData.contains(prefix)) {
					System.out.println(">>"+fieldData.substring((fieldData.indexOf(":"))+1,fieldData.indexOf(",")));
					outputList.add(fieldData.substring((fieldData.indexOf(prefixDataSeperator))+1,fieldData.indexOf(seperator)));
				}
			}
			System.out.println("outputList:::"+outputList);
		}catch(Exception e) {
	    	System.out.println("***** Exception occured ****viewAllPlotData***"+e.getMessage());
	    }
		return outputList;
	}
	
	public static void viewAllPlotData(String filter) {
		try {
			File file = new File("./plot.txt");
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {	
				System.out.println(sc.nextLine());
			}
		}catch(Exception e) {
	    	System.out.println("***** Exception occured ****viewAllPlotData***"+e.getMessage());
	    }
	}
	
	public static void viewPlotDataById(String id) {
		
	}
	
	public static void viewPlotsData() {
		
	}
	
}























