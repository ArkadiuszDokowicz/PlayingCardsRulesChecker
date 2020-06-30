package cardsgame.demo.GameReferee;

import cardsgame.demo.model.MoveFeedback;
import cardsgame.demo.model.PlayingCard;

public interface GameReferee {
    MoveFeedback validMove (PlayingCard first, PlayingCard next);
}
