import java.util.*;

public class PointsInsideTheHouse {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] arr = in.nextLine().split(" ");
		double x = Double.parseDouble(arr[0]);
		double y = Double.parseDouble(arr[1]);
		
		if (checkPoints(x, y)) {
			System.out.println("Inside");
		}else {
			System.out.println("Outside");
		}

	}
	
	public static boolean checkPoints(double x, double y){
		
		double x1 = 12.5, y1 = 8.5;
		double x2 = 17.5, y2 = 3.5;
		double x3 = 22.5, y3 = 8.5;
		
		double a = Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
		double b = Math.abs(x1 * (y2 - y) + x2 * (y - y1) + x * (y1 - y2));
        double c = Math.abs(x1 * (y - y3) + x * (y3 - y1) + x3 * (y1 - y));
        double d = Math.abs(x * (y2 - y3) + x2 * (y3 - y) + x3 * (y - y2));
		if (b + c + d == a) {
			return true;
		}else if ((x >= 12.5 && x <= 17.5) && y <= 13.5 && y >= 8.5) {
			return true;
		}else if ((x >= 20 && x <= 22.5) && (y <= 13.5 && y >=8.5)) {
			return true;
		}else {
	        return false;

		}
	}

}
