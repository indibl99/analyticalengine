import java.io.*;
import java.util.*;

public class AnalyticalEngine {
	
	public static void main (String args[]) throws IOException
	{
		//import text file - convert to an array of card objects? 
		Scanner sf = new Scanner (new File("C:\\data\\punch_cards.txt"));
		
		int maxIndx = -1;
		String[] text = new String[1000];
		ArrayList<String> cardText = new ArrayList<String>();
		
		while(sf.hasNext())
		{
			maxIndx++;
			text[maxIndx] = sf.nextLine();
			cardText.add(text[maxIndx]);
		}
		sf.close();
		
		ArrayList<Card> cards = new ArrayList<Card>();
		for(int i = 0; i < text.length; i++)
		{
			if(text[i].substring(0,0).equals("N"))
			{
				cards.add(new NumberCard(text[i]));
			}
			else if(text[i].substring(0,0).equals("OP"))
			{
				cards.add(new OperationCard(text[i]));
			}
			else if(text[i].substring(0,0).equals("L") || text[i].substring(0,0).equals("S"))
			{
				cards.add(new VariableCard(text[i]));
			}
		}
		//cycle through commands and call methods of each card? 

	}

}
