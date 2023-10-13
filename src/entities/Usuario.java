package entities;

public class Usuario {
    private String nome;
    private String cpf;
    private String dataNascimento;
    private boolean isAdulto;

    // Construtor
    public Usuario(String nome, String cpf, String dataNascimento, boolean isAdulto) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.isAdulto = isAdulto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public boolean getIsAdulto() {
        return isAdulto;
    }

    public void setIsAdulto(boolean isAdulto) {
        this.isAdulto = isAdulto;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", isAdulto=" + isAdulto +
                '}';
    }
}
