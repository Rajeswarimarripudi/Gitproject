package Day1;

import java.util.ArrayList;

public class ArrayListColors {

	


	    public static void main(String[] args) {
	        // Create an ArrayList to store colors
	    	
	        ArrayList<String> colorsList = new ArrayList<>();

	        // Add colors to the ArrayList
	        colorsList.add("Red");
	        colorsList.add("Green");
	        colorsList.add("Blue");
	        colorsList.add("Yellow");
	        colorsList.add("Orange");

	        // Print out the collection
	        System.out.println("Colors in the ArrayList:");
	        for (String color : colorsList) {
	            System.out.println(color);
	        }
	    }
	}


