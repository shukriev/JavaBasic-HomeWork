import java.util.ArrayList;
import java.util.Scanner;

public class _04_LongestIncreasingSequence {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String tempString = in.nextLine();
		
		String[] arr = tempString.split(" ");
		
		int[] numbers = new int[arr.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(arr[i]);
		}
		int temp = 1;
		int counter = 1;
		int position = 0; 

		System.out.print(numbers[0]);
		for (int i = 1; i < arr.length; i++) {
			if (numbers[i] > numbers[i - 1]) {
				temp++;
				System.out.print(" " + numbers[i]);
			} else {
				temp = 1;
				System.out.println();
				System.out.print(numbers[i]);
			}
			if (temp > counter) {
				counter = temp;
				position = i;
			}
		}
		System.out.println();

		System.out.print("Longest: ");
		for (int j = 0; j < counter - 1; j++) {
			System.out.print(numbers[position - counter + 1 + j] + " ");
		}
		System.out.println(numbers[position]);
	}

}
