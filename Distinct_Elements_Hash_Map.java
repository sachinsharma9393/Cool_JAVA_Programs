package BITS_PRACTICE;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by user on 9/3/2017.
 */
public class Distinct_Elements_Hash_Map {
	public static void main(String[] args) {
		int a[] = {5, 7, 3, 2, 1, 3, 2, 1, 2, 4};
		LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			if (linkedHashMap.containsKey(a[i]))
				linkedHashMap.put(a[i], linkedHashMap.get(a[i]) + 1);
			else linkedHashMap.put(a[i], 1);
		}
		System.out.println(linkedHashMap.keySet().size() + " ---" + linkedHashMap.size());
//printing occurences
		System.out.println(Collections.max(linkedHashMap.values()));//how many times max occcurence of values
		for (Map.Entry e : linkedHashMap.entrySet()
				) {
			System.out.println(e.getKey() + "-->" + e.getValue());//ordering maintained

		}

		System.out.println("-------PRINTING DISTINCT ELEMENTS---------");
		for (Map.Entry em : linkedHashMap.entrySet()) {
			if ((Integer) em.getValue() == 1) {
				System.out.println(em.getKey());
			}
		}
	}
}
