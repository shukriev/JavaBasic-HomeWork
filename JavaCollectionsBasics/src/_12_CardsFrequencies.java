import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class _12_CardsFrequencies {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] cardsStrings = in.nextLine().split("[ ♥♣♦♠]+");
		Map<String, Integer> cards = new LinkedHashMap<>();
		
		for(String card : cardsStrings){
			Integer counter = cards.get(card);
			if(counter == null){
				counter = 0;
			}
			cards.put(card, counter + 1);
		}
		
		for(Map.Entry<String, Integer> entry : cards.entrySet()){
			double precent = (double) entry.getValue() * 100 / cardsStrings.length;
			System.out.printf("%s -> %.2f%%\n", entry.getKey(), precent);
		}
	}

}
