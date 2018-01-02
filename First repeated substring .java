import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * Created by sachin on 9/1/2017.
 */
class StringPra
{
    public static void main(String[] args) throws IOException {

        String s= "This had sac had sac his";
        LinkedHashMap<String,Integer>l=new LinkedHashMap<>();
        StringTokenizer st=new StringTokenizer(s," ");
        while (st.hasMoreTokens())
        {
            String t=st.nextToken();
            if(l.containsKey(t))
                l.put(t,l.get(t)+1);
            else
            l.put(t,1);

        }
        for (Map.Entry m :l.entrySet())
        {
            System.out.println(m.getKey() + "---" + m.getValue());
        }
        for (Map.Entry m :l.entrySet())
        {
            if((Integer)m.getValue()>1)
            {
                System.out.println("first repeated Character is "+m.getKey()+"---"+m.getValue());
                break;
            }


        }

    }
}
