
public class Rack {
	int index;
	int[] indexVal;
	
	public Rack(int startingIndex, Store store)
	{
		startingIndex = index;
		indexVal = store.values.get(index); //need to conver to a digit array
	}
	
	public void transferToIngress(CentralMill mill)
	{
		mill.ingressAxel = indexVal;
	}

}
