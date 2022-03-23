// java 15

import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.LinkedList;

public class day33_java_list {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    List<Integer> lst = new ArrayList<>();
    for (int i = 0; i < N; i++) {
        lst.add(sc.nextInt());
    }
    int Q = sc.nextInt();
    while (Q-- > 0) {
        switch (sc.next()) {
            case "Insert":
                lst.add(sc.nextInt(), sc.nextInt());
                break;
            
            case "Delete":
                lst.remove(sc.nextInt());
                break;
            
            default:
                System.out.println("Invalid operation.");
                System.exit(-1);
                break;
        }
    }
    sc.close();
    while (!lst.isEmpty()) {
        System.out.print(lst.remove(0) + " ");
    }
}
}