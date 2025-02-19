package fiap.tds;

import fiap.tds.entities.Colecao;
import fiap.tds.repositories.ColecaoRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {
    private static final String SENHA_MESTRE = "SENHA123";
    public static Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Sistema iniciando...");

        var colecaoRepository = new ColecaoRepository();

        System.out.println("Bem vindo ao sistema de cartas");

        label:
        while (true) {
            System.out.println("Digite a opcao desejada:");
            System.out.println("1 - Adicionar colecao");
            System.out.println("2 - Listar colecoes");
            System.out.println("3 - Remover colecao");
            System.out.println("4 - Listar todas as colecoes (ADMIN APENAS)");
            System.out.println("5 - Exportar arquivo de colecoes");
            System.out.println("6 - Sair");

            var scan = new Scanner(System.in);
            var opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    CadastrarColecao(colecaoRepository);
                    break;
                case 2:
                    System.out.println(colecaoRepository.listar());
                    break;
                case 3:
                    RemoverColecao(colecaoRepository);
                    break;
                case 4:
                    ListarTodasColecoes(colecaoRepository);
                    break;
                case 5:
                    colecaoRepository.exportar();
                    break;
                case 6:
                    break label;
                default:
                    System.out.println("Opcao invalida");
            }
        }
        logger.info("Sistema finalizando...");
    }

    public static void CadastrarColecao(ColecaoRepository repository) {
        try {
            var scan = new Scanner(System.in);
            System.out.println("Digite o id da colecao");
            var id = scan.nextInt();
            scan.nextLine();
            System.out.println("Digite o nome da colecao");
            var nome = scan.nextLine();
            System.out.println("Digite o codigo da colecao");
            var codigo = scan.nextLine();
            System.out.println("Digite a data de lancamento da colecao");
            var dataLancamento = scan.nextLine();
            var colecao = new Colecao(nome, codigo, dataLancamento);
            colecao.setId(id);
            repository.adicionar(colecao);
            logger.info("Colecao registrada com sucesso {}", colecao);
        } catch (Exception e) {
            System.out.println("Campo com valor incorreto");
            logger.error("Erro ao cadastrar colecao", e);
        }
    }

    public static void RemoverColecao(ColecaoRepository repository) {
        System.out.println("Digite o id da colecao que deseja remover");
        var scan = new Scanner(System.in);
        var id = scan.nextInt();
        scan.nextLine();
        repository.deleteById(id);
    }

    public static void ListarTodasColecoes(ColecaoRepository repository) {
        var scan = new Scanner(System.in);
        System.out.println("Digite a senha de administrador");
        var senha = scan.nextLine();
        if (senha.equals(SENHA_MESTRE))
            System.out.println(repository.listarTodos());
        else
            System.out.println("Acesso nao autorizado");
    }
}