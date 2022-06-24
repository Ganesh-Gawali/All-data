package string_logical_program;

import java.util.HashMap;
import java.util.Set;

public class count_repeate_string 
{
	public static void main(String[] args) {

		String str = "abc abcd abc abcd abc xyz abc abc xyz xyz xyz ab";

		String ar[] = str.split(" "); // [abc abcd abc abcd abc xyz abc abc xyz xyz xyz ab]

		HashMap<String, Integer> mp = new HashMap<String, Integer>();

		
		for (int i = 0; i <= ar.length - 1; i++)
		{
							//0
			String s1 = ar[i];  //abc
			
			if (mp.containsKey(s1)) 
			{
				mp.put(s1, mp.get(s1) + 1);
			} 
			else 
			{
				mp.put(s1, 1);
			}

		}

		Set<String> keys = mp.keySet(); // [abc abcd xyz]
		
		//occurence of each word
//		for (String key : keys) 
//		{		
//			System.out.println(key + ": " + mp.get(key));
//		}	
		
		
		for (String key : keys) 
		{		
			if(mp.get(key)>1)
			{			
				System.out.println(key + ": " + mp.get(key));
			}
		}	
		
		
			
		
		//Collection<Integer> allValues = mp.values(); //[1 2 3 4]
		
	}
}



