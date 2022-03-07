// java 15

import java.io.*;
import java.util.*;

public class day17_java_string_reverse {
    
    public static void main(String[] args) {
        
        Scanner inputuser=new Scanner(System.in);
        String A = inputuser.next();
        int tes = A.length()-1;
        String jawab = "Yes";
        for(int i =0; i<tes/2; i++){
            if(A.charAt(i)==A.charAt(tes-i))
                continue;
            else{
                jawab ="No";
                break;
            }
        }
        System.out.println(jawab);


    }
}
