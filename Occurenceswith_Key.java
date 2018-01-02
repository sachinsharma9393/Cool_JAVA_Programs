package BITS_PRACTICE;

import java.util.*;

/**
 * Created by user on 9/2/2017.
 */
public class Occurenceswith_Key {
	public static void main(String[] args) {

		int a[]={5,7,3,2,1,3,2,1,2,4,4,4,4};
		TreeMap<Integer,Integer>treeMap=new TreeMap<Integer, Integer>();
		for (int i = 0; i <a.length ; i++) {
			if(treeMap.containsKey(a[i]))
				treeMap.put(a[i],treeMap.get(a[i])+1);
			else treeMap.put(a[i],1);
		}
		Iterator s=treeMap.keySet().iterator();
		Iterator itr=treeMap.values().iterator();
		TreeMap<Object, Object> tm2=new TreeMap<Object,Object>();
		for (int i = 0; i <treeMap.size() ; i++) {
			tm2.put(itr.next(),s.next());
		}
		System.out.println(tm2.get(tm2.lastKey()));//showing max occuring element

		//System.out.println(h.keySet().size()+" ---"+h.size());


	}
}
