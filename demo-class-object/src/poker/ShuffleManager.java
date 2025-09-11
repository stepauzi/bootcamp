package poker;
import java.util.Arrays;
import java.util.Random;

public class ShuffleManager {
  private Card[] cards;

  public ShuffleManager(Card[] cards) {
    this.cards = cards;
  }

  public Card[] shuffle(int times) {
    if (times < 0) {
      return this.cards;
    }
    for (int t = 0; t < times; t++) {
      Card[] newCards = new Card[this.cards.length];
      int r1 = new Random().nextInt(26); // 0-25
      int r2 = new Random().nextInt(26) + 26; // (0-25) + 26 -> 26-51
      // r1 = 17, r2 = 23
      for (int i = r1; i < r2; i++) {
        newCards[i - r1] = this.cards[i];
      }
      for (int i = 0; i < r1; i++) {
        newCards[r2 - r1 + i] = this.cards[i];
      }
      for (int i = r2; i < this.cards.length; i++) {
        newCards[i] = this.cards[i];
      }
      this.cards = newCards;
    }
    return this.cards;
  }

  public static void main(String[] args) {
    Deck d1 = new Deck();
    // chain methods
    Card[] cardsAfterShuffle = new ShuffleManager(d1.getCards()).shuffle(2000);
    System.out.println(Arrays.toString(cardsAfterShuffle));

  }
}
