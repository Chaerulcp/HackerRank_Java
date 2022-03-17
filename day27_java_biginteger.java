// java 15

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day27_java_biginteger {

    public static void main(String[] args) {

     Scanner scan = new Scanner(System.in);
     BigInteger bi1 = new BigInteger(scan.next());
     BigInteger bi2 = new BigInteger(scan.next());

        BigInteger  bi3, bi4;
        bi3 = bi1.add(bi2);
        bi4 = bi1.multiply(bi2);
        System.out.println( bi3);
        System.out.println( bi4);

}
}
