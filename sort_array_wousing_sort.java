package All_logical_program;

public class sort_array_wousing_sort 
{
	public static void main(String[] args) 
	{
		int ar[]= {10,20,15,10,32,25,50};
		int a=1;
		for(int i=1;i<=50;i++)
		{
			for(int k=0;k<=ar.length-1;k++)
			{
				int ar1=ar[k];
				
				if(ar1==a)
				{
					System.out.println(ar1);
				}
			}
			a++;
		}
		
	}

}
