package array;
class sai 
{
	public int add(int ... i)
	{
		int sum=0;
		for (int k : i)
		{
			sum = sum + k ;
		}
		return(sum);
	}
}
public class varags
{
	public static void main(String[] args) 
	{
		sai obj = new sai();
		
		System.out.print(obj.add(5,54,515,5));
	}

}
