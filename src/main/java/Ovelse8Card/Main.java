package Ovelse8Card;

public class Main {
    public static void main(String[] args) {
        Card card = new Card(10, Card.Suit.HEARTS);
        Card card1 = new Card(12, Card.Suit.Spades);

        System.out.println(card.beats(card1));

    }
}
