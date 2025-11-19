package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anogram {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

	}

	private static boolean isAnagram(String a, String b) {
		
		a = a.toLowerCase();
        b = b.toLowerCase();
        
        if(a.length() != b.length())
            return false;
        
        char[] s1 = a.toCharArray();
        char[] s2 = b.toCharArray();
        
        Arrays.sort(s1);
        Arrays.sort(s2);
        
        return Arrays.equals(s1, s2);
        
        //return a.equals(b);
	}

}
