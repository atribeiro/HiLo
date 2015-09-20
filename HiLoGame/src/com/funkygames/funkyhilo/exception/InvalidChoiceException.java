package com.funkygames.funkyhilo.exception;

/**
 * Created by Anabela on 20/09/2015.
 */
public class InvalidChoiceException extends Exception {
    public InvalidChoiceException(String usersChoice) {
        super(" \" " +usersChoice+ " \" is not a valida choice");
    }
}
