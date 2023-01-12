package Ovelse8Card;

public class Card {
    private int value;
    private Suit suit;

    public enum Suit {
        HEARTS, Diamond, Clubs, Spades;
    }
    public Card(int value, Suit suit){
        this.value = value;
        this.suit = suit;
    }
    public Card(){

    }
    public boolean beats(Card card){
        if (card.suit == suit){
            return value < card.value;
        }
        if (card.suit == Suit.Spades){
            return this.suit == Suit.HEARTS;
        } else if (card.suit == Suit.HEARTS ) {
            return this.suit == Suit.Diamond;
        } else if (card.suit == Suit.Diamond) {
            return this.suit == Suit.Clubs;
        } else if (card.suit == Suit.Clubs) {
            return this.suit == Suit.Spades;
        }else {
            return false;
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
