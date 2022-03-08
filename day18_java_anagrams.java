// java 15

import java.io.*;
import java.util.*;

public class day18_java_anagrams {

    static boolean isAnagram(String A, String B) {
        if (A.length()!=B.length()){
            return false;
        }
        A = new String(A.toLowerCase().toCharArray());
        B = new String(B.toLowerCase().toCharArray());
        HashMap mapA= new HashMap();
        HashMap mapB= new HashMap();
        boolean anagram = true;
        for (int i = 0; i < A.length(); i++){
            if (mapA.get(A.charAt(i)) == null){
                mapA.put(A.charAt(i),1);
            }
            else{
                mapA.put(A.charAt(i),1 + (int)mapA.get(A.charAt(i)));
            }
            if (mapB.get(B.charAt(i)) == null){
                mapB.put(B.charAt(i),1);
            }
            else{
                mapB.put(B.charAt(i),1 + (int)mapB.get(B.charAt(i)));
            }
        }
       for (Object key : mapA.keySet()) {
             if (mapA.get(key)!=mapB.get(key)){
                 anagram = false;
             }
         }
     return anagram;
     }
     
         public static void main(String[] args) {
               Scanner scan = new Scanner(System.in);
             String a = scan.next();
             String b = scan.next();
             scan.close();
             boolean ret = isAnagram(a, b);
             System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
     
         }
}
