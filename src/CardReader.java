import java.io.*;
import java.util.*;
public class CardReader {
	
	public CardReader(ArrayList<String> cards, Store store, CentralMill mill)
	{
		for(int i = 0; i < cards.size(); i++)
		{
			String type = cards.get(i).substring(0,1);
			
			switch(type)
			{
			case "N":
				String tempNA = cards.get(i).substring(1, 4);
				Integer address = Integer.parseInt(tempNA);
				String tempNB = cards.get(i).substring(5, 6);
				String tempNC;
				if(tempNB.equals("-"))
				{
					tempNC = cards.get(i).substring(6);
				}
				else
				{
					tempNC = cards.get(i).substring(5);
				}
				
				Integer val = Integer.parseInt(tempNC);
				Integer[] valArray = Store.convertToIntArray(val);
				mill.setIngress(valArray);
				store.values.set(address, valArray);
				mill.setIngress(new Integer[50]);  //POTENTIAL BUG?
				
				break;
			case "L":
				String tempLA = cards.get(i).substring(1,4);
				int addressL = Integer.parseInt(tempLA);
				mill.setIngress(store.values.get(addressL));
				break;
				
			case "S":
				String tempSA = cards.get(i).substring(1,4);
				int addressS = Integer.parseInt(tempSA);
				store.values.set(addressS, mill.egressAxel);	
				break;
				
			case "Z":
				String tempZA = cards.get(i).substring(1,4);
				int addressZ = Integer.parseInt(tempZA);
				mill.setIngress(store.values.get(addressZ));
				store.values.set(addressZ, new Integer[50]);
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
