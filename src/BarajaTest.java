public class BarajaTest {

    public static void main(String args[] ) {
        Baraja baraja = new Baraja();

        System.out.printf("Cartas en la baraja: %d%n", baraja.size());

        for (int i=0; i < 5; i++) {
            Carta c = baraja.draw();
            System.out.println( c);
        }

        System.out.printf("Cartas en la baraja: %d%n", baraja.size());

        baraja.shuffle();

        for (int i=0; i < 5; i++) {
            Carta c = baraja.draw();
            System.out.println( c);
        }
        System.out.printf("Cartas en la baraja: %d%n", baraja.size());

    }
}
