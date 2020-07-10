package cardsgame.demo.services;

import cardsgame.demo.GameReferee.GameReferee;
import cardsgame.demo.GameReferee.MacauGameReferee;
import cardsgame.demo.model.GameEvent;
import cardsgame.demo.model.GameStatus;
import cardsgame.demo.model.MoveFeedback;
import cardsgame.demo.model.PlayingCard;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class Game {
    Logger logger = LoggerFactory.getLogger(Game.class);

    private GameStatus gameStatus = new GameStatus();

    private GameReferee gameReferee = new MacauGameReferee();



    public String startGame(String gameName){
        if(gameStatus.isGameRunning()){
            logger.info("failed try to start game");
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Game is already started");
        }
        else{
            gameStatus = new GameStatus(GameEvent.RUNNING);
            gameStatus.setName(gameName);
            logger.info("Game :"+ gameName + " started");
            return "Game Started";
        }
    }

    public String endGame() {
        if(!gameStatus.isGameRunning()){

            logger.info("failed try to end game");
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Game is not running");
        }else{
            String oldGameName = gameStatus.getName();
            gameStatus = new GameStatus();
            logger.info("end game :"+oldGameName);
            return "Game end";
        }
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setNextCard(String card){

        if(gameStatus.isGameRunning()){
            logger.info("Card received :" + card);
            PlayingCard newCard = new PlayingCard(card);
            if(gameStatus.getCurrentPlayingCard()==null || !gameStatus.getCurrentPlayingCard().isTheSame(newCard)){
                boolean isMoveValid = this.playCard(newCard);
                if(isMoveValid){
                    this.gameStatus.setCurrentPlayingCard(newCard);
                }
            }else{
                logger.info("PyCamera Send The same card");
            }
        }
        else{
            logger.info("Card received, but game is not running");
        }
    }
    private boolean playCard(PlayingCard nextCard){
        MoveFeedback feedback = gameReferee.validMove(gameStatus.getCurrentPlayingCard(),nextCard);
        if(feedback.getGameEvent().equals(GameEvent.GOOD_MOVE)){
            this.gameStatus.setGameEvent(GameEvent.GOOD_MOVE);
            this.gameStatus.setMessage(feedback.getMesssage());
            return  true;
        }else{
            this.gameStatus.setGameEvent(GameEvent.ERROR);
            this.gameStatus.setMessage(feedback.getMesssage());
            return false;
        }
    }

}
