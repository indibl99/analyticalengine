import java.util.*;

public class Store {	
	
	/* The Store of the Analytical Engine is similiar the the memory of the modern computer
	 * Consisting of 1000 axels (like the ingress/egress set up), each offering the possibility
	 * to store a number of a maximum of 50 digits. In our model, an array list represents the 
	 * collection of axels composing the store (each of which has a corresponding address), and 
	 * each Integer array within the array list represents an axel with each element representing one of 50 digits 
	 * 
	 * 
	 */
	
	public static ArrayList<Integer[]> values = new ArrayList<Integer[]>(); 
	
	public Store()
	{
		for(int axel = 0; axel < 1000; axel++) 
		{
			//convert the added integer to a digit array
			Integer[] digits = new Integer[50];
			
			for(int k = 0; k < digits.length; k++)
			{
				digits[k] = new Integer(0);
			}
			
			values.add(digits);
			
		}
	}
	
	public static void printStoreIndexValue(int index)
	{
		for(int i = 0; i < 50; i++)
		{
			System.out.print(values.get(index)[i].toString());
		}
		System.out.println("");
	}
	
	public static Integer[] convertToIntArray(Integer num)
	{
		Integer[] digits = new Integer[50];
		
		for(int k = 0; k < digits.length; k++)
		{
			digits[k] = new Integer(0);
		}
		
		String tempN = "" + num;
		int j = tempN.length();
		for(int i = 0; i < tempN.length(); i++)
		{
			String currentN = tempN.substring(i, i+1);
			Integer currentNumber = Integer.parseInt(currentN);
			digits[50 - j] = currentNumber;
			j--;
		}
		return digits;
			
	}


}
