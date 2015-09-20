package com.funkygames.funkyhilo;

import com.funkygames.funkyhilo.Services.ConsoleMessageService;
import com.funkygames.funkyhilo.Services.GameService;
import com.funkygames.funkyhilo.Services.HiloGameService;
import com.funkygames.funkyhilo.Services.MessageService;
import com.funkygames.funkyhilo.constants.Choice;
import com.funkygames.funkyhilo.constants.ReplayChoice;
import com.funkygames.funkyhilo.exception.InvalidChoiceException;
import com.funkygames.funkyhilo.model.Card;
import com.funkygames.funkyhilo.model.Game;
import com.funkygames.funkyhilo.model.GameResult;

import java.util.Scanner;

public class FunkyHiloGame {

    public static void main(String[] args) throws InvalidChoiceException {

        MessageService messageService = new ConsoleMessageService();
        GameService gameService = new HiloGameService();

        do {
            playGame(messageService, gameService);
            messageService.displayMessage("do you want to play again?");
            ReplayChoice replayChoice = messageService.getReplayChoice();

            if (replayChoice == ReplayChoice.NO){
                break;
            }
        }while (true);

    }

    public static void playGame(MessageService messageService, GameService gameService) throws InvalidChoiceException {
        // 1 - start a new game
        Game game = gameService.startGame();
        Card firstCard = game.getFirstCard();

        //2 - display the first card to the user
        messageService.displayMessage("First Card: " + firstCard);

        //3 - prompt the player for their choice
        messageService.displayMessage("Is the next card Hi or Lo?");
        Choice playerChoice = messageService.getPlayerChoice();
        messageService.displayMessage("user entered: " + playerChoice);

        //4 - display second card
        Card secondCard = game.getSecondCard();
        messageService.displayMessage("Second Card: " + secondCard);

        //5 - end game display results
        GameResult result = gameService.endGame(game, playerChoice);
        messageService.displayMessage("You " + result.getResult() + "!");
    }
}
