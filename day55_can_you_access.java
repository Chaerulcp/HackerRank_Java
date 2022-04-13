// java 15

import java.io.*;
import java.util.*;
import java.lang.reflect.*;
import java.util.regex.*;
import java.security.*;


public class day55_can_you_access {

    public static void main(String[] args) throws Exception {
        DoNotTerminate.forbidExit();    

        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine().trim());
            Object o;
            
o = new Inner().new Private();
System.out.println(num + " is " + ((Solution.Inner.Private)o).powerof2(num));

        System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");
        
        }//akhir dari try
        
        catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }// akhir dari main
    static class Inner{
        private class Private{
            private String powerof2(int num){
                return ((num&num-1)==0)?"power of 2":"not a power of 2";
            }
        }
    }// akhir dari Inner
    
}//akhir dari public class

class DoNotTerminate {
     
    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1L;
    }
 
    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}    
    
