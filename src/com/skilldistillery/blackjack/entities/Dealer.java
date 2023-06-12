package com.skilldistillery.blackjack.entities;

public class Dealer extends Player {
	private Deck deck = new Deck();
	protected Hand hand;
	private Card card;

	public Dealer() {
		this.deck = new Deck();

	}

	public void dealIntialHands(Player player) {
		Card cardGivenFromDealer = deck.dealCard();
		player.addCardToHand(cardGivenFromDealer);

	}

	public Card dealCard() {
		Card deltCard = deck.dealCard();
		return deltCard;
	}

	public void shuffleDeck() {
		deck.shuffle();
	}

	@Override
	public String toString() {
		return card.toString() + "[Hidden Card]";
	}

	public Deck getDeck() {
		return deck;
	}

}
