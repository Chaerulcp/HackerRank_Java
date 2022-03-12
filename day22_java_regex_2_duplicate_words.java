// java 8

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class day22_java_regex_2_duplicate_words {

    public static void main(String[] args) {

        String regex = "(\\b\\w+)(\\s\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE + Pattern.MULTILINE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }
            
            System.out.println(input);
        }
        
        in.close();
    }
}