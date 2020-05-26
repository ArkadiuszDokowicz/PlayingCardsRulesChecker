package cardsgame.demo.GameReferee;

import cardsgame.demo.model.PlayingCard;

public class MacauGameReferee implements GameReferee{
    @Override
    public boolean validMove(PlayingCard first, PlayingCard next) {
        if(first.getLabel()==next.getLabel()||first.getNumber()==next.getNumber()){
            return true;
        }
        else return false;
    }
}
