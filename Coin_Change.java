package dp_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/**
 * Created by sachin on 9/26/2017.
 */
public class Coin_Change {
    public static void main(String[] args) throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        int cost= Integer.parseInt(st.nextToken());
        int coins= Integer.parseInt(st.nextToken());
        int coins_array[]=new int[coins];
        int table[][]=new int[coins+1][cost+1];
        StringTokenizer ms=new StringTokenizer(br.readLine()," ");
        int i=0;
        while(ms.hasMoreTokens())
        {
            coins_array[i]= Integer.parseInt(ms.nextToken());
            i++;
        }

        for (int j = 1; j <cost+1 ; j++) {
            table[0][j]=0;
        }
        for (int k = 1; k <=coins ; k++) {
            table[k][0]=1;
            for (int j = 1; j <=cost ; j++) {
                if (j >= coins_array[k-1]) {
                    table[k][j] = table[k - 1][j] + table[k][j - coins_array[k-1]];
                } else
                    table[k][j] = table[k - 1][j];
            }
        }
        System.out.println(table[coins][cost]);

    }
}
