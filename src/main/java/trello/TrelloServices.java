package trello;

import models.board.Board;
import retrofit2.Call;
import retrofit2.http.*;

public interface TrelloServices {

    String BASE_URL = TrelloApi.BASE_URL;

    @POST(BASE_URL + TrelloApi.BOARD_SUFFIX)
    Call<Board> createBoard(@Query("key") String key, @Query("token") String token, @Query("name") String name);

    @POST(BASE_URL + TrelloApi.CARD_SUFFIX)
    Call<Board.Cards> createCard(@Query("key") String key, @Query("token") String token, @Query("idList") String name);

    @POST(BASE_URL + TrelloApi.BOARD_SUFFIX+TrelloApi.LIST_SUFFIX)
    Call<Board.Lists> createList(@Path("id")String id, @Query("key") String key, @Query("token") String token, @Query("name") String name);

    @DELETE(BASE_URL + TrelloApi.BOARD_SUFFIX + "{id}/")
    Call<Object> deleteBoard(@Path("id") String id, @Query("key") String key, @Query("token") String token);

    @DELETE(BASE_URL + TrelloApi.CARD_SUFFIX + "{id}/")
    Call<Object> deleteCard(@Path("id") String id, @Query("key") String key, @Query("token") String token);


}