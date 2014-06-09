import java.util.Scanner;
public class _06_CountSpecifiedWord {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String temp = in.nextLine();
		
		String match = in.nextLine();
		String[] arr = temp.toLowerCase().split("\\W+");
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(match)) {
				counter++;
			}
		}
		System.out.println(counter);
	}

}
