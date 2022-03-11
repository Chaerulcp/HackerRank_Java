// java 15

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class day21_java_regex {

    public static void main(String[] args){
        Scanner inputuser = new Scanner(System.in);
        while(inputuser.hasNext()){
            String IP = inputuser.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {
    String acceptable = "(\\d{1,2}|[01]\\d{2}|2[0-4]\\d|25[0-5])";
    public String pattern = acceptable + "." + acceptable + "." + acceptable + "." + acceptable;
}

