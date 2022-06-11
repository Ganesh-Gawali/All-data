package All_logical_program;

public class ex2_1_to_1000_armstrongno
{
	public static void main(String[] args) 
	{
		int num;
		int sum=0;
		for(int i =1;i<=1000;i++)
		{
			num=i;
			while(num>0)
			{
				
			int rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
	
		}
	//	System.out.println(sum);
		if(sum==i)
		{
			System.out.println(    i + "  armstrong");
		}
		sum=0;
//		else
//		{
//			System.out.println("not Armstrong");
//		}
	}

}
}
