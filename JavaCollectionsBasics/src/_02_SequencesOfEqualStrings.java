import java.util.Scanner;
public class _02_SequencesOfEqualStrings {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String temp = in.nextLine();
		String[] arrStrings = temp.split(" ");
		
		for (int i = 0; i < arrStrings.length - 1; i++) {
			if (arrStrings[i].equals(arrStrings[i + 1])) {
				System.out.print(arrStrings[i] + " ");
			}else {
				System.out.println(arrStrings[i]);
			}
		}
		int last = arrStrings.length;
		System.out.println(arrStrings[last-1]);
	}

}
