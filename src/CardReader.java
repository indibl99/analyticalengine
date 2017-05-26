import java.io.*;
import java.util.*;
public class CardReader {
	
	public CardReader(ArrayList<String> cards, Store store, CentralMill mill)
	{
		/* Although the punch cards for the Analytical Engine would be different, we have chosen to 
		 * use the following system to represent number, operation, and variable cards (adapted from the following
		 * project: https://www.fourmilab.ch/babbage/)
		 * 
		 * N: indicates a number card
		 * 		the number immediately after N indicates the address of the store of that number
		 * 		the following number indicates the value to be stored
		 * L, S, or Z: indicates a variable card
		 * +, -, /, or *: indicates an operation card
		 * 
		 */
		
		
		
		
		for(int i = 0; i < cards.size(); i++)
		{
			String type = cards.get(i).substring(0,1);
			
			switch(type)
			{
			//note: current code does not account for bad user input input
			case "N":
				String tempNA = cards.get(i).substring(1, 4);
				Integer address = Integer.parseInt(tempNA); //parses the address from the punch card
				String tempNB = cards.get(i).substring(5, 6); //parses the value to be stored at that address in the Store
				String tempNC;
				if(tempNB.equals("-")) //if value is negative (however, current model does not allow for subtraction, so trying to add a negative number will not work properly)
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
				System.out.println(cards.get(i) + ": " + val + " stored in address " + address + " of Store");
				store.values.set(address, valArray); 
				
				Integer[] arrayN = new Integer[50];
				Arrays.fill(arrayN, 0);
				
				mill.setIngress(mill.currentAxel,arrayN); //zeroes the ingress axel
				
				break;
			case "L": //transfer from Store to ingress
				String tempLA = cards.get(i).substring(1,4);
				int addressL = Integer.parseInt(tempLA);
				mill.setIngress(mill.currentAxel, store.values.get(addressL));
				System.out.println(cards.get(i) + ": transfer Store value at address " + addressL + " to Ingress Axel #" + mill.currentAxel);
				break;
				
			case "S": //transfer from egress to Store
				String tempSA = cards.get(i).substring(1,4);
				int addressS = Integer.parseInt(tempSA);
				store.values.set(addressS, mill.egressAxel);
				System.out.println(cards.get(i) + ": transfers " + mill.convertToInt(mill.egressAxel) + " from egress axel to address " + addressS + " in Store");
				break;
				
			case "Z": //transfer from store to mill, zeroing that address in the store
				String tempZA = cards.get(i).substring(1,4);
				int addressZ = Integer.parseInt(tempZA);
				mill.setIngress(mill.currentAxel, store.values.get(addressZ));
				
				Integer[] arrayZ = new Integer[50];
				Arrays.fill(arrayZ, 0);
				store.values.set(addressZ, arrayZ); //zeroes that address in the Store
				break;
			case "+":
				Integer[] a = mill.ingressAxel0;
				Integer[] b = mill.ingressAxel1;
				System.out.println(cards.get(i) + ": adds " + mill.convertToInt(a) + " + " + mill.convertToInt(b) + " by feeding those values into the anticipating carriage");
				mill.aCarriage.add(a, b, mill);
				break;
			case "-":
				//would include a call to a subtract method, with a setup similiar to add
				break;
				
			case "*":
				//would include a call to a multiply method, with a setup similiar to add
				break;
				
			case "/":
				//would include a call to a divide method, with a setup similiar to add
				
				break;
			default:
				continue;
			
			}
			
			
		}
	}

}
