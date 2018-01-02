package string_practice.compilerLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Vector;

/**
 * Created by Dell on 12/18/2015.
 */
public class Heap_Simulation {
   public static Vector<Object>v;
    static java.util.Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        System.out.println("ENTER THE NUMBER OF ELEMENTS TO BE INSERTED IN HEAP");
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int number= Integer.parseInt(br.readLine());
        v=new Vector<>(number);
        msg();
    }
    static void msg()  {
        System.out.println("PRESS 1 FOR DISPLAY");
        System.out.println("PRESS 2 FOR INSERT");
        System.out.println("PRESS 3 FOR DELETE");
        java.util.Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        switch (n)
        {
            case 1:
                display();
            case 2: {
                System.out.println("ENTER THE ELEMENT TO BE INSERTED IN HEAP");
                Object v=sc.nextInt();
                insert(v);
                break;
            }
            case 3:
            {
                System.out.println("ENTER THE ELEMENT TO BE DELETED IN HEAP");
                Object v=sc.nextInt();
                delete(v);
                break;
            }

                default: {
                    System.out.println("NO SUCH OPERATION");
                    msg();
                }
        }

    }

    public static void delete(Object d) {

        if(v.contains(d))
        {
            v.remove(d);
        }
        else
        {
            System.out.println("DO NOT CONTAIN SUCH ELEMENT");

        }
        msg();
    }

    public static void insert(Object d) {
        v.add(d);


        msg();
    }


    public static void display() {
        System.out.println(v);
        msg();
    }

}
