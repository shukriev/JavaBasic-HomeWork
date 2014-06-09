/*
	Write a method to convert from degrees to radians. Write a method to convert from radians to degrees.
	You are given a number n and n queries for conversion.
	Each conversion query will consist of a number + space + measure. Measures are "deg" and "rad". 
*/
import java.util.Scanner;
import java.text.DecimalFormat;

import org.omg.CORBA.StructMemberHelper;
public class DegreesToRadians {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] All = new String[n];
		String numb;
		String str ;
		for (int i = 0; i < n; i++) {
			numb = in.next();
			str = in.next();
			if (str.equals("rad")) {
				double conv = Double.parseDouble(numb);
				double temp = Math.toDegrees(conv);
				All[i] = Math.round(temp * 1000000.0) / 1000000.0 + " deg";
			}else {
				double conv = Double.parseDouble(numb);
				double temp = Math.toRadians(conv);
				All[i] = Math.round(temp * 1000000.0) / 1000000.0 + " rad";
			}
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(All[i]);
		}
	}

}

