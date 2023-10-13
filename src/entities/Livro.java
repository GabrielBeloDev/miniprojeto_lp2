package entities;

public class Livro extends Item{

    public Livro(String titulo, String autor, String resumo, String editora, int ano, int qntdePaginas, String genero) {
        super(titulo, autor, resumo, editora, ano, qntdePaginas, genero);
    }

    @Override
    public String toString() {
        return "Título: " + getTitulo() + ", Autor: " + getAutor() + ", Editora: " + getEditora() + ", Ano: " + getAno();
    }

}
