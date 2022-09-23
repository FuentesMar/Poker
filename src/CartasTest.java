import java.util.ArrayList;
import java.util.Collections;

public class CartasTest {

    public static void main(String args[] ) {

        ArrayList<Carta> hand = new ArrayList<>();

        for (int i=0; i < 5; i++) {
            Carta c = Carta.getCard();
            hand.add(c);
        }

        System.out.println( hand );

        Carta min = Collections.min(hand);
        Carta max = Collections.max(hand);


        System.out.println( min );
        System.out.println( max );

        Collections.sort( hand );

        System.out.println( hand );
    }
}
