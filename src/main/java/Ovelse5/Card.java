package Ovelse5;

public class Card {
    public String getSuit() {
        return suit;
    }

    public Values getValue() {
        return value;
    }

    public String suit;

    public enum Values {
        ET, TO, TRE, FIRE, FEM, SEKS, SYV, OTTE, NI, TI, ELLEVE, TOLV, TRETTEN
    }

    Values value;

    public Card(String suit, Values value) {
        this.suit = suit;
        this.value = value;
    }

    public void beats(Card test) {
        if (test.value.ordinal() >= 5) {
            System.out.println("succes");
        } else {
            System.out.println("fejl");
        }
    }
}
