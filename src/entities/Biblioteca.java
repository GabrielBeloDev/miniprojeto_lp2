package entities;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Item> acervo = new ArrayList<>();

    public void addItem(Item item) {
        acervo.add(item);
    }
}
