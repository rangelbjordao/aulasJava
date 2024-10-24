package Entidades;

import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Usuario {
    private String nome;
    private int xp;
    private int nivelProeficiencia;
    private Map<Curso, Integer> progressoCurso;

    public void realizarExercicio(Exercicio exercicio) {
        System.out.println("Pergunta: " + exercicio.getPergunta());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Resposta:");
        String resposta = scanner.nextLine();
        if (exercicio.getRespostaCorreta().equals(resposta.trim())) {
            System.out.println("Resposta correta!");
            if (nivelProeficiencia == 1) {
                nivelProeficiencia = 2;
            } else if (nivelProeficiencia == 2) {
                nivelProeficiencia = 3;
            }
        } else {
            System.out.println("Resposta errada");
        }
        System.out.println("Novo nivel de proeficiencia: " + nivelProeficiencia);
    }

    private void verificarNivel() {
        int nivelCalculado = (xp / 100) + 1;
        if (nivelCalculado > nivelProeficiencia) {
            System.out.println("Parabens, voce subiu de nivel!");
            nivelProeficiencia = nivelCalculado;
        }
    }

    public Usuario() {
    }

    public Usuario(String nome, int nivelProeficiencia) {
        this.nome = nome;
        this.nivelProeficiencia = nivelProeficiencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivelProeficiencia() {
        return nivelProeficiencia;
    }

    public void setNivelProeficiencia(int nivelProeficiencia) {
        this.nivelProeficiencia = nivelProeficiencia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return getNivelProeficiencia() == usuario.getNivelProeficiencia() && Objects.equals(getNome(), usuario.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getNivelProeficiencia());
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", nivelProeficiencia=" + nivelProeficiencia +
                '}';
    }
}
