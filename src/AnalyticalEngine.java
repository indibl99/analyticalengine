import java.io.*;
import java.util.*;
import java.util.Vector;

public class AnalyticalEngine {
	
	public static void main (String args[]) throws IOException
	{
		Store store = new Store();
		CentralMill mill = new CentralMill();
		
		//import text file - convert to an array of card objects? 
		Scanner sf = new Scanner (new File("C:\\data\\punch_cards.txt"));
		
		int maxIndx = -1;
		String[] text = new String[1000];
		ArrayList<String> cards = new ArrayList<String>();
		
		while(sf.hasNext())
		{
			maxIndx++;
			text[maxIndx] = sf.nextLine();
			cards.add(text[maxIndx]);
		}
		sf.close();
		
		mill.setIngress(store.values.get(12)); //retrieves a value from the store and sets it to the Ingress Axle 
		mill.add();
		mill.setEgress(new Integer[50]); //this line is  place holder
		
		
		
		//retrieve 0th value from store and set ingress axel to that value
		
		//ArrayList<Card> cards = new ArrayList<Card>();
		/*for(int i = 0; i < text.length; i++)
		{
			if(text[i].substring(0,1).equals("N"))
			{
				cards.add(new NumberCard(text[i]));
			}
			else if(text[i].substring(0,1).equals("OP"))
			{
				cards.add(new OperationCard(text[i]));
			}
			else if(text[i].substring(0,1).equals("L") || text[i].substring(0,0).equals("S"))
			{
				cards.add(new VariableCard(text[i]));
			}
		} */
		//cycle through commands and call methods of each card? 

	}

}
