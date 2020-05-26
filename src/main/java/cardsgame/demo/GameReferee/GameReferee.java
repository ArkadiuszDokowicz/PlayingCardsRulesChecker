package cardsgame.demo.GameReferee;

import cardsgame.demo.model.PlayingCard;

public interface GameReferee {
    boolean validMove (PlayingCard first,PlayingCard next);
}
