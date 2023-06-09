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
		System.out.println(deckOfCards);
	}
	public int checkDeckSize() {
		int size = 0;
		return deckOfCards.size();
	}
	public Card dealCard() {
		Card deltCard = deckOfCards.remove(0);
		return deltCard;
	}
	public void shuffle() {
		Collections.shuffle(deckOfCards);
	}
}
