package array;

public class enhancedforloop 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[][] = {
				{5,64,4,246},
				{34,154,26,246},
				{43,4,34},
				{44,134,32,413}
					};
		
		//for(int i=0;i<a.length;i++)
		//{
			//for(int j=0;j<a[i].length;j++)
				//{
				//	System.out.print(a[i][j]+" ");
				//}
			//System.out.println();
			//}
		for (int k[] : a)
		{
			for (int l : k)
			{
				System.out.print(l + " ");
			}
			System.out.println();
		}
	}

}
