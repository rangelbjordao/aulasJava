import Entidades.*;

import java.util.Arrays;

import static java.util.stream.Collectors.groupingBy;

public class Main {
    public static void main(String[] args) {
        // Criação do usuário
        var usuario = new Usuario("Leo");

        // Criação do curso
        var curso = new Curso("Inglês");

        // Criação das lições
        var licao1 = new Licao("Saudações");
        var licao2 = new Licao("Animais");

        // Criação dos exercícios
        var exericico1 = new ExercicioTraducao("Como se diz 'Olá' em inglês?", "Hello", 1);
        var exercicio2 = new ExercicioMultiplaEscolha("Qual é a tradução de 'Thank you'?",
                "Obrigado", 1, Arrays.asList("Desculpa", "Obrigado", "Por favor", "De nada"));

        licao1.adicionarExercicio(exericico1);
        licao1.adicionarExercicio(exercicio2);

        curso.adicionarLicao(licao1);
        curso.adicionarLicao(licao2);

        usuario.getProgressoCursos().put(curso, 0);

        var scanner = new java.util.Scanner(System.in);
        for(Exercicio exercicio : licao1.getExercicios()){
            System.out.println("Tipo de pergunta: " + exercicio.getTipo());
            System.out.println(exercicio.getPergunta());
            if(exercicio instanceof ExercicioMultiplaEscolha) {
                var exercicioME = (ExercicioMultiplaEscolha) exercicio;
                int i = 1;
                for(String opcao : exercicioME.getOpcoes()) {
                    System.out.println(i + " - " + opcao);
                    i++;
                }
            }
            System.out.println("Resposta: ");
            var repostaUusario = scanner.nextLine();
            usuario.realizarExercicio(exercicio, repostaUusario, curso);
        }
        scanner.close();
        usuario.visualizarProgresso(curso);

        // Stream API;

        // 1. Filtrar exercicios por um tip ex: "Tradução"
        System.out.println("\nExercícios de tradução:");
        var exericiosTraducao = //curso.getLicoes().stream()
                //.flatMap(licao -> licao.getExercicios().stream())
                licao1.getExercicios()
                        .stream().filter(exercicio -> exercicio.getTipo().equals("Tradução"));

        exericiosTraducao.forEach(exercicio -> System.out.println(exercicio.getPergunta()));

        // 2. Get total XP
        var totalXP = usuario.getXp();
        System.out.println("\n Total XP:" + totalXP);

        // 3. Agrupar exercicios por dificuldade
        System.out.println("\n Agrupamento por dificuldade:");
        var agrupamentoDificultade = licao1.getExercicios().stream()
                .collect(groupingBy(Exercicio::getDificuldade));

        agrupamentoDificultade.forEach((dificuldade, exercicios) -> {
            System.out.println("Dificuldade: " + dificuldade);
            exercicios.forEach(exercicio -> System.out.println(exercicio.getPergunta()));
        });

        // 4. taxa de erro do usuario;
        var numExercicios = licao1.getExercicios().size();
        var progresso = usuario.getProgressoCursos().get(curso);
        System.out.println("Taxa de erro: " + (100 - (progresso / (numExercicios * 10))) + "%");
    }
}