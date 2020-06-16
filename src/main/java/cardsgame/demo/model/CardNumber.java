package cardsgame.demo.model;

public enum CardNumber {

//['Ace', 'Two', 'Three', 'Four', 'Five', 'Six', 'Seven',
//                 'Eight', 'Nine', 'Ten', 'Jack', 'Queen', 'King']:

    Two("Two"),
    Three("Three"),
    Four("Four"),
    Five("Five"),
    Six("Six"),
    Seven("Seven"),
    Eight("Eight"),
    Nine("Nine"),
    Ten("Ten"),
    Jack("Jack"),
    Queen("Queen"),
    King("King");


    //TODO next cards

    private final String value;

     CardNumber(String value) {
        this.value = value;
    }

    }
