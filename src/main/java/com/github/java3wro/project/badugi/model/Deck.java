package com.github.java3wro.project.badugi.model;

import com.github.java3wro.project.badugi.enums.Rank;
import com.github.java3wro.project.badugi.enums.Suit;

import java.util.*;

public class Deck {

    private List<Card> cardList;

    public void deckInit() {
        cardList = new ArrayList<Card>() {
        };
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                cardList.add(new Card(suit, rank));
            }
        }
        Collections.shuffle(cardList);
        cardList.forEach(System.out::println);
        System.out.println("-----------------------------");
        Arrays.sort(cardList.toArray());
        cardList.forEach(System.out::println);

    }

    public Card giveOneCard() {
        Card cardTaken = cardList.get(0);
        cardList.remove(0);
        return cardTaken;
    }

    public void putOneCardOnEnd(Card returnigCard) {
        cardList.add(cardList.size(), returnigCard);
    }
    public void printList(){

    }
}