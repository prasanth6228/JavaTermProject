/**
 * 
 */
package Utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import objects.Plot;

/**
 * @author varma
 *
 */
public class Utils {
	/*
	 * Object operations
	 * */
	public static void createRecord(Set<String> recordData,String filePath) throws IOException {
		//check if file exists	
		
		if(!fileExists(filePath)) { // file doesn't exist at the pointing path
			createNewFile(filePath); //create a new file
		}
		File actualFile = new File(filePath);
		FileWriter fileWriterObj = new FileWriter(actualFile, true);
		for(String fieldData:recordData) {
			fileWriterObj.write(fieldData);
		}
		fileWriterObj.close();
	}
	
	public static void updateRecord() {
		
	}
	
	public static void deleteRecord() {
		
	}
	
	/*
	 *  Read operation methods
	 * */
	
	/*
	public static void readDataFromUser(List<String> FieldNames) {
		List<String> inputList = new ArrayList<String>();
		for(int i=0;i<FieldNames.size();i++) {
			System.out.println("Enter "+FieldNames[i]);
		}
	}*/
	
	/*
	 * File operations
	 * */
	
	public static void createNewFile(String filePath) {
		try {
			File plotFile = new File(filePath);
			plotFile.createNewFile();
		}catch(Exception e){
			System.out.println("Error occured...."+e.getStackTrace());
		}
	}
	
	/* Send a file path to this method to check whether the file exists or not*/
	public static boolean fileExists(String filePath) {
		File plotFile = new File(filePath);
		return plotFile.exists();
	}
	
	
	
}
