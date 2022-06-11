package All_logical_program;

public class array_prog 
{
	public static void main(String[] args) 
	{
		
		//step1: array declaration	
		int ar []=new int[5];	
		
		//Step2: array initialization
		ar[0]=50;
		ar[1]=20;
		ar[2]=10;
		ar[3]=40;
		ar[4]=30;
		
		//step3: array usage
		System.out.println(ar[3]);   //40
		System.out.println(ar.length);  //5
			
			
		System.out.println("-------print all data from int array-----------");

	
	for(int i=0; i<=ar.length-1; i++)
	{					//    4
		System.out.println(ar[i]);   //50 20 10 40 30
	}
	System.out.println("print in reverse order");
	for(int i=ar.length-1;i>=0;i--)
		
	{
		System.out.println(ar[i]);
	}
		
	}

	}
	


