import java.lang.reflect.Array;
import java.util.*;
public class TheSmallestOfThreeNumbers {

	public static void main(String[] args) {
		double[] arr = new double[3];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextDouble();
		}
		Arrays.sort(arr);
		System.out.println(arr[0]);
	}

}
