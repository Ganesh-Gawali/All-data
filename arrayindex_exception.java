package Exception_handling;

public class arrayindex_exception 
{
	public static void main(String[] args)
	{
		

//int ar []=new int[5];
//
//
//try 
//{
//	ar[2]=10;     //risky code
//}
//catch (ArrayIndexOutOfBoundsException e) 
//{
//	System.out.println("array index outof bounds exception handled");
//}
//
////ar[7]=10;           java.lang.ArrayIndexOutOfBoundsException: 7
//
//System.out.println("hello");
		
int ar []=new int[5];
		
		
		try 
		{
			ar[7]=10;     //risky code
		}
		catch (ArithmeticException e)
		{
			System.out.println("ArithmeticException handled");
		}
		catch (StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBoundsException handled");

		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("array index out of bounds exception handled");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("generic Exception handled");
		}

		System.out.println("hello");

		
		
	}
}

