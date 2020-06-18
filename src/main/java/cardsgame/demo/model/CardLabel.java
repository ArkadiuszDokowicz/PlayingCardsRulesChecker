package cardsgame.demo.model;

public enum CardLabel {

    //['Spades', 'Diamonds', 'Clubs', 'Hearts']:

    Hearts("Hearts"),
    Diamonds("Diamonds"),
    Clubs("Clubs"),
    Spades("Spades");

    private final String value;

    CardLabel(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "CardLabel{" +
                "value='" + value + '\'' +
                '}';
    }
}
