package Game;

public class Dominosteen {
    private final int[] waarden;

    public Dominosteen(int waarde1, int waarde2) {
        this.waarden = new int[]{waarde1, waarde2};
    }

    public int[] getWaarden() {
        return waarden;
    }

    /**
     * Geeft de som van de twee getallen op de steen terug.
     * Gebruikt om te bepalen wie begint.
     */
    public int getDubbeleWaarde() {
        return waarden[0] + waarden[1];
    }

    @Override
    public String toString() {
        return String.format("[%d, %d]", getWaarden()[0], getWaarden()[1]);
    }
}
