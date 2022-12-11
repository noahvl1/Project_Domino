package Game;

import java.util.Scanner;

public class DominoGame {
    private boolean beurt;
    private Bord bord;
    private Pot pot;
    private Computer computerSpeler;
    private Gebruiker gebruikerSpeler;

    public DominoGame() {
        // Default constructor van een bord geeft een leeg bord
        this.bord = new Bord();
        // Default constructor van een pot geeft een pot met alle 28 stenen
        this.pot = new Pot();
        // De computer
        this.computerSpeler = new Computer();
        // De gebruiker
        this.gebruikerSpeler = new Gebruiker();
    }

    public void start() {
        Scanner keyboard = new Scanner(System.in);
        // Vraag naam van gebruiker
        System.out.println("Wat is je naam? ");
        String spelersNaam = keyboard.nextLine();
        gebruikerSpeler.setNaam(spelersNaam);

        // Zet pot en bord waar gebruiker en computer mee spelen
        gebruikerSpeler.setBord(bord);
        gebruikerSpeler.setPot(pot);
        computerSpeler.setBord(bord);
        computerSpeler.setPot(pot);

        // TODO: TIJDELIJK VOOR TESTEN
        System.out.println(pot.toString() + "\n");
        System.out.println(pot.stenen.size());

        // Verdeel stenen bij de start: 7 stenen per speler
        for (int i = 0; i < 8; i++) {
            gebruikerSpeler.neemSteenUitPot();
            computerSpeler.neemSteenUitPot();
        }

        // TODO: TIJDELIJK VOOR TESTEN
        System.out.println(pot.toString() + "\n");
        System.out.println(pot.stenen.size());
        System.out.println(28-(2*7));

        // TODO: eindigde het spel enkel wanneer de pot leeg was?
        while (!pot.isLeeg()) {
            // Main loop

            break;

        } // Einde main loop



        // Na het spel moet gevraagd worden of het spel opgeslagen moet worden
        System.out.println("Moet dit spel opgeslagen worden? (j/n)");
        if (keyboard.nextLine().toLowerCase().charAt(0) == 'j') {
            System.out.println("Spel wordt opgeslagen.");
            // Sla spel op

        } else {
            System.out.println("Spel wordt niet opgeslagen.");
        }
    }
}
