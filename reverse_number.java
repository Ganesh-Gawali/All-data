package All_logical_program;

public class reverse_number
{
	public static void main(String[] args)
	{
		
		int orgnum=12345;
		 String num=Integer.toString(orgnum);
		 String rev=" ";
		 //for(int i= orgnum.length-1;i>=0;i--)
		 for(int i=num.length()-1;i>=0;i--)
		 {
			 rev=rev+num.charAt(i);
		 }
		 System.out.println(rev);
		 int revnum=Integer.parseInt(rev);
		 //int revnum=Integer.parseInt(rev);
		 System.out.println(revnum );
	}
}