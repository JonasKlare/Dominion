import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/*
Name: Jonas Klare

Program: Dominion board game

Class: Deck

deck is the place where all of the cards go to get stored.  It takes from the discard pile and gives to the hand
at the beginning of each turn. 
*/


public class deck 
{
//Variables
	int numberOfCards, size, numberOfPlayer, deckSize, turn, randomCard;
	ArrayList<card> player2Deck, player3Deck, player4Deck;
	ArrayList<String> test = new ArrayList<String>();
	ArrayList<String> newTemp = new ArrayList<String>();
	ArrayList<card> temp = new ArrayList<card>();
	ArrayList<card> player1Deck = new ArrayList<card>();
	Random generator = new Random();
//Variables
		
//Constructors
	deck(int newNumberOfPlayer)
	{
		//Make sure to put the
		numberOfPlayer = newNumberOfPlayer;
		deckSize = 10;
	}	
//Constructors
		
//Methods
	//Accessors
	public int getDeckSize()
	{
		return deckSize;
	}
	//Accessors
		
	//Mutators
	public void alterDeckSize(int newDeckSize)
	{
		deckSize = newDeckSize;
	}
	public void alterDeck(card input, ArrayList<card> player1Deck)
	{
		if(numberOfPlayer == 1)
		{
			player1Deck.add(input);
		}
	}
	//Mutators
		
	//Other
	public void fromDiscard(ArrayList<card> temp, int numberOfPlayer)
	{
		/* gets cards from the discard pile and stores them as the new deck
		 * @param (List<card> temp) contains list of cards
		 * @param (int numberOfPlayer) contains an integer 1-4 signifying the number the player is
		 * player1Deck.fromDiscard(player1Discard.toDeck(), 1); <-- example of set up
		 */

		if(numberOfPlayer == 1)
		{
			player1Deck = temp; //Sets the returned value from discard piles toDeck method as the player1Deck, which will be empty.
		}
		if(numberOfPlayer == 2)
		{
			player2Deck = temp;
		}
		if(numberOfPlayer == 3)
		{
			player3Deck = temp;
		}
		if(numberOfPlayer == 4)
		{
			player4Deck = temp;
		}
	}
	public ArrayList<card> toHand(int newDraw, int numberOfPlayer)
	{
		if(numberOfPlayer == 1) //If the number of player number is 1
		{
			size = player1Deck.size(); //Allows them to find the size of this.
			for(int d = 0; d<newDraw; d++)
			{
				//While D is less than the amount that the user requested to draw, continue adding 1 card to hand. 
				temp.add(player1Deck.get(d)); //Adds a single card to the hand
				player1Deck.remove(d);  //Removes the card that was added to the hand. 
			}
		}
		if(numberOfPlayer == 2)
		{
			size = player2Deck.size();
			for(int d = 0; d<newDraw; d++)
			{
				temp.add(player2Deck.get(d));
				player2Deck.remove(d);
			}
		}
		if(numberOfPlayer == 3)
		{
			size = player3Deck.size();
			for(int d = 0; d<newDraw; d++)
			{
				temp.add(player3Deck.get(d));
				player3Deck.remove(d);
			}
		}
		if(numberOfPlayer == 4)
		{
			size = player4Deck.size();
			for(int d = 0; d<newDraw; d++)
			{
				temp.add(player4Deck.get(d));
				player4Deck.remove(d);
			}
		}
		return temp;
	}
	public void shuffle(int numberOfPlayer)
	{
		
		//Code
		if(numberOfPlayer == 1)
		{
			for(int i = 0; i < player1Deck.size();) //While the deck size still have things left in it. 
			{
				randomCard = generator.nextInt((player1Deck.size()+1));
				temp.add(player1Deck.get(randomCard)); //Adds a card from player1 to deck. 
				player1Deck.remove(randomCard); //Removes the card that was put into temp
			}
			player1Deck = temp; //Replaces the player1deck, which is empty, with temp, which has the randomized values
		}
		if(numberOfPlayer == 2) //The rest of these are from above. 
		{
			for(int i = 0; i < player2Deck.size();)
			{
				randomCard = generator.nextInt((player2Deck.size()+1));
				temp.add(player2Deck.get(randomCard));
				player2Deck.remove(randomCard);
			}
			player2Deck = temp;
		}
		if(numberOfPlayer == 3)
		{
			for(int i = 0; i < player3Deck.size();)
			{
				randomCard = generator.nextInt((player3Deck.size()+1));
				temp.add(player3Deck.get(randomCard));
				player3Deck.remove(randomCard);
			}
			player3Deck = temp;
		}
		if(numberOfPlayer == 4)
		{
			for(int i = 0; i < player4Deck.size();)
			{
				randomCard = generator.nextInt((player4Deck.size()+1));
				temp.add(player4Deck.get(randomCard));
				player4Deck.remove(randomCard);
			}
			player4Deck = temp;
		}
		//Code
	}
	//Other
//Methods
}
//TODO try to make it so then game can give all the information needed. 
