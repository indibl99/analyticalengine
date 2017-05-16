
public class VariableCard extends Card{
	public VariableCard(String input)
	{
		type = input.substring(0,0);
		String temp = input.substring(input.indexOf(type));
		Integer tempVal = Integer.parseInt(temp);
		value = tempVal.intValue();
	}
	
	public String type;
	public int value;

}
