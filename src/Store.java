import java.util.*;

public class Store {	
	
	public ArrayList<Integer[]> values = new ArrayList<Integer[]>(); //should these be arrays of Integer objects?
	
	public Store()
	{
		for(int axel = 0; axel < 1000; axel++) //should really be 1000
		{
			//convert the added integer to a digit array
			Integer[] digits = new Integer[50];
			for(int k = 0; k < digits.length; k++)
			{
				digits[k] = new Integer(0);
			}
			
			String tempN = "" + axel;
			int j = tempN.length();
			for(int i = 0; i < tempN.length(); i++)
			{
				String currentN = tempN.substring(i, i+1);
				Integer currentNumber = Integer.parseInt(currentN);
				digits[50 - j] = currentNumber;
				j--;
			}
			values.add(digits);
			
		}
		printStoreIndex(999);
	}
	
	public void printStoreIndex(int index)
	{
		for(int i = 0; i < 50; i++)
		{
			System.out.println(values.get(index)[i].toString());
		}
	}
	

}
