import java.util.*;

public class Store {	
	
	public static ArrayList<Integer[]> values = new ArrayList<Integer[]>(); //should these be arrays of Integer objects?
	
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
		//printStoreIndex(100);
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
