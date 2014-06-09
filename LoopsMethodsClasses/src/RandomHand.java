/*
	Write a program to generate n random hands of 5 different cards form a standard suit of 52 cards.
*/
import java.util.Random;
import java.util.Scanner;

public class RandomHand {

	public static void main(String[] args) {
		String[] Cards = {"2","3","4","5","6","7","8","9","10","A","J","Q","K"};
		String[] Sharps = {"♣", "♦", "♥", "♠"};
		String[] allCards = new String[52];
		int j = 0;
		for(String Card : Cards) {
			for(String Sharp : Sharps) {
				allCards[j] = Card + Sharp;
				j++;
			}
		}
		Random rnd = new Random();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int counter = 0; counter < n; counter++){
			for(int i = 0; i < 5; i++){
				int p = rnd.nextInt(32);
				System.out.print(allCards[p]);
			}
			System.out.println();
		}
	}

}
