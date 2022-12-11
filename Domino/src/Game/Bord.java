package Game;

import java.util.LinkedList;
import java.util.List;

public class Bord {
    private List<Dominosteen> afgelegdeStenen;

    public Bord(List<Dominosteen> afgelegdeStenen) {
        this.afgelegdeStenen = afgelegdeStenen;
    }

    /**
     * Default constructor die een leeg bord maakt.
     */
    public Bord() {
        this(new LinkedList<>());
    }

    public boolean isBordOk() {
        return true; // TODO
    }

    public int[] getUiteinden() {
        return new int[]{afgelegdeStenen.get(0).getWaarden()[0], afgelegdeStenen.get(afgelegdeStenen.size() - 1).getWaarden()[1]};
    }
}
