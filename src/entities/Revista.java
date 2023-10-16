package entities;

public class Revista extends Item {
    private int volume;

    private String mesPublicacao;


    public Revista(String titulo, String autor, String resumo, String editora, int ano, int qntdePaginas, String genero, int volume, String mesPublicacao) {
        super(titulo, autor, resumo, editora, ano, qntdePaginas, genero);
        this.volume = volume;
        this.mesPublicacao = mesPublicacao;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getMesPublicacao() {
        return mesPublicacao;
    }

    public void setMesPublicacao(String mesPublicacao) {
        this.mesPublicacao = mesPublicacao;
    }
}
