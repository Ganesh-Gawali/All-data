package All_logical_program;

import java.util.HashMap;
import java.util.Set;

public class Hashmap 
{
	public static void main(String[] args) 
	{
		
		String str="abcabc";
		HashMap<Character, Integer>mp=new HashMap<Character, Integer>();
		for(int i=0;i<=str.length()-1;i++)
		{
			char charvalue=str.charAt(i);
			if(mp.containsKey(charvalue))
			{
				mp.put(charvalue,mp.get(charvalue)+1);
			}
			else
			{
				mp.put(charvalue, 1);
				
			}
		}
		Set<Character>keys=mp.keySet();
		for(Character key:keys)
		{
			if(mp.get(key)>1)
			{
				System.out.println(key +" : "+mp.get(key));
			}
		}
		
	}

}
