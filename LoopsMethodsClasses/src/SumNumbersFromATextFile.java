/*
	Write a program to read a text file "Input.txt" holding a sequence of integer numbers, each at a separate line. Print the sum of the numbers at the console. 
*/
import java.io.BufferedReader;
import java.io.FileReader;

public class SumNumbersFromATextFile {

	public static void main(String[] args) {
		int sum  = 0;
		try{
			BufferedReader reader = new BufferedReader( new FileReader("input.txt"));
			int s = 0;
			String line;
			while ((line = reader.readLine()) != null) {
				s += Integer.parseInt(line);
			}
			System.out.println(s);
		}catch(Exception e){
			System.out.println("Error");
		}

	}

}
