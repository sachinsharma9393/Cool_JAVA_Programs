package BITS_PRACTICE;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Vector;

/**
 * Created by user on 9/3/2017.
 */
public class Grouping_totheir_first_occurences {
	public static void main(String[] args) {
		int a[] = {5, 7, 3, 2, 1, 3, 2, 1, 2, 4};
		LinkedHashMap<Integer,Integer>linkedHashMap=new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i <a.length ; i++) {
			if(linkedHashMap.containsKey(a[i]))
			{
				linkedHashMap.put(a[i],linkedHashMap.get(a[i])+1);
			}
			else
			linkedHashMap.put(a[i],1);

		}
		//printing according to first occurences
		System.out.println("Group all the occurrences of elements order by their first occurrence ");
		for (Map.Entry e:linkedHashMap.entrySet())
		{
			for (int i = 0; i <(Integer) e.getValue() ; i++) {
				System.out.println(e.getKey());
			}
		}
	}
}
