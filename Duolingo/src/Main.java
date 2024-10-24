import Entidades.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var usuario = new Usuario("Leo");

        var curso = new Curso("ingles");

        var licao1 = new Licao("Saudacoes");
        var licao2 = new Licao("Animais");

        var exercicio1 = new ExercicoTraducao("Como se diz 'Ola' em ingles?", "Hello", 1);
        var exercicio2 = new ExercicioMultiplaExcolha("Qual e a traducao de 'Thank you'?", "Obrigado", 1, Arrays.asList("Desculpa", "Obrigado", "Por favor", "De nada"));

        licao1.adicionarExercicio(exercicio1);
        licao1.adicionarExercicio(exercicio2);

        curso.adicionarLicao(licao1);

        usuario.getProgressoCurso().put(curso, 0);

        var scanner = new Scanner(System.in);
        for (Exercicio exercicio : licao1.getExercicios()){
            System.out.println("Tipo de pergunta: ");
            System.out.println(exercicio.getPergunta());
            if (exercicio instanceof ExercicioMultiplaExcolha){
                var exercicioME = (ExercicioMultiplaExcolha) exercicio;
                int i = 1;
                for (String opcao : exercicioME.getOpcoes()) {
                System.out.println(i + " - " + opcao);
                i++;
                }
            }
            System.out.println("Resposta: ");
            var respostaUsuario = scanner.nextLine();
            usuario.realizarExercicio(exercicio, respostaUsuario, curso);
        }
        scanner.close();
        usuario.visualizarProgresso(curso);
    }
}