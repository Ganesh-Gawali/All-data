package All_logical_program;

public class string_methods2 
{
	public static void main(String[] args)
	{
		String s1="velocity";
		String s2="ABCD";
		String s3="abcd";
		String s4="abcabcab";
		String s5="";
		String s6="java classes";
		String s7="Hi";
		String s8=" GM";
		String s9 ="my name is xyz";


		System.out.println(s9.endsWith("xyz"));  //true
		System.out.println(s9.startsWith("my"));  //true
		
		System.out.println(s1.substring(2, 7));    //locit
		System.out.println(s1.substring(3));    //ocity

		
		System.out.println(s2.equalsIgnoreCase(s3));     //true    //not a case sensitive
		System.out.println(s1.contains("ve"));
		
		System.out.println(s1.charAt(3));    //o
		System.out.println(s4.indexOf('a'));    //0
		System.out.println(s4.lastIndexOf('c'));    

		System.out.println(s1.isEmpty());   //false 
		System.out.println(s5.isEmpty());    //true
		System.out.println(s6.replace("java", "selenium"));
		System.out.println(s7.concat(s8));     //Hi GM
		System.out.println(s7+s8);             //Hi GM
		

	}

}
