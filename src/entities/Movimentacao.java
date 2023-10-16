package entities;

public class Movimentacao {
    private Usuario usuario;
    private Item itemEmprestado;
    private String dataEmprestimo;
    private String dataDevolucao;
    private String statusLeitura;

    public Movimentacao(Usuario usuario, Item itemEmprestado, String dataEmprestimo) {
        this.usuario = usuario;
        this.itemEmprestado = itemEmprestado;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = null;
        this.statusLeitura = "Não Lido"; // Valores padrões 'Lido' e 'Não Lido' para lógica que pensei
    }

    public void registrarDevolucao(String dataDevolucao, String statusLeitura) {
        this.dataDevolucao = dataDevolucao;
        this.statusLeitura = statusLeitura;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Item getItemEmprestado() {
        return itemEmprestado;
    }

    public void setItemEmprestado(Item itemEmprestado) {
        this.itemEmprestado = itemEmprestado;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getStatusLeitura() {
        return statusLeitura;
    }

    public void setStatusLeitura(String statusLeitura) {
        this.statusLeitura = statusLeitura;
    }
}
