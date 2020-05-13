package cardsgame.demo.controllers;

import cardsgame.demo.payload.request.StartGameRequest;
import cardsgame.demo.services.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;

@RestController
@RequestMapping("/api/game")
public class GameController {

    @Autowired
    Game game;

    @PostMapping
    @RequestMapping("/startGame")
    public ResponseEntity<?> startGame(@RequestBody StartGameRequest request){
        String message = game.startGame();
        return ResponseEntity.ok(message);
    }
    @GetMapping
    @RequestMapping("/endGame")
    public ResponseEntity<?> endGame(){
        String message = game.endGame();
        return ResponseEntity.ok(message);
    }
}
