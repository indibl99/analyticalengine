import java.io.*;
import java.util.*;
public class CardReader {
	
	public CardReader(ArrayList<String> cards, Store store, CentralMill mill)
	{
		/* Although the punch cards for the Analytical Engine would be different, we have chosen to 
		 * use the following system to represent number, operation, and variable cards (adapted from the following
		 * project: https://www.fourmilab.ch/babbage/)
		 * 
		 * N - indicates a number card
		 * L or S - indicates...
		 * X - indicates...
		 * 
		 */
		
		
		
		
		for(int i = 0; i < cards.size(); i++)
		{
			String type = cards.get(i).substring(0,1);
			
			switch(type)
			{
			case "N":
				String tempNA = cards.get(i).substring(1, 4);
				Integer address = Integer.parseInt(tempNA); //parses the address from the punch card
				String tempNB = cards.get(i).substring(5, 6); //parses the value to be stored at that address in the Store
				String tempNC;
				if(tempNB.equals("-")) //if value is negative
				{
					tempNC = cards.get(i).substring(6);
				}
				else
				{
					tempNC = cards.get(i).substring(5);
				}
				
				Integer val = Integer.parseInt(tempNC);
				Integer[] valArray = Store.convertToIntArray(val);
				mill.setIngress(mill.currentAxel,valArray); //stores that value to be transferred into the store in the ingress axel
				store.values.set(address, valArray); 
				
				Integer[] arrayN = new Integer[50];
				Arrays.fill(arrayN, 0);
				
				mill.setIngress(mill.currentAxel,arrayN); //zeroes the ingrexx axel
				Store.printStoreIndexValue(100);
				
				break;
			case "L":
				String tempLA = cards.get(i).substring(1,4);
				int addressL = Integer.parseInt(tempLA);
				mill.setIngress(mill.currentAxel, store.values.get(addressL));
				break;
				
			case "S":
				String tempSA = cards.get(i).substring(1,4);
				int addressS = Integer.parseInt(tempSA);
				store.values.set(addressS, mill.egressAxel);
				break;
				
			case "Z":
				String tempZA = cards.get(i).substring(1,4);
				int addressZ = Integer.parseInt(tempZA);
				mill.setIngress(mill.currentAxel, store.values.get(addressZ));
				
				Integer[] arrayZ = new Integer[50];
				Arrays.fill(arrayZ, 0);
				store.values.set(addressZ, arrayZ); //zeroes that address in the Store
				break;
			case "+":
				
				break;
			case "-":
				
				break;
				
			case "*":
				
				break;
				
			case "/":
				
				break;
			default:
				continue;
			
			}
			
			
		}
	}

}
