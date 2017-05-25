import java.io.*;
import java.util.*;

public class AnalyticalEngine {
	
	public static void main (String args[]) throws IOException
	{
		Store store = new Store();
		CentralMill mill = new CentralMill();
		boolean steam = true; //Babbage's engine was powered by a steam engine

		run(steam, store, mill);
	}
	
	public static void run(boolean steamOn, Store store, CentralMill mill) throws IOException
	{
		if(steamOn)
		{
			/* imports punchcards from a text file.
			 * Lovelace and Babbage's Engine was programmed using punch cards that pressed certain levers 
			 * to indicate any given operation. We  chose to model a series of physical punch cards strung 
			 * together as a text file, in which each line represents a punch card.
			 * */

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
			
		}
	}

}
