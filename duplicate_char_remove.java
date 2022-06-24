package string_logical_program;

public class duplicate_char_remove
{
		public static void main(String[] args) 
		
		{
	        String str1 = "ab cd ef ab cdcd";
	        System.out.println("Old string: " + str1);
	        String newstr = "";

	        for (int i = 0; i <= str1.length()-1; i++) 
	        {  
	         char ch=str1.charAt(i);     //The Java String class charAt() method returns a char value at the given index number.
	         if(ch!=' ')     //space remove
	         {
	         
	         if(newstr.indexOf(ch)==-1)   //check char with string if char present then remove that char using-1
//	(The Java String class indexOf() method returns the position of the first occurrence of the specified character or 
//	string in a specified string-It returns the index position for the given char value)
	         {
	        	 newstr=newstr+ch;
	         }}}     
	        System.out.println("New String :" + newstr);
		}}


