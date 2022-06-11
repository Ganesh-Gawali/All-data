package All_logical_program;

public class array_split
{
	public static void main(String[] args) 
	{
   String s1="my name is Rupali";
		
		String ar []=s1.split(" ");     //[my name is abc]
		
		//System.out.println(ar[2]);
		System.out.println(ar.length);
		
		System.out.println("--print all data----");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
	}
}
