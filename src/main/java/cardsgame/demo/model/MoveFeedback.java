package cardsgame.demo.model;

public class MoveFeedback {
    String messsage;
    GameEvent gameEvent;

    public MoveFeedback(String messsage, GameEvent gameEvent) {
        this.messsage = messsage;
        this.gameEvent = gameEvent;
    }

    public String getMesssage() {
        return messsage;
    }

    public GameEvent getGameEvent() {
        return gameEvent;
    }
}
