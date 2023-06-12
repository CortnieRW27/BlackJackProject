package com.skilldistillery.blackjack.entities;

public class Player {
	protected Hand hand;

	public Player() {
		this.hand = new BlackJackHand();

	}

	public Hand getHand() {

		return hand;
	}

	public void addCardToHand(Card card) {
		hand.addCard(card);

	}

	public void displayHand() {
		System.out.println(hand);
	}

	public int getHandValue() {
		return hand.getHandValue();
	}

	@Override
	public String toString() {
		return hand.toString();
	}

}
