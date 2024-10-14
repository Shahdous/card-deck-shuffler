public class DeckTest {
    public static void main(String[] args) {
        Deck deck = new Deck();
        
        // Original deck
        System.out.println("Original Deck:");
        System.out.println(deck.toString());

        // Shuffle1
        deck.shuffle1();
        System.out.println("\nDeck after shuffle1:");
        System.out.println(deck.toString());

        // Shuffle2
        deck.shuffle2();
        System.out.println("\nDeck after shuffle2:");
        System.out.println(deck.toString());
    }
}
