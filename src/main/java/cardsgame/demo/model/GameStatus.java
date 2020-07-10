package cardsgame.demo.model;

import cardsgame.demo.GameReferee.MacauGameReferee;

public class GameStatus {

    private int id = 0;
    private PlayingCard currentPlayingCard =null;
    private PlayingCard previousPlayingCard= null;
    private GameEvent gameEvent;
    private String message = null;
    private boolean GameRunning;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GameStatus() {
        this.gameEvent = GameEvent.NOT_STARTED;
        this.message = "Game is not running";
        this.GameRunning = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GameStatus(GameEvent gameEvent){
        this.gameEvent=gameEvent;
    }

    public PlayingCard getCurrentPlayingCard() {
        return currentPlayingCard;
    }

    public void setCurrentPlayingCard(PlayingCard currentPlayingCard) {
        this.previousPlayingCard = this.currentPlayingCard;
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
        this.id++;
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
        return !this.gameEvent.equals(GameEvent.NOT_STARTED);
    }

    @Override
    public String toString() {
        return "GameStatus{" +
                "currentPlayingCard=" + currentPlayingCard +
                ", previousPlayingCard=" + previousPlayingCard +
                ", gameEvent=" + gameEvent +
                ", message='" + message + '\'' +
                '}';
    }
}
