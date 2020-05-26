package cardsgame.demo.services;

import cardsgame.demo.controllers.TestController;
import cardsgame.demo.model.GameEvent;
import cardsgame.demo.model.GameStatus;
import cardsgame.demo.payload.request.StartGameRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class Game {
    Logger logger = LoggerFactory.getLogger(Game.class);
    private GameStatus gameStatus = new GameStatus();


    public String startGame(){
        if(gameStatus.isGameRunning()){
            return "Game is already started";
        }
        else{
            gameStatus = new GameStatus(GameEvent.RUNNING);

            return "Game Started";
        }
    }

    public String endGame() {
        if(!gameStatus.isGameRunning()){
            return "Game is not running";
        }else{
            gameStatus = new GameStatus();
            return "Game ended";
        }
    }

    public Object getStatus() {
     return null;
    }
    public void getNextCard(String card){
        if(gameStatus.isGameRunning()){
            logger.info("Card received" + card);


        }
        else{
            logger.info("Card received, but game is not running");
        }
    }
}
