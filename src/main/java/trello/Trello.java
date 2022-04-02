package trello;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import data.Data;
import models.board.Board;
import models.board.Cards;
import models.board.Lists;
import org.junit.Assert;
import retrofit2.Call;
import retrofit2.Response;
import utils.Caller;
import utils.NumericUtilities;
import utils.Printer;
import utils.ServiceGenerator;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Trello extends Caller {

    TrelloServices services = ServiceGenerator.generateService(TrelloServices.class);
    Printer log = new Printer(Trello.class);
    Properties properties = new Properties();
    NumericUtilities numericUtilities = new NumericUtilities();


    public Trello() {
        try {
            properties.load(new FileReader("src/test/resources/test.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createBoard(String boardName) {
        log.new Info("Creating a board...");
        Call<Board> board = services.createBoard(properties.getProperty("key"), properties.getProperty("token"), boardName);
        Board responseBoard = perform(board, true, "boardCreator");
        log.new Info("Board id is: " + responseBoard.getId());
        log.new Info("Name is verified as: " + responseBoard.getName());
        Data.context.put(boardName, responseBoard);
    }

    public void createList(String listName, String boardName) {
        log.new Info("Creating a list...");
        Call<Lists> list = services.createList(((Board) Data.context.get(boardName)).getId(), properties.getProperty("key"), properties.getProperty("token"), listName);
        Lists responseList = perform(list, true, "listCreator");
        log.new Info("List is: " + responseList.getId());
        Data.context.put(listName, responseList);
    }

    public void createCard(String cardName, String listName) {
        log.new Info("Creating Card...");
        Call<Cards> createCard = services.createCard(properties.getProperty("key"), properties.getProperty("token"), ((Lists) Data.context.get(listName)).getId(), cardName);
        Cards responseCard = perform(createCard, true, "cardCreator");
        log.new Info("Card is: " + responseCard.getId());
        List<Cards> cards = List.of(responseCard);
        Data.context.put(cardName, responseCard);
        if (Data.context.get("cards") == null) Data.context.put("cards", cards);
        else {
            List<Cards> tmpCards = new ArrayList<>((List<Cards>) Data.context.get("cards"));
            tmpCards.add(responseCard);
            Data.context.put("cards",tmpCards);
        }

    }

    public void deleteBoard(String boardName) {
        log.new Info("Deleting a board...");
        Call<Object> deleteRequest = services.deleteBoard(
                ((Board) Data.context.get(boardName)).getId(),
                properties.getProperty("key"),
                properties.getProperty("token"));
        Response<Object> response = getResponse(deleteRequest, true, "boardDelete");
        Assert.assertTrue(response.isSuccessful());
        log.new Info("Successfully deleted board");
    }

    public void deleteCard(String cardName) {
        log.new Info("Deleting a card...");
        Call<Object> deleteCardRequest = services.deleteCard(
                ((Cards) Data.context.get(cardName)).getId(),
                properties.getProperty("key"),
                properties.getProperty("token"));
        Response<Object> response = getResponse(deleteCardRequest, true, "cardDelete");
        Assert.assertTrue(response.isSuccessful());
        log.new Info("Successfully deleted board");
    }

    public void updateRandomCard(String desc) {
        log.new Info("Update a random card desc");
        List<Cards> cardsList =  ((List<Cards>) Data.context.get("cards"));
        int randomIndex = numericUtilities.randomNumber(0, cardsList.size()-1);
        String cardName = cardsList.get(randomIndex).getName();
        log.new Info("Name of the selected card is "+cardName);
        Call<Cards> updateCard = services.updateCard(
                cardsList.get(randomIndex).getId(),
                properties.getProperty("key"),
                properties.getProperty("token"),
                desc);
        Response<Cards> response = getResponse(updateCard, true, "updateCard");
        Assert.assertTrue(response.isSuccessful());
        assert response.body() != null;
        Assert.assertEquals(cardName,response.body().getName());
        Assert.assertEquals(desc,response.body().getDesc());
        log.new Info("Successfully updated card description as "+response.body().getDesc());

    }


}