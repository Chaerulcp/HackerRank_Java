// java 15

import java.io.*;
import java.util.*;

public class day14_java_strings_introduction {
    public static void main(String[] args) {
        
        Scanner inputmasukan=new Scanner(System.in);
        String A=inputmasukan.next();
        String B=inputmasukan.next();
        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B)>0?"Yes":"No");
        System.out.println(capitalizeFirstLetter(A) + " " + capitalizeFirstLetter(B));
    }
    
    public static String capitalizeFirstLetter(String original) {
    if (original == null || original.length() == 0) {
        return original;
    }
    return original.substring(0, 1).toUpperCase() + original.substring(1);
}
    
       
}


