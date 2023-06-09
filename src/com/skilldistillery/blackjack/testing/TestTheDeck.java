package com.skilldistillery.blackjack.testing;

import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Deck;

public class TestTheDeck {

	public static void main(String[] args) {
		TestTheDeck td = new TestTheDeck();
		td.run();
	}

	public void run() {

		Deck deckOfCards = new Deck();
		System.out.println(deckOfCards.checkDeckSize());

		//deckOfCards.shuffle();
		for (int cardNumber = 0; cardNumber < 52; cardNumber++) {
			Card card = deckOfCards.dealCard();
			System.out.println(card + " " + deckOfCards.checkDeckSize());
		}

	}

}
