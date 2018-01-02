package string_practice.src;

import com.sun.deploy.util.StringUtils;
import com.sun.javafx.css.StringStore;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;
import com.sun.org.apache.xml.internal.utils.StringVector;
import com.sun.xml.internal.fastinfoset.util.StringArray;
import org.omg.CORBA.StringHolder;

import javax.swing.text.BadLocationException;
import javax.swing.text.StringContent;
import java.math.BigInteger;
import java.math.MathContext;

/**
 * Created by Dell on 10/29/2015.
 */
public class String_simple {
    public static void main(String[] args) throws BadLocationException {
        String s=new String("sachinsharma");
        StringBuilder t=new StringBuilder("sachinsharma");
                //StringCharacterIterator

       /* StringCharacterIterator a=new StringCharacterIterator("sachinsharma");
        System.out.println(a.getBeginIndex());
        System.out.println(a.getEndIndex());
        System.out.println((a.current()));*/

            //STRING JOINER
      /*  StringJoiner a=new StringJoiner("sachinsharma");
        System.out.println(a.length());
       // System.out.println(a.merge(a));
        System.out.println(a.add(s));*/


                //BIGInteger
      /* java.math.BigInteger q=new BigInteger(String.valueOf(41));
        System.out.println(q.not());
        System.out.println(q.bitCount());
      *//* BigInteger[] v= q.divideAndRemainder(BigInteger.valueOf(20));
        System.out.println(v);*//*
        System.out.println(q.isProbablePrime(4));
        System.out.println(q.shiftLeft(4));
        System.out.println(q.shiftRight(4));
       BigInteger d= q.setBit(5);
        System.out.println(d.intValue());
        System.out.println(q.testBit(31));*/

       /* StringArray stringArray=new StringArray(10,100,true);
        for (int i = 0; i <10 ; i++) {
            stringArray.add("asz"+i);
        }
        System.out.println(stringArray.get(5));
       String b[]= stringArray.getCompleteArray();
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        StringContent y=new StringContent(4);
        y.insertString(0,b[0]);
        for (int i = 1; i <10 ; i++) {
            y.insertString(i,b[i]);
        }
        for (int i = 0; i < y.length(); i++) {
            System.out.println(y.getString(i,y.length()));
        }*/
        StringHolder kj=new StringHolder();
        StringVector stringVector=new StringVector();

        StringStack stringStack=new StringStack();
        System.out.println(stringStack.capacity());
        StringStore stringStore=new StringStore();
        StringArray stringArray=new StringArray(10,100,true);


    }
}
