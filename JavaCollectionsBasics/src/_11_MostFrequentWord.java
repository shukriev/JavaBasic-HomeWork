import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class _11_MostFrequentWord {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] words = in.nextLine().toLowerCase().split("\\W+");
		TreeMap<String, Integer> wordoccurMap = new TreeMap<>();
		int count = 0;
		
		for(String word : words) {
			Integer wordCount = wordoccurMap.get(word);
			if(wordCount == null){
				wordCount = 0;
			}
			
			if(wordCount + 1 > count) count = wordCount + 1;
			wordoccurMap.put(word,wordCount + 1);
		}
		

        for (Map.Entry<String, Integer> entry : wordoccurMap.entrySet()) {
                if (entry.getValue() == count) {
                        System.out.println(entry.getKey() + " -> "
                                        + count + " times");
                }
        }
	}

}
