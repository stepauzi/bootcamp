package poker;
import java.util.Arrays;

public class Deck {
  // Static Variable (字典 dictoionary)
  public static final int[] RANKS =
      new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
  public static final String[] SUITS =
      new String[] {"DIAMOND", "CLUB", "HEART", "SPADE"};

  // Attributes (Instance Vairable), instance = object
  private Card[] cards;

  public Deck() {
    this.cards = new Card[RANKS.length * SUITS.length];
    int idx = 0;
    for (String suit : SUITS) {
      for (int rank : RANKS) {
         this.cards[idx] = new Card(rank, suit);
         idx++;
      }
    }
  }

  public void removeCard(int removeIndex) {
    if (removeIndex > this.cards.length - 1) {
      return;
    }
    // 1. new Array (length - 1)
    Card[] newCards = new Card[this.cards.length - 1];
    // 2. copy all cards, except the removed target 
    int idx = 0;
    for (int i = 0; i < this.cards.length; i++) {
      if (removeIndex != i) {
        newCards[idx] = this.cards[i];
        idx++;
      }
    }
    // 3. replace new array to array address
    this.cards = newCards;
  }

  public Card[] getCards() {
    return this.cards;
  }

  public static void main(String[] args) {
    Deck d1 = new Deck();
    d1.removeCard(0);
    d1.removeCard(0);
    d1.removeCard(0);
    d1.removeCard(0);
    System.out.println(Arrays.toString(d1.getCards()));
  }
}
