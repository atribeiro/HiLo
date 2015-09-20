package com.funkygames.funkyhilo.Services;

import com.funkygames.funkyhilo.constants.Choice;
import com.funkygames.funkyhilo.constants.ReplayChoice;
import com.funkygames.funkyhilo.exception.InvalidChoiceException;

import java.util.Scanner;

/**
 * Created by Anabela on 20/09/2015.
 */
public class ConsoleMessageService implements MessageService{
    Scanner scanner = new Scanner(System.in);

    @Override
    public void displayMessage(String message) {
        System.out.println();
    }

    @Override
    public Choice getPlayerChoice() throws InvalidChoiceException {


        String input = scanner.nextLine();
        Choice playerChoice = Choice.parse(input);

        return playerChoice;
    }

    @Override
    public ReplayChoice getReplayChoice(){

        String input = scanner.nextLine();
        ReplayChoice replayChoice = ReplayChoice.valueOf(input);

        return replayChoice;
    }
}
