package array;
class y
{
	public y()
	{
		System.out.println("hello world");
	}
	public y(int i)
	{
		System.out.println("hello asia");
	}
}
class z extends y
{
	public  z()
	{
		super ();
		System.out.println("hello india");
	}
		
	public  z(int i)
	{
		super (i);
		System.out.println("hello telangana");
	}
}

public class methodoveridingsuperkeyword 
{
	public static void main(String[] args) {
	      z obj=new z(5);
		}
}
