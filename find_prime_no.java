package All_logical_program;

public class find_prime_no 
{
public static void main(String[] args)
{
	int num=11;
	int count=0;
	
	for(int i=2;i<num;i++)
	{
		if(num % i == 0)
		{
			count++;
			break;
		}
		
	}
	if(count == 1)
	{
		System.out.println("given no is not prime");
	}
	else
	{
		System.out.println("given no is  prime");
}
	
}
}

