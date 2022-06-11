package Exception_handling;

public class exception_handling 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=0;
		int c=0;
		
		try
		{
			 c=a/b;     //risky code   //10/0 =
		}
		catch (ArithmeticException e) 
		{
			System.out.println("arithmatic exception handled");
			c=a/1;   //10/1  =10
		}
		
//		//c=a/b;         // java.lang.ArithmeticException: / by zero
//		c=a/b;
		
		System.out.println(c);
		
		
		System.out.println("Hi");
		
	}


		
	}


