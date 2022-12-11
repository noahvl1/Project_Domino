package Game;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * De pot bevat alle 28 dominostenen wanneer het spel begint, en doorheen het spel worden deze uit de pot genomen
 * door de spelers, die ze dan op het bord proberen te leggen.
 */
public class Pot {
    private static final Random random = new Random();
    public List<Dominosteen> stenen;

    public Pot() {
        // TODO: OK: STENEN JUIST AANGEMAAKT
        // Maak de 28 stenen aan
        int[] eersteWaarden = new int[28];
        int[] tweedeWaarden = new int[28];

        int huidigeEersteWaarde = 0;
        int nog_X_Keren_EersteWaarde = 7;

        int huidigeTweedeWaarde = 0;
        int huidigeLaagsteTweedeWaarde = 0;


        for (int i = 0; i < 28; i++) {
            /*
            Vul de eerste waarde in voor steen i:
            patroon voor alle eerste getallen:
            7 keren 1, 6 keren 2, 5 keren 4, ..., 1 keer 6
            */
            eersteWaarden[i] = huidigeEersteWaarde;
            nog_X_Keren_EersteWaarde--;
            // Als er het juiste aantal keren huidigeEersteWaarde inzit, ga naar volgende huidigeEersteWaarde
            if (nog_X_Keren_EersteWaarde == 0) {
                huidigeEersteWaarde++;
                nog_X_Keren_EersteWaarde = 7 - huidigeEersteWaarde;
            }

            /*
            Vul de tweede waarde in voor steen i:
            patroon voor alle tweede getallen:
            0 tot 6, 1 tot 6, 2 tot 6, ..., 6
            */
            tweedeWaarden[i] = huidigeTweedeWaarde;
            if (huidigeTweedeWaarde == 6) {
                huidigeTweedeWaarde = ++huidigeLaagsteTweedeWaarde;
            } else {huidigeTweedeWaarde++;}

        }

        // Combineer en vul de lijst
        stenen = new LinkedList<>();
        for (int i = 0; i < 28; i++) {
            stenen.add(new Dominosteen(eersteWaarden[i], tweedeWaarden[i]));
        }
    }

    /**
     * Het spel eindigt wanneer de pot leeg is
     */
    public boolean isLeeg() {
        return stenen.isEmpty();
    }

    /**
     * Selecteert willekeurig een steen uit de pot, haalt deze eruit, en retourneert hem.
     */
    public Dominosteen neemSteen() {
        Dominosteen gekozenSteen = stenen.get(random.nextInt(stenen.size()));
        stenen.remove(gekozenSteen);
        return gekozenSteen;
    }

    @Override
    public String toString() {
        return stenen.toString();
    }
}
