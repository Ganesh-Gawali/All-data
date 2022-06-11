package All_logical_program;

public class one_to_100_prime_no 
{
	public static void main(String[] args)
	{
		int num=100;
		int count=0;
		for(int i=1;i<=100;i++)
		{
			count=0;
			for(int j=2;j<=i/2;j++)
			{
			if(i % j == 0)
			{
				count++;
				break;
				
			}
			if(count==1)
			{
				System.out.println(i + " prime no  ");
			}
			else
			{
				System.out.println( i + " not prime no  " );
			}
			//count=0;
		}
		
	}

	}
}
