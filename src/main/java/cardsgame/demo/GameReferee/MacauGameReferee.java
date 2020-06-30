package cardsgame.demo.GameReferee;

import cardsgame.demo.model.CardNumber;
import cardsgame.demo.model.GameEvent;
import cardsgame.demo.model.MoveFeedback;
import cardsgame.demo.model.PlayingCard;

public class MacauGameReferee implements GameReferee{
    @Override
    public MoveFeedback validMove(PlayingCard first, PlayingCard next) {
        if(first==null){//this is first move
            return new MoveFeedback("Keep playing", GameEvent.GOOD_MOVE);
        }
        if(first.getLabel()==next.getLabel()){
            return new MoveFeedback("Keep playing",GameEvent.GOOD_MOVE);
        }
        if(first.getNumber()==next.getNumber()){
            return new MoveFeedback("Keep playing",GameEvent.GOOD_MOVE);
        }
        if(first.getNumber().equals(CardNumber.Jack)){
            if(next.getNumber().equals(CardNumber.Two)){
                return new MoveFeedback("Move your card back, you cant put functional card on Jack",GameEvent.ERROR);
            }
            else if(next.getNumber().equals(CardNumber.Three)){
                return new MoveFeedback("Move your card back, you cant put functional card on Jack",GameEvent.ERROR);
            }
            else if(next.getNumber().equals(CardNumber.King)){
                return new MoveFeedback("Move your card back, you cant put functional card on Jack",GameEvent.ERROR);
            }
            else if(next.getNumber().equals(CardNumber.Ace)){
                return new MoveFeedback("Move your card back, you cant put functional card on Jack",GameEvent.ERROR);
            }
            else{
                return new MoveFeedback("Keep playing",GameEvent.GOOD_MOVE);
            }
        }
        if(first.getNumber().equals(CardNumber.Ace)){
            return new MoveFeedback("Keep playing",GameEvent.GOOD_MOVE);
        }
        return new MoveFeedback("Move your card back, it is a wrong cards",GameEvent.ERROR);
    }
}
