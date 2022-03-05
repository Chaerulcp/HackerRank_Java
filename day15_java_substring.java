// java 15
    
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class day15_java_substring {

    public static void main(String[] args) {
        
        Scanner inputuser = new Scanner(System.in);
        String s  = inputuser.next();
        int start = inputuser.nextInt();
        int end   = inputuser.nextInt();
        inputuser.close();
        
        System.out.println(s.substring(start, end));
    }
}



