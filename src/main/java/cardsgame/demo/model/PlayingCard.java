package cardsgame.demo.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PlayingCard {
    CardLabel label;
    CardNumber number;
    Date date;


    public PlayingCard(CardLabel label, CardNumber number) {
        this.label = label;
        this.number = number;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        this.date=date;
    }

    public CardLabel getLabel() {
        return label;
    }

    public void setLabel(CardLabel label) {
        this.label = label;
    }

    public CardNumber getNumber() {
        return number;
    }

    public void setNumber(CardNumber number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
