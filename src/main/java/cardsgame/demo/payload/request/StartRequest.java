package cardsgame.demo.payload.request;

import javax.validation.constraints.NotEmpty;

public class StartRequest {

    @NotEmpty
    String gameName;


    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }
}
