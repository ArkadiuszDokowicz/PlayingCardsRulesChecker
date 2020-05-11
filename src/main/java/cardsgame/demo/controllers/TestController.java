package cardsgame.demo.controllers;

import cardsgame.demo.payload.response.TestResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/test")
public class TestController {

    Logger logger = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/pyConnectTest")
    public TestResponse nextCard(@RequestParam String card){
        logger.info(card);
        return new TestResponse(card);
    }
}
