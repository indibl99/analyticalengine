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
		CardReader cReader = new CardReader(cards, store, mill);
		
		Store.printStoreIndexValue(100);
		
		//mill.setIngress(new Integer[50]); //retrieves a value from the store and sets it to the Ingress Axle 
		//mill.add();
		Integer []array = new Integer[50];
		array[49] = 3;
		array[48] = 4;
		mill.setEgress(array); //this line is  place holder
		
 
		Store.printStoreIndexValue(100);
	}

}
