package entities;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Item> acervo = new ArrayList<>();
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<Movimentacao> movimentacoes = new ArrayList<>();

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

    public boolean podeEmprestar(Usuario usuario) {
        for (Movimentacao mov : movimentacoes) {
            if (mov.getUsuario().equals(usuario) && mov.getDataDevolucao() == null) {
                return false;
            }
        }
        return true;
    }

    public void emprestarItem(Usuario usuario, Item item, String dataEmprestimo) {
        if (podeEmprestar(usuario)) {
            Movimentacao mov = new Movimentacao(usuario, item, dataEmprestimo);
            movimentacoes.add(mov);
        }
    }

    public void registrarDevolucao(Usuario usuario, Item item, String dataDevolucao, String statusLeitura) {
        for (Movimentacao mov : movimentacoes) {
            if (mov.getUsuario().equals(usuario) && mov.getItemEmprestado().equals(item) && mov.getDataDevolucao() == null) {
                mov.registrarDevolucao(dataDevolucao, statusLeitura);
                break;
            }
        }
    }

    public void relatorioEmprestimoDevolucao() {
        System.out.println("Relatório de Empréstimo/Devolução:");
        for (Movimentacao mov : movimentacoes) {
            System.out.println("Usuário: " + mov.getUsuario().getNome());
            System.out.println("Item Emprestado: " + mov.getItemEmprestado().getTitulo());
            System.out.println("Data do Empréstimo: " + mov.getDataEmprestimo());

            String dataDevolucao = mov.getDataDevolucao();
            if (dataDevolucao == null) {
                dataDevolucao = "Ainda não devolvido";
            }
            System.out.println("Data da Devolução: " + dataDevolucao);

            System.out.println("Status de Leitura: " + mov.getStatusLeitura());
            System.out.println("-------------------------------");
        }
    }


    private int contarLivrosLidos(Usuario usuario) {
        int qtdLivrosLidos = 0;
        for (Movimentacao mov : movimentacoes) {
            if (mov.getUsuario().equals(usuario) && "Lido".equals(mov.getStatusLeitura())) {
                qtdLivrosLidos++;
            }
        }
        return qtdLivrosLidos;
    }

    public void relatorioRankingLeitura() {
        System.out.println("Ranking de Leitura (todos os usuários):");
        for (Usuario user : usuarios) {
            int qtdLivrosLidos = contarLivrosLidos(user);
            System.out.println("Usuário: " + user.getNome() + " - Livros lidos: " + qtdLivrosLidos);
        }

        System.out.println("\nRanking de Leitura (apenas crianças):");
        for (Usuario user : usuarios) {
            if (!user.getIsAdulto()) {
                int qtdLivrosLidos = contarLivrosLidos(user);
                System.out.println("Usuário: " + user.getNome() + " - Livros lidos: " + qtdLivrosLidos);
            }
        }
    }


    public void addUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public Usuario buscarUsuarioPorNome(String nome) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equalsIgnoreCase(nome)) {
                return usuario;
            }
        }
        return null;
    }



}


