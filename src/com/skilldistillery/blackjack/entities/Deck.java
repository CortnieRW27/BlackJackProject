package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private List<Card> deckOfCards = new ArrayList<>();

	public Deck() {
		for (Rank rank : Rank.values()) {
			for (Suit suit : Suit.values()) {
				Card card = new Card(rank, suit);
				deckOfCards.add(card);
			}
		}
	}

	public int checkDeckSize() {
		int size = 0;
		return deckOfCards.size();
	}

	public Card dealCard() {
		return deckOfCards.remove(0);

	}

	public void shuffle() {
		Collections.shuffle(deckOfCards);
	}

	@Override
	public String toString() {
		return "Deck [deckOfCards=" + deckOfCards + "]";
	}

	public List<Card> getDeckOfCards() {
		return deckOfCards;
	}

}
