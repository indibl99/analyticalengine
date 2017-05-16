
public class OperationCard extends Card{
	public OperationCard(String input)
	{
		String temp = input.substring(input.indexOf(type));
		operation = temp; //will need to conver this to an actual operation 
	}
	
	public String type = "OP";
	public String operation;
}
