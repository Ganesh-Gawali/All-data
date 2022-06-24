package string_logical_program;

public class reverse_para
{
	public static void main(String[] args)
	{
		
		String s1="my name is rupali";
		
		String [] ar = s1.split(" ");         //{my(0)    name(1)    is(2)    rahul(3)}
		
		  //     3
		for(int i=ar.length-1; i>=0; i--) 
		{
			System.out.print(ar[i]+" ");      //
		}
			
	}
}
