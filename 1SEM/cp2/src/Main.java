import Entidades.Curso;
import Entidades.Exercicio;
import Entidades.Usuario;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var novosUsuarios = new ArrayList<Usuario>();
        var novosCursos = new ArrayList<Curso>();
        var novosExercicios = new ArrayList<Exercicio>();
        ArrayList<Exercicio> novasLicoes = new ArrayList<>();

        novosUsuarios.add(new Usuario("Ana", 1));

        novosCursos.add(new Curso("Ingles", new ArrayList<>()));

        novosExercicios.add(new Exercicio("Traduçao", "Como se diz 'Ola' em ingles?", "Hello"));
        novosExercicios.add(new Exercicio("Multipla Escolha", "Qual é a traduçao de 'Thank you'?", "Obrigado"));

        novasLicoes.add(novosExercicios.get(0));
        novasLicoes.add(novosExercicios.get(1));

        System.out.println(novasLicoes);

        novosUsuarios.get(0).realizarExercicio(novasLicoes.get(0));
        novosUsuarios.get(0).realizarExercicio(novasLicoes.get(1));
    }
}