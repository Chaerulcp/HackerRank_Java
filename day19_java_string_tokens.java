// java 15

import java.io.*;
import java.util.*;

public class day19_java_string_tokens {
    
    public static void main(String[] args) {
    Scanner inputuser = new Scanner(System.in);
    inputuser.useDelimiter("\\Z");
    String s = inputuser.next().trim();
    if (s.length() > 0) {
        String[] tokens = s.split("[!,?._'@\\s]+");
        System.out.println(tokens.length);
        for(String token : tokens) {
            System.out.println(token);
        }
    } else {
        System.out.println(0);
    }
    inputuser.close();
}
}






