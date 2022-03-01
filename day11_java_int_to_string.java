import java.io.*;
import java.util.*;
import java.util.Scanner.*;

public class day11_java_int_to_string {
    
    public static void main(String[] args) {
        
        
    Scanner userinput = new Scanner (System.in);
        String text;
    int n = userinput.nextInt();
    if (n < -100 || n > 100) {
        text = "Wrong answer";
    } else {
        text = "Good job";
    }
    System.out.println(text);
        
    }
}       
   

