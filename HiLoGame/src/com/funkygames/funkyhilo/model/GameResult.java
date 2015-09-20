package com.funkygames.funkyhilo.model;

import com.funkygames.funkyhilo.constants.Choice;
import com.funkygames.funkyhilo.constants.Result;

/**
 * Created by Anabela on 20/09/2015.
 */
public class GameResult {

    private Game game;

    private Choice Outcome;

    private Choice PlayerChoice;

    private Result result;


    public Choice getOutcome() {
        return Outcome;
    }

    public void setOutcome(Choice outcome) {
        Outcome = outcome;
    }

    public Choice getPlayerChoice() {
        return PlayerChoice;
    }

    public void setPlayerChoice(Choice playerChoice) {
        PlayerChoice = playerChoice;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }


    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

}
