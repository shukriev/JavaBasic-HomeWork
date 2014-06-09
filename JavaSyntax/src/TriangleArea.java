import java.util.Scanner;
public class TriangleArea {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String inputFirstSeq = in.nextLine();
		String arrFirstSeq[] = inputFirstSeq.split(" ");
		
		String inputSecondSeq = in.nextLine();
		String arrSecondSeq[] = inputSecondSeq.split(" ");
		
		String inputThirdSeq = in.nextLine();
		String arrThirdSeq[] = inputThirdSeq.split(" ");
		int ax = Integer.parseInt(arrFirstSeq[0]);
		int ay = Integer.parseInt(arrFirstSeq[1]);
		
		int bx = Integer.parseInt(arrSecondSeq[0]);
		int by = Integer.parseInt(arrSecondSeq[0]);
		
		int cx = Integer.parseInt(arrThirdSeq[0]);
		int cy = Integer.parseInt(arrThirdSeq[0]);;
		
		TriangelArea(ax,ay,bx,by,cx,cy);
	}
	public static int TriangelArea(int aX, int aY, int bX,int bY,int cX,int cY){
		
		int result = (aX*(bY-cY)+ bX*(cY-aY)+cX*(aY-bY))/2;
		System.out.println(result);
		return result;
	}

}
