package applications;

import entities.Biblioteca;
import entities.Livro;
import entities.Revista;

public class Main {
    public static void main(String[] args){
        Biblioteca biblioteca = new Biblioteca();

        Livro livro = new Livro("harry", "rowling","magia","x",1900,10,"m");
        biblioteca.addItem(livro);

        Revista revista = new Revista("Manga Y", "Autor A", "Manga sobre heróis", "Editora Y", 2020, 100, "Manga", 5, "Maio");
        biblioteca.addItem(revista);





    }
}
