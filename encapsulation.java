/// ENCAPSULATION ----> BINDING DATA WITH METHODS
package array;

class student
{
	 private int regno;
	 private String name;
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 
}

public class encapsulation 
{
	public static void main(String[] args)
	{
		student obj = new student();
		obj.setRegno(520);
		obj.setName("chethan");
		 System.out.println(obj.getRegno() + obj.getName());
	}
}
