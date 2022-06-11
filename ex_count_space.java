package All_logical_program;

public class ex_count_space 
{
	public static void main(String[] args) 
	{
		String str="R U P A L I ";
		int count=0;
		
		for(int i=0;i<=str.length()-1;i++)
		{
			char str1=str.charAt(i);
			if(str1==' ')
			{
				count++;
			}
			
		}
	System.out.println("Total space "+ count);
		
		
	}

}
