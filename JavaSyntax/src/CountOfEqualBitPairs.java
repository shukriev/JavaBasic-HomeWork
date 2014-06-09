import java.util.*;

public class CountOfEqualBitPairs {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int br = 0;
		char[] bin = Integer.toBinaryString(n).toCharArray();
		for (int i = 0;i < bin.length-1 ; i++) {
			if (bin[i] == bin[i+1]) {
				br++;
			}
		}
		System.out.println(br);
	}

}
