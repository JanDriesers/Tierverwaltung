import java.util.ArrayList;
import java.util.Scanner;

public class TierManager {
    private ArrayList<Tier> tiere = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void tierHinzufuegen() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Art: ");
        String art = scanner.nextLine();
        System.out.print("Alter: ");
        int alter = Integer.parseInt(scanner.nextLine());

        tiere.add(new Tier(name, art, alter));
        System.out.println("Tier hinzugefügt!");
    }

    public void tiereAnzeigen() {
        if (tiere.isEmpty()) {
            System.out.println("Keine Tiere vorhanden.");
            return;
        }
        for (int i = 0; i < tiere.size(); i++) {
            System.out.println((i + 1) + ". " + tiere.get(i));
        }
    }

    public void tierLoeschen() {
        tiereAnzeigen();
        if (tiere.isEmpty()) return;

        System.out.print("Nummer des Tiers zum Löschen: ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;
        if (index >= 0 && index < tiere.size()) {
            tiere.remove(index);
            System.out.println("Tier gelöscht.");
        } else {
            System.out.println("Ungültige Nummer.");
        }
    }
}
