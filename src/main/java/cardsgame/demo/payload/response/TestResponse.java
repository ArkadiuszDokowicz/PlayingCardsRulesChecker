package cardsgame.demo.payload.response;

public class TestResponse {
    private String card;

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public TestResponse(String card) {
        this.card = card;
    }
}
