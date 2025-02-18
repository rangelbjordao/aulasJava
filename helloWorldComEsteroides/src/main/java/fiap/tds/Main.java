package fiap.tds;

import fiap.tds.entities.Colecao;
import fiap.tds.repositories.ColecaoRepository;

import java.util.Scanner;

public class Main {
    private static final String SENHA_MESTRE = "SENHA123";
    public static void main(String[] args) {
        var colecaoRepository = new ColecaoRepository();
        System.out.println("Bem vindo ao sistema de cartas");

        while (true) {
            System.out.println("Digite a opcao desejada:");
            System.out.println("1 - Adicionar colecao");
            System.out.println("2 - Listar colecoes");
            System.out.println("3 - Remover colecao");
            System.out.println("4 - Sair");

            var scan = new Scanner(System.in);
            var opcao = scan.nextInt();
            scan.nextLine();

            if (opcao == 1)
                CadastrarColecao(colecaoRepository);
            if (opcao == 2)
                System.out.println(colecaoRepository.listar());
            if (opcao == 3)
                RemoverColecao(colecaoRepository);
            if (opcao == 4) {
                System.out.println("Digite a senha de administrador");
                var senha = scan.nextLine();
                if (senha.equals(SENHA_MESTRE))
                    System.out.println(colecaoRepository.listarTodos());
                else
                    System.out.println("Acesso nao autorizado");
            }
            if (opcao == 5)
                break;
        }
    }
        public static void CadastrarColecao(ColecaoRepository repository){
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
        }

        public static void RemoverColecao(ColecaoRepository repository){
            System.out.println("Digite o id da colecao que deseja remover");
            var scan = new Scanner(System.in);
            var id = scan.nextInt();
            scan.nextLine();
            repository.deleteById(id);
        }
    }