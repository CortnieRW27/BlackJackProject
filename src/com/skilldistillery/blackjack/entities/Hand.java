package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	protected List<Card> cardsInHand = new ArrayList<>();

	public abstract int getHandValue();

	public Hand() {
	}

	public void addCard(Card addedCard) {
		cardsInHand.add(addedCard);
		System.out.println(cardsInHand);
	}

	public void clear() {
		cardsInHand.clear();
	}

}
