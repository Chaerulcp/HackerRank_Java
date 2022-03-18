// java 15

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class day28_java_1d_array {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
        a[i]=scan.nextInt();
    }

    scan.close();

    for (int i = 0; i < a.length; i++) {
        System.out.println(a[i]);
    }
}
}
