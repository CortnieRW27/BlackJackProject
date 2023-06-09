package com.skilldistillery.blackjack.entities;

public enum Suit {
	HEARTS("Hearts"), SPADES("Spades"), CLUBS("Clubs"), DIAMONDS("Diamonds");
	
	private final String name;

	
	Suit(String niceName) {
		name = niceName;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}
