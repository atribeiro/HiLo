package com.funkygames.funkyhilo.model;

import com.funkygames.funkyhilo.constants.Choice;

/**
 * Created by Anabela on 20/09/2015.
 */
public class Game {

    private Card firstCard;
    private Card secondCard;


    public void setFirstCard(Card fisrtCard) {
        this.firstCard = fisrtCard;
    }

    public void setSecondCard(Card secondCard) {
        this.secondCard = secondCard;
    }

    public Card getFirstCard() {
        return firstCard;
    }

    public Card getSecondCard() {
        return secondCard;
    }

    public Choice getOutcome() {

        //5 - decide the outcome
        //if secondCard.compareTo(firstCard) > 0 then outcome is HI else LO
        Choice gameOutcome = null;

        if (firstCard.compareTo(secondCard) > 0) {
            gameOutcome = Choice.HI;
        } else if (firstCard.compareTo(secondCard) < 0) {

            gameOutcome = Choice.LO;
        } else if (firstCard.compareTo(secondCard) == 0) {

            gameOutcome = Choice.DRAW;
        }
        return gameOutcome;
    }
}
