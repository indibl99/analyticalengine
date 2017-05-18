
public class NumberCard extends Card {
	public NumberCard(String input)
	{
		String temp = input.substring(input.indexOf(type));
		//Integer tempVal = Integer.parseInt(temp);
		//value = tempVal.intValue();
	}
	
	public String type = "N";
	public int value;
}
