package All_logical_program;

public class array_string 
{
	public static void main(String[] args) 
	{
String ar1 []=new String[4];
		
		ar1[0]="ganesh";
		ar1[1]="mahesh";
		ar1[2]="suresh";
		ar1[3]="ramesh";
		//ar1[4]="abc";
		
		
		ar1[2]="abc";     //re-initialization
		
	
		System.out.println(ar1[2]);   //suresh
		System.out.println(ar1.length);
		
		System.out.println("------print all data-------");
		

		for(int i=0; i<=ar1.length-1; i++)
		{
			System.out.println(ar1[i]);
		}
		
		
	}

		
	}


