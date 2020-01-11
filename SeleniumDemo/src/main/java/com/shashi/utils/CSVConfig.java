package com.shashi.utils;

import java.io.FileReader;
import java.util.ArrayList;
import com.opencsv.CSVReader;

public class CSVConfig {

	public static String[][] getCSVData(String file) 
	{ 
	    try { 
	  
	        // Create an object of filereader 
	        // class with CSV file as a parameter. 
	        FileReader filereader = new FileReader(file); 
	  
	        // create csvReader object passing 
	        // file reader as a parameter 
	        CSVReader csvReader = new CSVReader(filereader); 
	        String[] nextRecord; 	      
	  
	        // we are going to read data line by line 
	        int numberOfRows=0,numberOfColumns=0;

    	    numberOfColumns =csvReader.readNext().length ;
    	    
    	    ArrayList<String[]> list = new ArrayList<>();
    		
	        while ((nextRecord = csvReader.readNext()) != null) { 
	        	
	        	list.add(nextRecord);
	        } 
	        
	        numberOfRows = list.size();
	        System.out.println("numberOfRows="+numberOfRows+",numberOfColumns="+numberOfColumns);
	        String [][]data = new String[numberOfRows][numberOfColumns];
   
	        for(int i=0;i<list.size();i++)
	        {
	        	for(int j=0;j<numberOfColumns;j++)
	        	{
	        		data[i][j] = list.get(i)[j];
	        		//System.out.println(data[i][j]);
	        	}
	        } 
	        
	        return data;
	    } 
	    catch (Exception e) { 
	        e.printStackTrace(); 
	    }
	    
	    return null;
	} 
}
