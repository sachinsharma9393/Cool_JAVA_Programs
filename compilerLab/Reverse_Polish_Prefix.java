package string_practice.compilerLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Dell on 12/18/2015.
 */
public class Reverse_Polish_Prefix {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String expr=br.readLine();
        StringBuilder b=new StringBuilder(expr);
        for (int i = 0; i <expr.length()-1 ; i++) {
            if(expr.charAt(i)=='*'|| expr.charAt(i)=='/')
            {
                char c;
                c=expr.charAt(i);
               char f= expr.charAt(i+1);
                if(c=='*')
                {
                  //  expr.replace(f, '*');
                    b.replace(i+1,i+1,"*");

                }
                else
                {
                    b.replace(i+1,i+1,"*");
                   // expr.replace(f,'/');

                   // b.replace(i,i,new String(f))
                }

            }

        }
        System.out.println(b);
    }
}
