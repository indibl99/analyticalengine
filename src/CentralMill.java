import java.util.Vector;


public class CentralMill {
	
	public Vector<Integer> rack = new Vector<Integer>(10);
	
	//public int ingressAxel; //note: a vector would more closely model a 50 digit number
	public Integer[] ingressAxel = new Integer[50];
	public Integer[] egressAxel = new Integer[50];
	
	public boolean runUpLeverOn = false;
	
	public CentralMill()
	{
		
	}
	
	public void setIngress(Integer[] input) //input will be from the store - maybe pass the Store and an index? 
	{
		ingressAxel = input;
	}
	
	public void setEgress(Integer[] output)
	{
		egressAxel = output;
	}
	
	public void add()
	{
		//TBD
	}

}
