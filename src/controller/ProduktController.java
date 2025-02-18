package controller;
import model.Produkt;
import view.View;
import java.util.ArrayList;
import java.util.List;
public class ProduktController {
    private final List<Produkt> produkte = new ArrayList<>();
    private final View view;


    public ProduktController(View view) {
        this.view = view;
    }

    public void addProdukt() {
        Produkt produkt = view.getProduktDetails();
        produkte.add(produkt);
        System.out.println("Produkt hinzugefügt!");
    }



}
