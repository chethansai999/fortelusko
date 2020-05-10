package array;
class A
{
	public void show()
	{
		System.out.println("first");
	}
}
class B extends A
{
	public void show()
	{
	System.out.println("second");
	}
	public void rey()
	{
	System.out.println("second");
	}
}
class c extends B
{
	public void show()
	{
	System.out.println("third");
	}	
}

public class DYNAMAICMETHOD 
{
	public static void main(String[] args)
	{
		A obj = new B();    ///run time polymarphisnm
		obj.show();
		
		obj = new c();     ///dynamic  methos dispatchṇ
		obj.show();
	}
}
