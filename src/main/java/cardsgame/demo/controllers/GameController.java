package cardsgame.demo.controllers;

import cardsgame.demo.payload.request.StartRequest;
import cardsgame.demo.services.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/game")
public class GameController {

    @Autowired
    Game game;

    @PostMapping
    @RequestMapping("/startGame")
    public ResponseEntity<?> startGame(@RequestBody StartRequest request){

        String message = game.startGame(request.getGameName());
        return ResponseEntity.ok(message);
    }
    @PostMapping
    @RequestMapping("/endGame")
    public ResponseEntity<?> endGame(){
        String message = game.endGame();
        return ResponseEntity.ok(message);
    }
    @GetMapping
    @RequestMapping("/gameStatus")
    public ResponseEntity<?>gameStatus(){
        return ResponseEntity.ok(game.getGameStatus());
    }
}
