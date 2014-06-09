import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class _07_CountSubstringOccurrences {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String temp = in.nextLine().toLowerCase();
		String match = in.nextLine().toLowerCase();
		int count = 0;
		
		for (int i = 0; i <= temp.length() - match.length(); i++) {
			if (temp.substring( 0 + i, match.length() + i).contains(match)) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}

