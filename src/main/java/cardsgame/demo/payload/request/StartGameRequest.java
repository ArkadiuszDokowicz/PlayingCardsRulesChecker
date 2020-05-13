package cardsgame.demo.payload.request;

import cardsgame.demo.model.GameType;

import javax.validation.constraints.NotEmpty;
import java.util.List;

public class StartGameRequest {

    @NotEmpty
    private GameType gameType;
    @NotEmpty
    private int playersNumber;
    @NotEmpty
    private List<String>playersNames;

    public GameType getGameType() {
        return gameType;
    }

    public void setGameType(GameType gameType) {
        this.gameType = gameType;
    }

    public int getPlayersNumber() {
        return playersNumber;
    }

    public void setPlayersNumber(int playersNumber) {
        this.playersNumber = playersNumber;
    }

    public List<String> getPlayersNames() {
        return playersNames;
    }

    public void setPlayersNames(List<String> playersNames) {
        this.playersNames = playersNames;
    }
}
