// java 15

import java.io.*;
import java.util.*;
import java.math.BigDecimal;

public class day25_java_bigdecimal {

    public static void main(String []argh){
        
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        String []s = new String[n];
        for(int i=0;i<n;i++){
            s[i]=scan.next();
        }

        
      for (int i = n; i >=0; i--){
          for (int j = 0; j < i - 1; j++){
              if (isAscending(s[j],s[j+1])){
                  swap(j,j+1,s);
              }
          }
      }
      
        
        for(int i=0;i<n;i++){
            System.out.println(s[i]);
        }
    }
    
        
    
    private static boolean isAscending (String s1, String s2){
        BigDecimal bigD1 = new BigDecimal(s1);
        BigDecimal bigD2 = new BigDecimal(s2);
        return bigD1.compareTo(bigD2)==-1;
    }
    
    private static void swap (int i, int j, String[] s) {
        String temp;
        temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }


}
