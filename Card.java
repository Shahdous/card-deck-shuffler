
public class Card
{

  private int face;

  private int suit;


  public static final int CLUBS    = 1;
  public static final int DIAMONDS = 2;
  public static final int SPADES   = 3;
  public static final int HEARTS   = 4;
  public static final int ACE      = 1;
  public static final int JACK     = 11;
  public static final int QUEEN    = 12;
  public static final int KING     = 13;
  

  private static final String[] SUITLETTER = {"c","d","s","h"};
  private static final String[] FACELETTER 
                    = {"A", "2", "3", "4", "5", "6",
                       "7", "8", "9", "10", "J", "Q", "K"};


  public Card (int faceIn, int suitIn)
  { face = faceIn;
    suit = suitIn;
  }

  public Card ()
  { face = (int)((Math.random()*13.0)) + 1;
    suit = (int)((Math.random()*4.0)) + 1;
  }
 
  public int getFace()
  { return face;
  }

 
  public int getSuit()
  { return suit;
  }

  public String getFaceDescription()
  { if (face == ACE) return "Ace";
    if (face == JACK) return "Jack";
    if (face == QUEEN) return "Queen";
    if (face == KING) return "King";
    return face+"";
  }

  public String getSuitDescription()
  { if (suit == CLUBS) return "Clubs";
    if (suit == DIAMONDS) return "Diamonds";
    if (suit == SPADES) return "Spades";
    return "Hearts";
  }

  public String getDescription()
  { return this.getFaceDescription() + " of "
           + this.getSuitDescription();
  }
  
  public String toString()
  { return FACELETTER[face-1] + SUITLETTER[suit-1];
  }

  
} 