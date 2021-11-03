package com.blp.objectorientedprogramming;

/**
 * Deck Of Cards
 * Print the card received by four player using 2D array
 */
public class DeckOfCards {

    public static void main(String[] args) {
        Cards card = new Cards();
        card.initializeCards();
        card.shuffleCards();
        card.displayCards();
    }
}