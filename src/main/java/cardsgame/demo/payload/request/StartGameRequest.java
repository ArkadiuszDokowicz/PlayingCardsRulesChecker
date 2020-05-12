package cardsgame.demo.payload.request;

import cardsgame.demo.model.GameType;

import javax.validation.constraints.NotEmpty;

public class StartGameRequest {

    @NotEmpty
    private GameType gameType;
    @NotEmpty
    private int players;

    public GameType getGameType() {
        return gameType;
    }

    public void setGameType(GameType gameType) {
        this.gameType = gameType;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }
}
