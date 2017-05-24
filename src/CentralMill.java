import java.util.Vector;


public class CentralMill {
	
	public Vector<Integer> rack = new Vector<Integer>(10);
	
	//public int ingressAxel1; //note: a vector would more closely model a 50 digit number
	public Integer[] ingressAxel0 = new Integer[50];
	public Integer[] ingressAxel1 = new Integer[50];
	public Integer[] ingressAxelP = new Integer[50];
	public Integer[] egressAxel = new Integer[50];
	public int currentAxel = 0;
	
	public boolean runUpLeverOn = false;
	
	public CentralMill()
	{
		
	}
	
	public void setIngress(int which, Integer[] input) //input will be from the store - maybe pass the Store and an index? 
	{
		if (which == 0) {
			ingressAxel0 = input;
			currentAxel = 1;
		}
		else {
			ingressAxel1 = input;
			currentAxel = 0;
		}
	}
	
	public void setIngressP(Integer[] input) //input will be from the store - maybe pass the Store and an index? 
	{
		ingressAxelP = input;
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
