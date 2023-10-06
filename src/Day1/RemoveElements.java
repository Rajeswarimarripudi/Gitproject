package Day1;
import java.util.ArrayList;

public class RemoveElements {


	    public static void main(String[] args) {
	        // Create an ArrayList of numbers
	        ArrayList<Integer> numbersList = new ArrayList<>();

	        // Add numbers to the ArrayList
	        numbersList.add(10);
	        numbersList.add(20);
	        numbersList.add(30);
	        numbersList.add(40);
	        numbersList.add(50);

	        // Remove the third element from the ArrayList
	        if (numbersList.size() >= 3) {
	            numbersList.remove(2);
	            System.out.println("Third element removed successfully.");
	        } else {
	            System.out.println("There is no third element in the ArrayList.");
	        }

	        // Print out the updated collection
	        System.out.println("Numbers in the ArrayList after removal:");
	        for (int number : numbersList) {
	            System.out.println(number);
	        }
	    }
	}


