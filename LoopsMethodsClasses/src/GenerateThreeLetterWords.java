/*
	Write a program to generate and print all 3-letter words consisting of given set of characters.
	For example if we have the characters 'a' and 'b', all possible words will be "aaa", "aab", "aba", "abb", "baa", "bab", "bba" and "bbb".
*/
import java.util.Scanner;
public class GenerateThreeLetterWords {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String[] arr = input.split("");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int j2 = 0; j2 < arr.length; j2++) {
					System.out.println(arr[i] + arr[j] + arr[j2]);
				}
			}
		}
				

	}

}
