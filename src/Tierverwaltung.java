import java.util.Scanner;

public class Tierverwaltung {
    public static void main(String[] args) {
        TierManager manager = new TierManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Tierverwaltung ---");
            System.out.println("1. Tier hinzufügen");
            System.out.println("2. Alle Tiere anzeigen");
            System.out.println("3. Tier löschen");
            System.out.println("4. Beenden");
            System.out.print("Auswahl: ");

            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    manager.tierHinzufuegen();
                    break;
                case "2":
                    manager.tiereAnzeigen();
                    break;
                case "3":
                    manager.tierLoeschen();
                    break;
                case "4":
                    running = false;
                    System.out.println("Programm beendet.");
                    break;
                default:
                    System.out.println("Ungültige Eingabe.");
            }
        }
    }
}
