import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class _03_LargestSequenceOfEqualStrings {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String[] arr = str.split(" ");
		int temp = 1;
		int counter = 1;
		int position = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i].equals(arr[i - 1])) {
				temp++;
			} else {
				temp = 1;
			}
			if (temp > counter) {
				counter = temp;
				position = i;
			}
		}
		for (int j = 0; j < counter - 1; j++) {
			System.out.print(arr[position] + " ");
		}
		System.out.println(arr[position]);
	}

}