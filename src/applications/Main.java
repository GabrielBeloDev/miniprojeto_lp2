package applications;

import entities.Biblioteca;
import entities.Livro;
import entities.Usuario;
import entities.Revista;
import entities.Item;
import java.util.ArrayList;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Adicionar livro");
            System.out.println("2. Adicionar revista");
            System.out.println("3. Adicionar usuário");
            System.out.println("4. Emprestar item");
            System.out.println("5. Registrar devolução");
            System.out.println("6. Gerar relatório de empréstimos/devoluções");
            System.out.println("7. Gerar ranking de leitura");
            System.out.println("8. Consultar acervo por título");
            System.out.println("9. Consultar acervo por autor");
            System.out.println("10. Consultar acervo por resumo");
            System.out.println("11. Editar usuário");
            System.out.println("12. Mostrar todos os usuários");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o título do livro: ");
                    String tituloLivro = sc.nextLine();
                    System.out.print("Informe o autor do livro: ");
                    String autorLivro = sc.nextLine();
                    System.out.print("Informe o resumo do livro: ");
                    String resumoLivro = sc.nextLine();
                    System.out.print("Informe a editora do livro: ");
                    String editoraLivro = sc.nextLine();
                    System.out.print("Informe o ano de publicação do livro: ");
                    int anoLivro = sc.nextInt();
                    System.out.print("Informe a quantidade de páginas do livro: ");
                    int qntdePaginasLivro = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Informe o gênero do livro: ");
                    String generoLivro = sc.nextLine();

                    Livro novoLivro = new Livro(tituloLivro, autorLivro, resumoLivro, editoraLivro, anoLivro, qntdePaginasLivro, generoLivro);
                    biblioteca.addItem(novoLivro);
                    System.out.println("Livro adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("Informe o título da revista: ");
                    String tituloRevista = sc.nextLine();
                    System.out.print("Informe o autor da revista: ");
                    String autorRevista = sc.nextLine();
                    System.out.print("Informe o resumo da revista: ");
                    String resumoRevista = sc.nextLine();
                    System.out.print("Informe a editora da revista: ");
                    String editoraRevista = sc.nextLine();
                    System.out.print("Informe o ano de publicação da revista: ");
                    int anoRevista = sc.nextInt();
                    System.out.print("Informe a quantidade de páginas da revista: ");
                    int qntdePaginasRevista = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Informe o gênero da revista: ");
                    String generoRevista = sc.nextLine();
                    System.out.print("Informe o volume da revista: ");
                    int volumeRevista = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Informe o mês de publicação da revista: ");
                    String mesPublicacaoRevista = sc.nextLine();

                    Revista novaRevista = new Revista(tituloRevista, autorRevista, resumoRevista, editoraRevista, anoRevista, qntdePaginasRevista, generoRevista, volumeRevista, mesPublicacaoRevista);
                    biblioteca.addItem(novaRevista);
                    System.out.println("Revista adicionada com sucesso!");
                    break;

                case 3:
                    System.out.print("Informe o nome do usuário: ");
                    String nomeUsuario = sc.nextLine();
                    System.out.print("Informe o CPF do usuário: ");
                    String cpfUsuario = sc.nextLine();
                    System.out.print("Informe a data de nascimento do usuário (dd/MM/yyyy): ");
                    String dataNascimentoUsuario = sc.nextLine();
                    System.out.print("O usuário é adulto? (true para sim, false para não): ");
                    boolean isAdultoUsuario = sc.nextBoolean();
                    sc.nextLine();

                    Usuario novoUsuario = new Usuario(nomeUsuario, cpfUsuario, dataNascimentoUsuario, isAdultoUsuario);
                    biblioteca.addUsuario(novoUsuario);
                    System.out.println("Usuário adicionado com sucesso!");
                    break;

                case 4:
                    System.out.print("Informe o nome do usuário que deseja fazer o empréstimo: ");
                    String nomeUsuarioEmprestimo = sc.nextLine();
                    System.out.print("Informe o título do item a ser emprestado: ");
                    String tituloEmprestimo = sc.nextLine();
                    System.out.print("Informe a data de empréstimo (dd/MM/yyyy): ");
                    String dataEmprestimo = sc.nextLine();

                    Usuario usuarioEmprestimo = biblioteca.buscarUsuarioPorNome(nomeUsuarioEmprestimo);
                    ArrayList<Item> itensParaEmprestimo = biblioteca.pesquisaPorTitulo(tituloEmprestimo);

                    if (usuarioEmprestimo != null && !itensParaEmprestimo.isEmpty()) {
                        biblioteca.emprestarItem(usuarioEmprestimo, itensParaEmprestimo.get(0), dataEmprestimo);
                    } else {
                        System.out.println("Usuário ou item não encontrado ou item já emprestado para outro usuário!");
                    }
                    break;

                case 5:
                    System.out.print("Informe o nome do usuário que deseja registrar a devolução: ");
                    String nomeUsuarioDevolucao = sc.nextLine();
                    System.out.print("Informe o título do item a ser devolvido: ");
                    String tituloDevolucao = sc.nextLine();
                    System.out.print("Informe a data de devolução (dd/MM/yyyy): ");
                    String dataDevolucao = sc.nextLine();
                    System.out.print("Informe o status da leitura (Lido/Não Lido): ");
                    String statusLeitura = sc.nextLine();

                    Usuario usuarioDevolucao = biblioteca.buscarUsuarioPorNome(nomeUsuarioDevolucao);
                    ArrayList<Item> itensParaDevolucao = biblioteca.pesquisaPorTitulo(tituloDevolucao);

                    if (usuarioDevolucao != null && !itensParaDevolucao.isEmpty()) {
                        biblioteca.registrarDevolucao(usuarioDevolucao, itensParaDevolucao.get(0), dataDevolucao, statusLeitura);
                        System.out.println("Devolução registrada com sucesso!");
                    } else {
                        System.out.println("Usuário ou item não encontrado!");
                    }
                    break;

                case 6:
                    biblioteca.relatorioEmprestimoDevolucao();
                    break;

                case 7:
                    biblioteca.relatorioRankingLeitura();
                    break;

                case 8:
                    System.out.print("Informe a palavra-chave para pesquisa por título: ");
                    String palavraTitulo = sc.nextLine();
                    ArrayList<Item> resultadosTitulo = biblioteca.pesquisaPorTitulo(palavraTitulo);
                    for (Item item : resultadosTitulo) {
                        System.out.println(item);
                    }
                    break;

                case 9:
                    System.out.print("Informe a palavra-chave para pesquisa por autor: ");
                    String palavraAutor = sc.nextLine();
                    ArrayList<Item> resultadosAutor = biblioteca.pesquisaPorAutor(palavraAutor);
                    for (Item item : resultadosAutor) {
                        System.out.println(item);
                    }
                    break;

                case 10:
                    System.out.print("Informe a palavra-chave para pesquisa por resumo: ");
                    String palavraResumo = sc.nextLine();
                    ArrayList<Item> resultadosResumo = biblioteca.pesquisaPorResumo(palavraResumo);
                    for (Item item : resultadosResumo) {
                        System.out.println(item);
                    }
                    break;

                case 11:
                    System.out.print("Informe o CPF do usuário que deseja editar: ");
                    String cpfEditar = sc.nextLine();
                    Usuario usuarioEditar = biblioteca.buscarUsuarioPorCPF(cpfEditar);

                    if (usuarioEditar == null) {
                        System.out.println("Usuário não encontrado!");
                    } else {
                        System.out.print("Informe o novo nome do usuário (ou pressione enter para manter o atual): ");
                        String novoNome = sc.nextLine();
                        if (novoNome.length() > 0) {
                            usuarioEditar.setNome(novoNome);
                        }

                        System.out.print("Informe a nova data de nascimento do usuário (dd/MM/yyyy) (ou pressione enter para manter a atual): ");
                        String novaDataNascimento = sc.nextLine();
                        if (novaDataNascimento.length() > 0) {
                            usuarioEditar.setDataNascimento(novaDataNascimento);
                        }

                        System.out.print("O usuário é adulto? (true para sim, false para não) (ou pressione enter para manter o atual): ");
                        String novoIsAdulto = sc.nextLine();
                        if (novoIsAdulto.length() > 0) {
                            usuarioEditar.setIsAdulto(Boolean.parseBoolean(novoIsAdulto));
                        }

                        System.out.println("Usuário atualizado com sucesso!");
                    }
                    break;

                case 12:
                    biblioteca.mostrarUsuarios();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
