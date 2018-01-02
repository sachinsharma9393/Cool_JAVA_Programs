import java.util.*;

/**
 * Created by sachin on 8/16/2017.
 */
public class Adhoc_Practice {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<Integer>();
        for (int i = 0; i <10 ; i++) {
            s.push(i);
        }
        System.out.println(s.peek());//print top value
        Vector<Integer>v=new Vector<Integer>(10);
        System.out.println(v.size());
        for (int i = 0; i <10 ; i++) {
            v.add(i);
        }
        System.out.println(v.size());
        v.sort(Comparator.reverseOrder());
        for (int i = 0; i <10 ; i++) {
            System.out.println(v.elementAt(i));
        }
     //   System.out.println("----"+v.stream().max(Comparator.naturalOrder()));
        System.out.println(v.contains(20));
        System.out.println(Collections.max(v));//finding max among the range of values

        Properties p=new Properties();

    }
}
