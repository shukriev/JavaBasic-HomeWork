/*
	Write a method to convert from degrees to radians. Write a method to convert from radians to degrees.
	You are given a number n and n queries for conversion. 
	Each conversion query will consist of a number + space + measure. Measures are "deg" and "rad". 
*/
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class DaysBetweenTwoDates {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        String input2 = in.nextLine();
       
        SimpleDateFormat DateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date FirstDate = null;
		try {
			FirstDate = DateFormat.parse(input1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Date SecondDate = null;
		try {
			SecondDate = DateFormat.parse(input2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
        System.out.println((int)CalculateDays(FirstDate, SecondDate));

	}

public static double CalculateDays(Date Date1, Date Date2) {
    long diff;
    diff = Date2.getTime() - Date1.getTime();
    return ((double) diff) / (86400.0 * 1000.0);
}
}
