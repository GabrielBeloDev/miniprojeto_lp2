package entities;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Item> acervo = new ArrayList<>();

    public void addItem(Item item) {
        acervo.add(item);
    }


    public ArrayList<Item> pesquisaPorTitulo(String palavra) {
        ArrayList<Item> resultados = new ArrayList<>();
        for(Item item : acervo){
            if(item.getTitulo().contains(palavra)){
                resultados.add(item);
            }

        }
        return resultados;
    }

    public ArrayList<Item> pesquisaPorAutor(String palavra) {
        ArrayList<Item> resultados = new ArrayList<>();
        for(Item item : acervo){
            if(item.getAutor().contains(palavra)){
                resultados.add(item);
            }

        }
        return resultados;
    }

    public ArrayList<Item> pesquisaPorResumo(String palavra) {
        ArrayList<Item> resultados = new ArrayList<>();
        for(Item item : acervo){
            if(item.getResumo().contains(palavra)){
                resultados.add(item);
            }

        }
        return resultados;
    }





}


