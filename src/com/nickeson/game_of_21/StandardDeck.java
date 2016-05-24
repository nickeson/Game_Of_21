package com.nickeson.game_of_21;

//JDK 1.8.0
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/****************************************************************************
 * <b>Title</b>: StandardDeck.java <p/>
 * <b>Project</b>: game_of_21 <p/>
 * <b>Description: </b> A standard card deck with and without Jokers<p/>
 * <b>Copyright:</b> Copyright (c) 2016<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author nickeson
 * @version 1.0
 * @since May 17, 2016<p/>
 * updates:
 ****************************************************************************/

<<<<<<< HEAD
public class StandardDeck implements Deck<PlayingCard> {
	private List<PlayingCard> stdDeck = new ArrayList<PlayingCard>();	
	// initialize empty string arrays for card suits & values to correct sizes
	private String[] cardSuits = new String[StdPlayingCardSuits.values().length];	 
	private static String[] cardValues = new String[StdPlayingCardValues.values().length];
	// setup location index for Joker
	private static int jokerIndex = (StdPlayingCardValues.values().length -1);
=======
public class StandardDeck implements Deck<Card> {
	private List<Card> stdDeck = new ArrayList<Card>();
	// initialize empty string arrays for card suits & values to correct sizes
	private String[] cardSuits = new String[StandardCardSuits.values().length];	 
	private static String[] cardValues = new String[StandardCardValues.values().length];
	// setup location index for Joker
	private static int jokerIndex = (StandardCardValues.values().length -1);
>>>>>>> 43f4903ebc09e2f5c13c64420a6a50a55dee47e0
	
	/**
	 * constructor to build a deck with no jokers if no arg is passed 
	 */
	public StandardDeck(){
		buildDeck();
	}
	
	/**
	 * constructor to build a deck with or without jokers if arg is passed     
	 * @param numOfJokers
	 */
	public StandardDeck(int numOfJokers) {
		buildDeck();
		for (int j = 0; j < numOfJokers; j++) {
			addJoker();
		}
	}
	
	/**
	 * build a Standard Deck of cards with suits and values defined in
	 * StandardCardSuits.java and StandardCardValues.java
	 */
	public void buildDeck() {
		// fill String Arrays with Enum values from StdCardSuits.values()
		for (StdPlayingCardSuits itr : StdPlayingCardSuits.values()) {
			int ord = itr.ordinal();
			cardSuits[ord] = "" + itr;			
		}
				
		for (StdPlayingCardValues ir : StdPlayingCardValues.values()) {
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
					stdDeck.add(new PlayingCard(ol,il,false,false));
=======
					stdDeck.add(new Card(ol,il,false));
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
		stdDeck.add(new PlayingCard("",jokerName,true,false));
=======
		stdDeck.add(new Card("", jokerName, false));
>>>>>>> 43f4903ebc09e2f5c13c64420a6a50a55dee47e0
	}
	
	/**
	 * a method to shuffle this deckType
	 */
	public void shuffleDeck() {
		Collections.shuffle(stdDeck);
	}
	
	/**
	 * @return the List of Playing Cards in the Deck
	 */
	public List<PlayingCard> getCards(){
        return stdDeck;
    }
	
	/**
	 * Override toString method to print Deck's String values instead of hashcode
	 */
	@Override
	public String toString() {
		String printDeck = "" + stdDeck;
		return printDeck;
	}
 	 
	// unit test method
	public static void main(String[] args) {
		StandardDeck myDeck = new StandardDeck(2);
		System.out.println("Deck with Jokers: " + myDeck);
		
		StandardDeck my2ndDeck = new StandardDeck();	
		my2ndDeck.shuffleDeck();
		System.out.println("Shuffled Deck without Jokers: " + my2ndDeck);	
		}
}