package Lab3;

public class Card {
    private int face; // {1..13}
    private String suit; // {"Spades", "Hearts", "Clubs", "Diamonds"}

    public Card(int face, String suit) {
        setFace(face);
        setSuit(suit);
    }

    public int getFace() {
        return face;
    }

    public void setFace(int face) {
        this.face = face;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return face + " of " + suit;
    }
}
