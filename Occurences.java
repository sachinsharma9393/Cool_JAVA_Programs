import java.util.*;

/**
 * Created by user on 9/2/2017.
 */
public class Occurences {
	public static void main(String[] args) {
		int a[] = {5, 7, 3, 2, 1, 3, 2, 1, 2, 4};
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			if (h.containsKey(a[i]))
				h.put(a[i], h.get(a[i]) + 1);
			else h.put(a[i], 1);
		}
		System.out.println(h.keySet().size() + " ---" + h.size());
//printing occurences
		System.out.println(Collections.max(h.values()));//how many times max occcurence of values
		for (Map.Entry e : h.entrySet()
				) {
			System.out.println(e.getKey() + "-->" + e.getValue());//ordering maintained

		}
		System.out.println("  Linked-HASHMAP");
		//LinkedHashMap
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
		System.out.println("TREEMAP ");
		TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			if (treeMap.containsKey(a[i]))
				treeMap.put(a[i], treeMap.get(a[i]) + 1);
			else treeMap.put(a[i], 1);
		}
		System.out.println(treeMap.keySet().size() + " ---" + treeMap.size());
//printing occurences
		System.out.println(Collections.max(treeMap.values()));//how many times max occcurence of values
		for (Map.Entry e : treeMap.entrySet()
				) {
			System.out.println(e.getKey() + "-->" + e.getValue());//ordering maintained

		}

	}
}