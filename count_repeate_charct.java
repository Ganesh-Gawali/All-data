package string_logical_program;

import java.util.HashMap;
import java.util.Set;



public class count_repeate_charct 
{
	public static void main(String[] args) {

		String str = "abcaba";

		HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
						
				//0      5<=4		
		for (int i = 0; i <= str.length() - 1; i++) 
		{							//  4
			char charValue = str.charAt(i);   //b
			
			if (mp.containsKey(charValue))  //b  --> true
			{
				mp.put(charValue, mp.get(charValue) + 1);  //b, 1+1
			} 
			else
			{
				mp.put(charValue, 1);   //c,   1
			}
		}
		
		Set<Character> keys = mp.keySet(); //[a, b, c]
//		
//		//print occurence of each char
//		for (Character key : keys) 
//		{	
//			System.out.println(key +": "+ mp.get(key));
//		}
		
		
		
//		//print only duplicate character
		for (Character key : keys) 
		{
			if(mp.get(key)>1) 
			{
				System.out.println(key +": "+ mp.get(key));
			}
		}
		
		//System.out.println("a: "+ mp.get('a'));
		
	}
}
