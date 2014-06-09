import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class _10_ExtractAllUniqueWords {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tempString = in.nextLine().toLowerCase().split("\\W+");
		
		Set<String> wordsSet = new TreeSet<>();
		for(String word : tempString){
			wordsSet.add(word);
		}
		
		for(String word : wordsSet){
			System.out.print(word + " ");
		}
	}

}
