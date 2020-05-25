package cardsgame.demo.services;

import cardsgame.demo.model.GameStatus;
import cardsgame.demo.payload.request.StartGameRequest;
import org.springframework.stereotype.Service;

@Service
public class Game {
    private boolean gameRunning = false;
    private GameStatus gameStatus = null;
    public boolean isGameRunning() {
        return gameRunning;
    }

    private void setGameRunning(boolean gameRunning) {
        this.gameRunning = gameRunning;
    }

    public String startGame(){
        if(isGameRunning()){
            return "Game is already started";
        }
        else{
            setGameRunning(true);
            gameStatus = new GameStatus();
            return "Game Started";
        }
    }

    public String endGame() {
        if(!isGameRunning()){
            return "Game is not running";
        }else{
            this.setGameRunning(false);
            return "Game ended";
        }
    }

    public Object getStatus() {
     return null;
    }
}
