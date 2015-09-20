package com.funkygames.funkyhilo.Services;

import com.funkygames.funkyhilo.constants.Choice;
import com.funkygames.funkyhilo.model.Game;
import com.funkygames.funkyhilo.model.GameResult;


import javax.xml.stream.events.StartDocument;

/**
 * Created by Anabela on 20/09/2015.
 */
public interface GameService {

    public Game startGame();

    public GameResult endGame(Game game, Choice playerChoice);

}
