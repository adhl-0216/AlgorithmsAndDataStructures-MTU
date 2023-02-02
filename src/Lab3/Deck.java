package Lab3;

import java.util.Arrays;

import static java.lang.System.arraycopy;

public class Deck {
    private Card[] cards;

    public Deck() {
    }

    public void shuffle(){
        int randSize = (int) Math.min((cards.length/Math.ceil(Math.random()*4)+3), Math.ceil(cards.length/2));
        Card[] top = Arrays.copyOfRange(cards, 0, randSize);
        Card[] bottom = Arrays.copyOfRange(cards, randSize, cards.length);

        Card[] temp = new Card[top.length+ bottom.length];
        arraycopy(bottom,0, temp, 0, bottom.length);
        arraycopy(top,0, temp, bottom.length, top.length);

        setCards(temp);
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + Arrays.toString(cards) +
                '}';
    }
}
