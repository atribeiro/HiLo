package com.funkygames.funkyhilo.Services;

import com.funkygames.funkyhilo.constants.Choice;
import com.funkygames.funkyhilo.constants.ReplayChoice;
import com.funkygames.funkyhilo.exception.InvalidChoiceException;

/**
 * Created by Anabela on 20/09/2015.
 */
public interface MessageService {

    public void displayMessage(String message);
    public Choice getPlayerChoice() throws InvalidChoiceException;
    public ReplayChoice getReplayChoice();

}
