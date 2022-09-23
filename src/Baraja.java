import java.util.Collections;
import java.util.LinkedList;

public class Baraja {

    LinkedList<Carta> cards = null;

    public Baraja() {
        cards = new LinkedList<>();
        for (int i = Carta.SPADES; i <= Carta.CLUBS; i++) {
            for (int j = Carta.ACE; j <= Carta.KING; j++) {
                Carta c = new Carta(j, i);
                cards.add(c);
            }
        }
        // shuffle();
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Carta draw() {
        Carta topCard = null;

        if ( !cards.isEmpty() )
            topCard = cards.removeLast();

        return topCard;
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

    public int size() {
        return cards.size();
    }

}
