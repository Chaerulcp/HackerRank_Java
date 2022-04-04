// java 15

import java.io.*;
import java.util.*;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
    
}

  class MyBook extends Book {
        void setTitle(String str) {
                this.title = str;
        } 
}

public class day45_java_abstract_class {
    
    public static void main(String []args){
       
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        MyBook new_novel=new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: "+new_novel.getTitle());
          sc.close();
        
    }
}