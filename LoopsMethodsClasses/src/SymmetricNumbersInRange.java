/*
	Write a program to generate and print all symmetric numbers in given range [start…end]
*/
import java.util.*;
public class SymmetricNumbersInRange {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int start = in.nextInt();
	    int end = in.nextInt();
        for (Integer x = start;x<=end;x++) { 
            if (isPalindrome(x)) System.out.println(x);
        }
	}
	public static boolean isPalindrome(Integer x) {
        String s = x.toString();
        int len = s.length();
        for (int i = 0;i<len;i+=2) {
            if (s.charAt(i) != s.charAt(len-i-1)){ 
            	return false;  
            }
        }
        return true;
    }


}
