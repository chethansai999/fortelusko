package array;
class cal      ///super class
{
	public int add(int  ...i) 
	{
		int sum= 0;
		for (int k : i)
		{
			sum = sum+k;
		}
		return sum;
	}
}
class caladv extends cal     ///sub class
{
	public int sub( int ...l)
	{
		int sum= 0;
		for (int k : l)
		{
			sum = sum - k;
		}
		return sum;
	}
}
class supercal extends caladv    ///sub class
{
	public int mul( int ...e)
	{
		int sum= 1;
		for (int k : e )
		{
		sum = sum * k;
		}
	return sum;
	}
}

public class inheritace {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub 
		supercal c1 =new supercal();
		int result1 =c1.add(52, 58,55,58);
		int result2= c1.sub(52,4, 5,358);
		int result3= c1.mul(52, 5,95,8);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}

