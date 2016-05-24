package com.nickeson.game_of_21;

//JDK 1.8.0
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/****************************************************************************
 * <b>Title</b>: CustomDeck1.java <p/>
 * <b>Project</b>: game_of_21 <p/>
 * <b>Description: </b> A custom card deck with and without Jokers<p/>
 * <b>Copyright:</b> Copyright (c) 2016<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author nickeson
 * @version 1.0
 * @since May 17, 2016<p/>
 * updates:
 ****************************************************************************/

<<<<<<< HEAD
public class CustomDeck1 implements Deck<PlayingCard> {
	private List<PlayingCard> custDeck1 = new ArrayList<PlayingCard>();
	// initialize empty string arrays for card suits & values to correct sizes
	private String[] cardSuits = new String[CstmPlayingCardSuits1.values().length];	 
	private static String[] cardValues = new String[CstmPlayingCardValues1.values().length];
	// setup location index for Joker
	private static int jokerIndex = (CstmPlayingCardValues1.values().length -1);
=======
public class CustomDeck1 implements Deck<Card> {
	private List<Card> custDeck1 = new ArrayList<Card>();
	// initialize empty string arrays for card suits & values to correct sizes
	private String[] cardSuits = new String[CustomCardSuits1.values().length];	 
	private static String[] cardValues = new String[CustomCardValues1.values().length];
	// setup location index for Joker
	private static int jokerIndex = (CustomCardValues1.values().length -1);
>>>>>>> 43f4903ebc09e2f5c13c64420a6a50a55dee47e0
	
	/**
	 * constructor to build a deck with no jokers if no arg is passed 
	 */
	public CustomDeck1(){
		buildDeck();
	}
	
	/**
	 * constructor to build a deck with or without jokers if arg is passed     
<<<<<<< HEAD
	 * @param numOfJokers
	 */
	public CustomDeck1(int numOfJokers) {
=======
	 * @param hasJokers
	 */
	public CustomDeck1(boolean hasJokers) {
>>>>>>> 43f4903ebc09e2f5c13c64420a6a50a55dee47e0
		buildDeck();
		for (int j = 0; j < numOfJokers; j++) {
			addJoker();
		}
	}
	
	/**
	 * build a Standard Deck of cards with suits and values defined in
<<<<<<< HEAD
	 * StandardCardSuits.java and StandardCardValues.java
=======
	 * CustomCardSuits1.java and CustomCardValues1.java
>>>>>>> 43f4903ebc09e2f5c13c64420a6a50a55dee47e0
	 */
	public void buildDeck() {
		// fill String Arrays with Enum values from StdCardSuits.values()
		for (CstmPlayingCardSuits1 itr : CstmPlayingCardSuits1.values()) {
			int ord = itr.ordinal();
			cardSuits[ord] = "" + itr;			
		}
				
		for (CstmPlayingCardValues1 ir : CstmPlayingCardValues1.values()) {
			int odl = ir.ordinal();
			cardValues[odl] = "" + ir;				
		}	
		
		/* loop through the suits and values string arrays, building new cards
		 * for each value of each suit, all face down
		 */
		for (String ol : cardSuits)
		{
			for (String il : cardValues)
			{
				if (!il.equals(cardValues[jokerIndex])) {
<<<<<<< HEAD
					// params = (suit, value, isJoker, isFaceUp)
					custDeck1.add(new PlayingCard(ol,il,false,false));
=======
					custDeck1.add(new Card(ol,il,false));
>>>>>>> 43f4903ebc09e2f5c13c64420a6a50a55dee47e0
				}
			}
		}
	}
	
	/**
	 * @return the custom Joker name for this deckType
	 */
	public static String getJokerName() {
		String jokerName = cardValues[jokerIndex];
		return jokerName;
	}
	
	/**
	 * add a face down Joker to deck with custom Joker name for this deck (no suit)
	 */
	public void addJoker() {
		String jokerName = getJokerName();
<<<<<<< HEAD
		// params = (suit, value, isJoker, isFaceUp)
		custDeck1.add(new PlayingCard("",jokerName,true,false));
=======
		custDeck1.add(new Card("", jokerName, false));
>>>>>>> 43f4903ebc09e2f5c13c64420a6a50a55dee47e0
	}
	
	/**
	 * a method to shuffle this deckType
	 */
	public void shuffleDeck() {
		Collections.shuffle(custDeck1);
	}
	
	/**
	 * @return the List of Playing Cards in the Deck
	 */
	public List<PlayingCard> getCards(){
        return custDeck1;
    }
	
	/**
	 * Override toString method to print Deck's String values instead of hashcode
	 */
	@Override
	public String toString() {
		String printDeck = "" + custDeck1;
		return printDeck;
	}
 	 
	// unit test method
	public static void main(String[] args) {
		CustomDeck1 myDeck = new CustomDeck1(3);
		System.out.println("Deck with 1 Joker: " + myDeck);
		
		CustomDeck1 my2ndDeck = new CustomDeck1();	
		my2ndDeck.shuffleDeck();
		System.out.println("Shuffled Deck without Jokers: " + my2ndDeck);	
<<<<<<< HEAD
		}
}
=======
	 }
}
>>>>>>> 43f4903ebc09e2f5c13c64420a6a50a55dee47e0
