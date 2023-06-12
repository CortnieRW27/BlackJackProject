package com.skilldistillery.blackjack.entities;

public class BlackJackHand extends Hand {

	public BlackJackHand() {
	}

	@Override
	public int getHandValue() {
		int sum = 0;
		for (Card card : cardsInHand) {
			sum += card.getValue();
		}
		return sum;

	}

	public boolean isBlackJack() {
		return getHandValue() == 21;

	}

	public boolean isBust() {
		return getHandValue() > 21;
	}

}
