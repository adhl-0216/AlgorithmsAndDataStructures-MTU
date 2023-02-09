package TestLab3;

import Lab3.Card;
import Lab3.Deck;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class TestDeck {
    Deck deck = new Deck();


    @Test()
    void setCardsTest(){
        ArrayList<Card> allCards = new ArrayList<>(52);
        for (int i = 1; i <= 13; i++) {
            allCards.add(new Card(i, "Spades"));
            allCards.add(new Card(i, "Hearts"));
            allCards.add(new Card(i, "Clubs"));
            allCards.add(new Card(i, "Diamonds"));
        }
        deck.setCards(allCards.toArray(new Card[0]));
        assertEquals("1 of Hearts", deck.getCards()[1].toString());
    }

    @Test()
    void shuffleTest(){
        setCardsTest();
        deck.shuffle();
        System.out.println(deck);
    }
}
