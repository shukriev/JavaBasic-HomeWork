import java.util.Scanner;
public class _05_CountAllWords {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String tempString = in.nextLine();
		String[] arr = tempString.split("[' -]");

		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			counter++;
		}
		System.out.println(counter);
	}

}
