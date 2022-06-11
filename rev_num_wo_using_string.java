package All_logical_program;

public class rev_num_wo_using_string 
{
	
	
	public static void main(String[] args) 
	{
		
	
	int orgnum=12345;
	 int rev=0;
for(int i=orgnum;i>0;i=i/10)
{
	int rem=i%10;
	rev=rev*10+rem;
}
	 System.out.println(rev);
	 
//	while(orgnum>0)
//	{int rem=orgnum%10;
//	rev=rev*10+rem;
//	orgnum=orgnum/10;
//	}
//		
	}
	 
}

