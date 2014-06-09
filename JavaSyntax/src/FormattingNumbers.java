import java.util.Scanner;
 
 
public class FormattingNumbers {
 
        public static void main(String[] args) {
               
                Scanner input = new Scanner(System.in);
               
                int a = input.nextInt();
                double b = input.nextDouble();
                double c = input.nextDouble();
               
                if (a >= 0 && a <= 500) {
                   //     String binary = String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');
                       
                    //    System.out.printf("|%-10X|%s|%10.2f|%-10.3f|", a, binary, b, c);
                }
 
        }
 
}