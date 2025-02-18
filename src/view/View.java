package view;

import model.Charakter;
import model.Produkt;
import java.util.List;
import java.util.Scanner;

public class View {
    private Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        System.out.println("1. Produkt hinzufügen");
        System.out.println("2. Produkt bearbeiten");
        System.out.println("3. Produkt löschen");
        System.out.println("4. Produkte anzeigen");
        System.out.println("5. Charakter hinzufügen");
        System.out.println("6. Charakter bearbeiten");
        System.out.println("7. Charakter löschen");
        System.out.println("8. Charaktere anzeigen");
        System.out.println("9. Charaktere nach Region filtern");
        System.out.println("10. Charaktere nach gekauften Produkten filtern");
        System.out.println("11. Produkte eines Charakters sortieren");
        System.out.println("0. Beenden");
    }

    public int getUserChoice() {
        return scanner.nextInt();
    }

    public String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.next();
    }

    public void displayCharacters(List<Charakter> charaktere) {
        for (Charakter charakter : charaktere) {
            System.out.println(charakter.getName());
        }
    }

    public Produkt getProduktDetails() {
        return null;
    }
}
