package cardsgame.demo.controllers;

import cardsgame.demo.payload.response.TestResponse;
import cardsgame.demo.services.Game;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/test")
public class TestController {

    Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    Game game;

    @GetMapping("/pyConnectTest")
    public TestResponse nextCard(@RequestParam String card){
        logger.info(card);
        return new TestResponse(card);
    }
}
