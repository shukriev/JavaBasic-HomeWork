import java.util.*;
public class CountOfBitsOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int Number = input.nextInt();
		System.out.println(Integer.bitCount(Number));
	}

}
