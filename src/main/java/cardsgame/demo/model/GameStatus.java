package cardsgame.demo.model;

import cardsgame.demo.GameReferee.GameReferee;
import cardsgame.demo.GameReferee.MacauGameReferee;

public class GameStatus {
    private PlayingCard currentPlayingCard =null;
    private PlayingCard previousPlayingCard= null;
    private GameEvent gameEvent;
    private String message = null;
    private boolean GameRunning;
    private GameReferee gameReferee;

    public GameStatus() {
        this.gameEvent = GameEvent.NOT_STARTED;
        this.message = "Game is not running";
        this.GameRunning = false;
    }

    public void playCard(PlayingCard nextCard){
        if(gameReferee.validMove(this.currentPlayingCard,nextCard)){
            this.setGameEvent(GameEvent.GOOD_MOVE);
        }else{
            this.setGameEvent(GameEvent.ERROR);
            this.message="One of the rules of the game was broken, check your move again!";
        }
    }

    public GameStatus(GameEvent gameEvent){
        this.gameEvent=gameEvent;
        this.gameReferee = new MacauGameReferee();
    }

    public PlayingCard getCurrentPlayingCard() {
        return currentPlayingCard;
    }

    public void setCurrentPlayingCard(PlayingCard currentPlayingCard) {
        this.currentPlayingCard = currentPlayingCard;
    }

    public PlayingCard getPreviousPlayingCard() {
        return previousPlayingCard;
    }

    public void setPreviousPlayingCard(PlayingCard previousPlayingCard) {
        this.previousPlayingCard = previousPlayingCard;
    }

    public GameEvent getGameEvent() {
        return gameEvent;
    }

    public void setGameEvent(GameEvent gameEvent) {
        this.gameEvent = gameEvent;
        this.GameRunning= !this.gameEvent.equals(GameEvent.NOT_STARTED);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isGameRunning() {
        return GameRunning;
    }
}
