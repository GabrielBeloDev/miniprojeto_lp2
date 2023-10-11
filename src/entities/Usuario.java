package entities;

public class Usuario {
    private String nome;
    private String cpf;
    private String dataNascimento;
    private boolean isAdulto;


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

    public boolean isAdulto() {
        return isAdulto;
    }

    public void setAdulto(boolean adulto) {
        isAdulto = adulto;
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
