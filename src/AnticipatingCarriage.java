import java.util.Arrays;

public class AnticipatingCarriage {
	
	public Integer[] feeder = new Integer[50];
	public Integer[] adder = new Integer[50];
	public Integer[] sum = new Integer[50];
	boolean carry = false;


	public AnticipatingCarriage()
	{
		Arrays.fill(feeder, 0);
		Arrays.fill(adder,  0);
		Arrays.fill(sum, 0);
	}
	
	public void add(Integer[] a, Integer[] b, CentralMill mill) //add a + b
	{
		/* The Anticipating Carriage allows that Analytical Engine to add two numbers.
		 * A feeder axel picks up the first number, feeds it into the adder axel  by
		 * turning the adder the axel's gears the same number of notches it takes to zero
		 * out the feeder axel. The the feeder picks up the second number, and feeds that 
		 * into the adder through the same process, thus adding the two numbers. 
		 * After the second number is fed into the adder, if the adder axel passes 9, that 
		 * indicates that the machine needs to carry one over to the next digit up.
		 * Information obtained from https://www.youtube.com/watch?v=B2EDE8Srdcw
		 */
		feeder = a;
		adder = feeder;
		
		sum = adder;
		feeder = b;
		int firstAdd = 0;

		for(int digit = adder.length - 1; digit >= 0; digit--) //add a and b before carry
		{
			firstAdd = feeder[digit].intValue() + adder[digit].intValue();
			int secondAdd = firstAdd;
			if(carry) //checks to see if the previous digit resulted in a carry
			{
				firstAdd++;
			}
			if(firstAdd > 9)
			{
				secondAdd = firstAdd%10; //remainder when a carry is needed
				carry = true;
			}
			else
			{
				secondAdd = firstAdd;
				carry = false;
			}
			
			sum[digit] = secondAdd;

		}
		
		mill.egressAxel = sum; //transfers answer from anticipating carriage automatically to egress Axel
		
	}
	
	

}
