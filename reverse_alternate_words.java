package string_logical_program;

public class reverse_alternate_words
{
	public static void main(String[] args) 
	{
	
		String s1 = "my name is rahul";     //o/p  -->my  eman  is  luhar

		String [] ar =s1.split(" ");      // { my(0)   name(1)    is(2)   rahul(3) }
		
		
		for(int i=0; i<=ar.length-1;  i++) 
		{		
			if(i%2 != 0)
			{
				String org = ar[i];  //my
				String rev="";
				
				for(int j=org.length()-1; j>=0;  j--) 
				{
					rev = rev + org.charAt(j);
				}
				
				System.out.print(rev+ " ");
			}
			else 
			{
				System.out.print(ar[i]+ " ");
			}
			
		}
		
	}

}
