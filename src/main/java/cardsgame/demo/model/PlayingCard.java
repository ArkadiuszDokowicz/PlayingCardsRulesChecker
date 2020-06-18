package cardsgame.demo.model;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import org.bouncycastle.util.encoders.Hex;
import java.util.Date;

public class PlayingCard {
   private  CardLabel label;
   private  CardNumber number;
   private Date date;
   private  String id;

    public PlayingCard(String card){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        this.date=date;
        this.label=getCardLabel(card);
        this.number=getCardNumber(card);

        try {
            this.id= this.createId(card+date.toString());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            this.id="INITIAL_ID";
        }

    }
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

    public String getId() {
        return id;
    }

    private String createId(String originalString) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(
                originalString.getBytes(StandardCharsets.UTF_8));
        String sha256hex = new String(Hex.encode(hash));
        return sha256hex;
    }
    private CardLabel getCardLabel(String card){
        String[] words = card.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^\\w]", "");
        }
    return  CardLabel.valueOf(words[2]);
    }
    private CardNumber getCardNumber(String card){
        String[] words = card.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^\\w]", "");
        }
        return  CardNumber.valueOf(words[0]);
    }
    public boolean isTheSame(PlayingCard playingCard){
        return this.getLabel().equals(playingCard.getLabel()) && this.getNumber().equals(playingCard.getNumber());
    }
    @Override
    public String toString() {
        return "PlayingCard{" +
                "label=" + label +
                ", number=" + number +
                ", date=" + date +
                ", id='" + id + '\'' +
                '}';
    }
}
