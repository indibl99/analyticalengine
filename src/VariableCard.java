
public class VariableCard extends Card{
	public VariableCard(String input)
	{
		type = input.substring(0,1);
		String temp = input.substring(input.indexOf(type));
		//Integer tempVal = Integer.parseInt(temp);
		//value = tempVal.intValue();
	}
	
	public void run()
	{
		if(type == "L")
		{
			//save the value of the current number card
			transferStoreToIngress(1);
		}
		else if(type == "S")
			transferEgressToStore(1);
	}
	
	public void transferStoreToIngress (int input)
	{
		
	}
	
	public void transferEgressToStore (int output)
	{
		
	}

	
	public String type;
	public int value;

}
