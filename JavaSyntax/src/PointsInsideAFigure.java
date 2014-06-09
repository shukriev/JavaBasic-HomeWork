import java.util.*;
public class PointsInsideAFigure {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String arr[] = input.split(" ");
		double x = Double.parseDouble(arr[0]);
		double y = Double.parseDouble(arr[1]);
		CheckPoints(x,y);
		}

	public static void CheckPoints(double x, double y) {
		if ((x >= 12.5 && x <= 22.5 && y >= 6 && y <= 8.5)
		|| (x >= 8.5 && x <= 17.5 && y >= 8.5 && y <= 13.5) || (x >= 20 && x <= 22.5 && y >= 8.5 && y <= 13.5)) {
			System.out.println("Inside");
		}else {
			System.out.println("Outside");
		}
		
	}
	

}
