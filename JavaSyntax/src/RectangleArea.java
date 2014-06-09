import java.util.*;
public class RectangleArea {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String arr[] = input.split(" ");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int result = a * b;
		System.out.println("Area is:" + result);
	}
}
