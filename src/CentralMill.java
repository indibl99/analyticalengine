import java.util.*;


public class CentralMill {
	
	/* (please refer to the diagram of the Analytical Engine in our written report)
	 *  In the actual machine, numbers that were being used as input for various calculations
	 *  were held in one of the three ingress axles. These columns were physically a stack of 50, 10-tooth gears 
	 *  in which each gear tooth represented a digit 0-9, such that each axel (or column) could represent
	 *  one number of  a maximum of 50 digits.
	 *  The egress axel is the same as the ingress axel, except it stores output numbers after the calculation
	 *  has been performed rather than input numbers.
	 *  
	 *  The Central Mill of the analytical engine functions as the Central Processing Unit (stores numbers
	 *  to be used in calculations immediately, transfers numbers into the appropriate apparatus
	 *  to perform the given operation.
	 *  
	 */
	
	public Integer[] ingressAxel0 = new Integer[50];
	public Integer[] ingressAxel1 = new Integer[50];
	public Integer[] ingressAxelP = new Integer[50];
	public Integer[] egressAxel = new Integer[50];
	public AnticipatingCarriage aCarriage = new AnticipatingCarriage();
	
	public int currentAxel = 0; //keeps track of which ingress axel should be used
		
	public CentralMill()
	{
		
	}
	
	public void setIngress(int which, Integer[] input) 
	{
		//alternates which ingress axel is used 
		if (which == 0) {
			ingressAxel0 = input;
			currentAxel = 1;
		}
		else {
			ingressAxel1 = input;
			currentAxel = 0;
		}
	}
	
	public void setIngressP(Integer[] input)
	{
		ingressAxelP = input;
	}
	
	public void setEgress(Integer[] output)
	{
		egressAxel = output;
	}
	
	public int convertToInt(Integer[] axel)
	{
		int converted = 0;
		String num = "";
		for(int i = 0; i < axel.length; i++)
		{
			num = num + axel[i];
		
		}
		converted = Integer.parseInt(num);
		return converted;
	}

}
