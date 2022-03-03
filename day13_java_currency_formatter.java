// java 8

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.text.*;

public class day13_java_currency_formatter {
    
    public static void main(String[] args) {
        
        Scanner usermasukan = new Scanner(System.in);
        double payment = usermasukan.nextDouble();
        usermasukan.close();
        
        NumberFormat u   = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat i  = NumberFormat.getCurrencyInstance(new Locale("en", "In"));
        NumberFormat c  = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat f = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String US = u.format(payment);
        String India = i.format(payment);
        String China = c.format(payment);
        String France = f.format(payment);
        
        System.out.println("US: "     + US);
        System.out.println("India: "  + India);
        System.out.println("China: "  + China);
        System.out.println("France: " + France);
    }
}
