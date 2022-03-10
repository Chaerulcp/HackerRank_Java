// java 15

import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.regex.*;

public class day20_pattern_syntax_checker {
    
        public static void main(String[] args){
            Scanner userinput = new Scanner(System.in);
            int testCases = Integer.parseInt(userinput.nextLine());
            while(testCases > 0){
                String pattern = userinput.nextLine();
                try {
                    Pattern.compile(pattern);
                    System.out.println("Valid");
                } catch (PatternSyntaxException e) {
                    System.out.println("Invalid");
                }
                testCases--;
            }
        }
    }