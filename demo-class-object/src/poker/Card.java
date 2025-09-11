package poker;
public class Card {
  private int rank; // 1 - 13
  private String suit; // "DIAMOND", "SPADE", "HEART", "CLUB"

  // empty constructor
  // public Card() {

  // }

  // All arguments constructor
  public Card(int rank, String suit) {
    this.rank = rank;
    this.suit = suit;
  }

  // ! No setter

  // getters
  public int getRank() {
    return this.rank;
  }

  public String getSuit() {
    return this.suit;
  }

  public String toString() {
    return "Card(" //
        + "rank=" + this.rank //
        + ",suit=" + this.suit //
        + ")";
  }

  public static void main(String[] args) {
    // new Card();
    new Card(1, "SPADE");
  }
}
