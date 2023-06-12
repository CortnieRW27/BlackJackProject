package com.skilldistillery.blackjack.app;

import java.util.List;
import java.util.Scanner;

import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Player;

public class BJApp {
	boolean keepPlaying = true;
	int choice;
	Player player = new Player();
	Dealer dealer = new Dealer();
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		BJApp bj = new BJApp();
		bj.run();
	}

	public void run() {

		System.out.println("Welcome to the game of BlackJack!");
		System.out.println("Please enter 1 to play or 2 to quit.");

		if (input.nextInt() == 1) {
			playTheGame();
			playerChoice();
			dealerChoice();
			winnerChoice();
		} else {
			System.out.println("GoodBye!");
		}
	}

	public void playTheGame() {
		dealer.shuffleDeck();
		input.nextLine();
		System.out.println("Player first card");
		dealer.dealIntialHands(player);
		System.out.println();

		System.out.println("Dealer first card");
		dealer.dealIntialHands(dealer);
		System.out.println();

		System.out.println("Player hand");
		dealer.dealIntialHands(player);
		System.out.println("Your hand value is: " + player.getHandValue());
		System.out.println();

		System.out.println("Dealer hand");
		dealer.dealIntialHands(dealer);
		System.out.println("Dealer's hand value is: " + dealer.getHandValue());

		if (player.getHandValue() == 21 || dealer.getHandValue() == 21) {
			System.out.println("BlackJack!");
			run();
		}
	}

	public void playerChoice() {
		if (player.getHandValue() < 21) {
			System.out.println("Enter 1 to hit or 2 to Stand");
		}

		if (input.nextInt() == 1) {
			player.addCardToHand(dealer.dealCard());
			System.out.println("Your hand value is: " + player.getHandValue());
		}
		if (player.getHandValue() == 21) {
			System.out.println("BlackJack!");
		}
		if (player.getHandValue() > 21) {
			System.out.println("BUST!");
		}
	}

	public void dealerChoice() {
		while (dealer.getHandValue() < 17) {
			System.out.println("Dealer hits!");
			System.out.println();
			dealer.addCardToHand(dealer.dealCard());
			System.out.println("Dealer's hand value is: " + dealer.getHandValue());
			if (dealer.getHandValue() >= 17) {
				System.out.println("Dealer must stand");
			}
			else if (dealer.getHandValue() == 21) {
				System.out.println("BlackJack!");
			}
			else if (dealer.getHandValue() > 21) {
				System.out.println("Bust!");
			}
		}

	}

	public void winnerChoice() {
		if (dealer.getHandValue() > player.getHandValue() && dealer.getHandValue() < 22
				|| dealer.getHandValue() == 21) {
			System.out.println("Dealer Won!");

		} else if (dealer.getHandValue() < player.getHandValue() && player.getHandValue() < 22
				|| player.getHandValue() == 21) {
			System.out.println("Player Won!");

		} else if (dealer.getHandValue() == player.getHandValue()) {
			System.out.println("Draw");
			run();
		}
		run();
	}

}
