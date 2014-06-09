/*
	In most Poker games, the "full house" hand is defined as three cards of the same face + two cards of the same face,
	other than the first, regardless of the card's suits.
*/
public class FullHouse {
	public static void main(String[] args) {
        
        String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        char[] suits = {'♣', '♦', '♥', '♠'};
       
        int counter = 0;
       
        for (int FirstCard = 0; FirstCard < cards.length; FirstCard++) {
                for (int SecondCard = 0; SecondCard < cards.length; SecondCard++) {
                        for (int FirstSuit = 0; FirstSuit < suits.length; FirstSuit++) {
                                for (int SecondSuit = FirstSuit + 1; SecondSuit < suits.length; SecondSuit++) {
                                        for (int ThirdSuit = SecondSuit + 1; ThirdSuit < suits.length; ThirdSuit++) {
                                                for (int FourthSuit = 0; FourthSuit < suits.length; FourthSuit++) {
                                                        for (int FifthSuit = FourthSuit + 1; FifthSuit < suits.length; FifthSuit++) {
                                                                if (FirstCard != SecondCard) {
                                                                        System.out.print(cards[FirstCard] + suits[FirstSuit]);
                                                                        System.out.print(cards[FirstCard] + suits[SecondSuit]);
                                                                        System.out.print(cards[FirstCard] + suits[ThirdSuit]);
                                                                        System.out.print(cards[SecondCard] + suits[FourthSuit]);
                                                                        System.out.print(cards[SecondCard] + suits[FifthSuit]);
                                                                        System.out.println();
                                                                        counter++;
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
       
        System.out.println(counter + " full houses");
}
	}
