import java.util.Vector;


public class CentralMill {
	
	public Vector<Integer> rack = new Vector<Integer>(10);
	
	//public int ingressAxel; //note: a vector would more closely model a 50 digit number
	public int[] ingressAxel = new int[50];
	public int[] egressAxel = new int[50];

	
	
	public boolean runUpLeverOn;
	
	public CentralMill()
	{
		
	}
	
	public void setIngress(int[] input) //input will be from the store - maybe pass the Store and an index? 
	{
		ingressAxel = input;
	}
	
	public void setEgress(int[] output)
	{
		egressAxel = output;
	}

}
