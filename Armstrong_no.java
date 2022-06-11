package All_logical_program;

public class Armstrong_no 
{
	public static void main(String[] args)
	{
		int num1=153;
		int sum=0;
		
		for(int i=num1;i>0;i=i/10)
		{
			int rem=i%10;
			sum=sum+(rem*rem*rem);
		}
		System.out.println(sum);
		if(num1==sum)
		{
			System.out.println("given no is armstrong");
		}
		else
		{
			System.out.println("given no is not armstrong");
		}
	}

}
