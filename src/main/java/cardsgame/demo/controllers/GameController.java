package cardsgame.demo.controllers;

import cardsgame.demo.payload.request.StartGameRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/game")
public class GameController {

    @PostMapping
    public ResponseEntity<?> startGame(@RequestBody StartGameRequest request){

        return ResponseEntity.ok("GameStarted");
    }
}
