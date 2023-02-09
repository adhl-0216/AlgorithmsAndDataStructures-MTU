package Lab3;

import java.util.Arrays;
import java.util.Random;

import static java.lang.System.arraycopy;

public class Deck {
    private Card[] cards;

    public Deck() {
    }

/*
    public static void shuffle(int shuffles, Deck deck){
        Card[] cards = deck.getCards();
        if (shuffles == 0) return;

        int randSize =  (int)Math.ceil((Math.random()*52-8)+8);

        Card[] top = Arrays.copyOfRange(cards, 0, randSize);
        Card[] bottom = Arrays.copyOfRange(cards, randSize, cards.length);

        Card[] temp = new Card[top.length + bottom.length];
        arraycopy(bottom,0, temp, 0, bottom.length);
        arraycopy(top,0, temp, bottom.length, top.length);

        deck.setCards(temp);
        System.out.println(randSize);
        System.out.println(deck);
        shuffle(--shuffles, deck);
    }
*/
    public void shuffle() {
        Random random = new Random();
        for (int i = 0; i < random.nextInt(25,100); i++) {
            int index1 = random.nextInt(0,52);
            int index2 = random.nextInt(0,52);
            Card temp = cards[index1];
            cards[index1] = cards[index2];
            cards[index2] = temp;
        }
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
