package string_practice.compilerLab;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Dell on 12/18/2015.
 */
public class Lexical_Analyzer {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("F:\\JAVA\\hackerra\\src\\string_practice\\compilerLab\\lex.txt"));
        String[] s=new String[]{"+",">","<","=","-","*","/"};
       /* Hashtable<Integer,String> hs=new Hashtable<>();
        for (int i = 0; i <s.length ; i++) {
            hs.put(i,s[i]);
        }*/
        int count=0; String s1;
        while(br.readLine()!=null)
        {
            count++;System.out.println("----- at line no" + count);

            s1=br.readLine();
            for (String value : s) {
                Pattern p = Pattern.compile(value);
                Matcher m = p.matcher(s1);
                if (m.matches()) {
                    System.out.println(value + " at line" + count);
                }
            }


        }

    }
}
