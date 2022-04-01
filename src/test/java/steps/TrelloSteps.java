package steps;

import data.Data;
import io.cucumber.java.en.Then;
import models.board.Board;
import trello.Trello;

import java.io.IOException;

public class TrelloSteps {
    Trello trello = new Trello();

    @Then("Create a board named {}")
    public void createBoard(String boardName){trello.createBoard(boardName);}

    @Then("Create a list named {} in board named {}")
    public void createList(String listName,String boardName) {trello.createList(listName,boardName);}

    @Then("Delete a board named {}")
    public void deleteBoardNamed(String boardName) {trello.deleteBoard(boardName);}

    @Then("Delete a board with id {}")
    public void deleteBoard(String id) {trello.deleteBoard(id);}

    @Then("Create a new card named {} for the list named {}")
    public void createCard(String cardName,String listName){trello.createCard(cardName,listName);}

    @Then("Delete the card named {}")
    public void deleteCard(String cardName){trello.deleteCard(cardName);}

    @Then("Update a random cards description as {}")
    public void updateCard(String desc){trello.updateRandomCard(desc);}

}
