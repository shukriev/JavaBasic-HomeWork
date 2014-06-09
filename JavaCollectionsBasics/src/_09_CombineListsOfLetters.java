import java.util.ArrayList;
import java.util.Scanner;
public class _09_CombineListsOfLetters {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Character> charList = new ArrayList<Character>();
		ArrayList<Character> charList2 = new ArrayList<Character>();
		ArrayList<Character> out = new ArrayList<Character>();

		String firstString = in.nextLine();
		String secondString = in.nextLine();
		
		for (int i = 0; i < firstString.length(); i++) {
			if (firstString.charAt(i) != ' ') {
				charList.add(firstString.charAt(i));
				out.add(firstString.charAt(i));
			}
		}
		for (int i = 0; i < secondString.length(); i++) {
			if (secondString.charAt(i) != ' ') {
				charList2.add(secondString.charAt(i));
			}
		}
		for(Character x : charList2){
			if(!charList.contains(x)){
				out.add(x);
			}
		}
		
		for (Character character : out) {
			System.out.print(character +" ");
		}
	}

}
