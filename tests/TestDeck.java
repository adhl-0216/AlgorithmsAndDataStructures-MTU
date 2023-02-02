import Lab3.Card;
import Lab3.Deck;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class TestDeck {
    Deck deck = new Deck();


    @Test()
    void setCardsTest(){
        ArrayList<Card> hearts = new ArrayList<>(13);
        for (int i = 1; i <= 13; i++) {
            hearts.add(new Card(i, "Hearts"));
        }
        deck.setCards(hearts.toArray(new Card[0]));
        assertEquals("2 of Hearts", deck.getCards()[1].toString());
    }

    @Test()
    void shuffleTest(){
        setCardsTest();
        for (int i = 0; i < 10; i++) {
            deck.shuffle();
            System.out.println(deck);
        }

    }
}
