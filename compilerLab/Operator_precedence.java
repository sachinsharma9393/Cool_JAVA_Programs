package string_practice.compilerLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Dell on 12/18/2015.
 */
public class Operator_precedence {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String input=br.readLine();
        Stack<String>strings=new Stack<>();
        strings.push("$");
        int count=0;
        if(input.contains("+"))
        {
            System.out.println("+ used");
            strings.push("+");
            count++;

        }
        if(input.contains("*"))
        {
            System.out.println("* used");
            strings.push("*");
            count++;

        }
        if(input.contains("i"))
        {
            System.out.println("i used");
            strings.push("i");
            count++;

        }
        System.out.println(count);
        if(count <3)
        {
            System.exit(-1);
        }


        int x=count+2;
        String s[][]= new String[x][x];
        s[0][0]=" ";s[x-1][x-1]="-";s[1][1]="-";
        for (int i = 0; i <s[0].length-1; i++) {
            s[i +1][0]=strings.pop();
            s[0][i+1]=s[i+1][0];
        }
        /*for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(s[i][j]+"\t");
            }
            System.out.println();
        }*/
        String tempi,tempj;
        for (int i = 0; i <x-1 ; i++) {
          tempi = s[i+1][0];
            for (int j = 0; j <x-1 ; j++) {
               tempj= s[0][j+1];
                if(tempi.equals("i") &&( !tempj.equals("i")))
                {
                    s[i+1][j+1]=">";
                }
                if(tempi.equals("$")&&(!tempj.equals("$")))
                {
                    s[i+1][j+1]="<";
                }
                if(tempi.equals("*")&&(!tempj.equals("i")))
                {
                    s[i+1][j+1]=">";
                }
                if(tempi.equals("*")&&(tempj.equals("i")))
                {
                    s[i+1][j+1]="<";
                }

                if(tempi.equals("+")&&(tempj.equals("+")||tempj.equals("$")))
                {
                    s[i+1][j+1]=">";
                }
                if(tempi.equals("+")&&(tempj.equals("i")||tempj.equals("*")))
                {
                    s[i+1][j+1]="<";
                }

            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(s[i][j]+"\t");
            }
            System.out.println();
        }
        Stack tempstack=new Stack();
        tempstack.push("$");
        input=input+"$";
        ArrayList inputmain=new ArrayList(20);
        for (int i = 0; i <input.length() ; i++) {
            inputmain.add(i,input.charAt(i));
        }
        System.out.println("STACK" + "\t\t\t" + "INPUT STRING" + "\t\t\t" + "ACTION");
        for (int i = 0; i <input.length() ; i++) {
            if(tempstack.peek().equals("$")&& !inputmain.get(i).equals("$"))
            {
                System.out.println(tempstack.peek() + "\t\t\t" + inputmain + "\t\t\t" + "SHIFT " + inputmain.get(i));
                tempstack.push(inputmain.get(i));
                inputmain.remove(i);
                System.out.print(tempstack.peek() + "\t\t\t" + inputmain + "\t\t\t" + "Reduce ");
                //tempstack.remove(inputmain.get(i));

            }
            if( tempstack.peek().equals("i")&&(inputmain.get(i).equals("+")||inputmain.get(i).equals("*")))
            {
                tempstack.remove("i");


            }
            if(input.equals("$"))
            {
                System.out.println("STRING SUCCESSFULLY PARSED");
            }
        }


    }
}
