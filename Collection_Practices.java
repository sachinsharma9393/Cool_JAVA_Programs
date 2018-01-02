import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
/**
 * Created by sachin on 8/16/2017.
 */
public class Collection_Practices {
    public static void main(String[] args) {
        //ArrayList
        ArrayList<Integer>arrayList=new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        //arrayList.sort();
    //arrayList.containsAll() ,contains
        System.out.println(Collections.max(arrayList));
        //arrayList.sort();

        LinkedList<Integer>ll=new LinkedList<>();//all functions of queue as well
        ll.addAll(arrayList);
        for (int i = 0; i <ll.size() ; i++) {
            System.out.println(ll.get(i));

        }

        TreeSet<Integer>ts=new TreeSet<>();
LinkedHashSet<Integer>lh=new LinkedHashSet<>(12,0.8f);

        //HashSet<>
      //  HashSet<Integer>hs=new HashSet<>(10,  0.8f);
       // LinkedHashSet<Integer>d=new LinkedHashSet<>(10);
       // Collections.max(d);
        /*System.out.println(Collections.binarySearch(ll, 6));
        System.out.println(Collections.binarySearch(ll, 100));//if not found returns -(size)-1 i.e -10 -1=-11*/
    }
}
