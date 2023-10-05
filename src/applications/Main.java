package applications;

import entities.Biblioteca;
import entities.Item;
import entities.Livro;
import entities.Revista;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro = new Livro("Harry Potter", "J.K. Rowling", "Livro sobre magia", "Editora X", 1998, 500, "Fantasia");
        biblioteca.addItem(livro);
        System.out.println("Livro add: "+ livro.getTitulo());
        System.out.println();

        Revista revista = new Revista("Manga Y", "Autor A", "Manga sobre heróis", "Editora Y", 2020, 100, "Manga", 5, "Maio");
        biblioteca.addItem(revista);
        System.out.println("Revista add: "+ revista.getAutor());
        System.out.println();


        ArrayList<Item> resultadosTitulo = biblioteca.pesquisaPorTitulo("Harry");
        System.out.println("Resultados da pesquisa por título:");
        for (Item item : resultadosTitulo) {
            System.out.println(item.getTitulo());
        }

        // Testando a pesquisa por autor
        ArrayList<Item> resultadosAutor = biblioteca.pesquisaPorAutor("J.K. Rowling");
        System.out.println("\nResultados da pesquisa por autor:");
        for (Item item : resultadosAutor) {
            System.out.println(item.getAutor());
        }

        // Testando a pesquisa por resumo
        ArrayList<Item> resultadosResumo = biblioteca.pesquisaPorResumo("magia");
        System.out.println("\nResultados da pesquisa por resumo:");
        for (Item item : resultadosResumo) {
            System.out.println(item.getResumo());
        }
    }
}
