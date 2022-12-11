package Game;

import java.util.ArrayList;
import java.util.List;

public class Speler {
    private List<Dominosteen> hand;
    private String naam;
    // De pot waar de speler mee speelt
    private Pot pot;
    // Het bord waar de speler op speelt
    private Bord bord;

    public Speler() {
        hand = new ArrayList<>();
    }

    public void neemSteenUitPot() {
        hand.add(pot.neemSteen());
    }

    public String getNaam() {
        return naam;
    }

    public List<Dominosteen> getHand() {
        return hand;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setPot(Pot pot) {
        this.pot = pot;
    }

    public void setBord(Bord bord) {
        this.bord = bord;
    }
}
