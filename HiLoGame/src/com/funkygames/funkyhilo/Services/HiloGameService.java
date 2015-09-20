package com.funkygames.funkyhilo.Services;

import com.funkygames.funkyhilo.constants.Choice;
import com.funkygames.funkyhilo.constants.Result;
import com.funkygames.funkyhilo.model.Card;
import com.funkygames.funkyhilo.model.Dealer;
import com.funkygames.funkyhilo.model.Game;
import com.funkygames.funkyhilo.model.GameResult;

/**
 * Created by Anabela on 20/09/2015.
 */
    public class HiloGameService implements GameService {


    @Override
    public Game startGame() {

        //1.1 - create dealer
        Dealer dealer = new Dealer();

        Game game = new Game();
        //2 - deal first card
        Card firstCard = dealer.deal();

        game.setFirstCard(firstCard);

        //4 - deal the second card
        Card secondCard = dealer.deal();

        game.setSecondCard(secondCard);

        return game;
    }

    @Override
    public GameResult endGame(Game game, Choice playerChoice) {

        GameResult gameResult = new GameResult();
        gameResult.setGame(game);
        gameResult.setPlayerChoice(playerChoice);

        Choice gameOutcome = game.getOutcome();
        Result result = determineGameResult(playerChoice, gameOutcome);
        System.out.println("You " + result + "!");

        determineGameResult(playerChoice, gameOutcome);
        gameResult.setResult(result);

        return gameResult;
    }

    private Result determineGameResult(Choice playerChoice, Choice gameOutcome) {
        Result result = null;

        if (playerChoice == gameOutcome){
            result = Result.WON;

        }else{
            result = Result.LOST;

        }
        return result;
    }

}
