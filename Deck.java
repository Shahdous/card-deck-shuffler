
import java.util.Random;
import java.io.*;

public class Deck
{ 
  public final int DECKSIZE = 52;


  private Card[] deck = new Card[DECKSIZE];
  private Random random = new Random();

  public Deck()
  { int cardNumber=0;
    for (int suit = 1; suit <= 4; suit++)
      for (int face = 1; face <= 13; face++)
      {  deck[cardNumber] = new Card(face, suit);
         cardNumber++;
      }
  }
  
  public Card getCard(int index)
  {	if ((index<0) || (index>=DECKSIZE)) return null;
  	return deck[index];
  }

  public String toString()
  { StringBuilder r = new StringBuilder();
  	int pos = 0;
  	for (int row=1; row<=4; row++)
  	{	for (int col=1; col<=13; col++)
  		{	r.append(deck[pos].toString() + "  ");
  			pos++;
  		}
  		if (row<4) r.append("\n");
  	} // end outer for loop
  	return r.toString();
  } // end toString() method

  public void shuffle1() 
  {
    Card[] shuffledDeck = new Card[DECKSIZE];
    recursiveShuffle(shuffledDeck, 0);
    deck = shuffledDeck;
}

  private void recursiveShuffle(Card[] shuffledDeck, int index) {

    if (index == DECKSIZE) {
      return; //Base case
    }
    
    int rndmPos = random.nextInt(DECKSIZE);
    while (shuffledDeck[rndmPos] != null) {
        rndmPos = (rndmPos + 1) % DECKSIZE;
    }
    shuffledDeck[rndmPos] = deck[index];
    recursiveShuffle(shuffledDeck, index + 1);
}

  public void shuffle2() 
  {
    for (int i = DECKSIZE - 1; i > 0; i--) {

        int rndmPos = random.nextInt(i + 1);
        Card temp = deck[i];
        deck[i] = deck[rndmPos];
        deck[rndmPos] = temp;
    }
}

} 

