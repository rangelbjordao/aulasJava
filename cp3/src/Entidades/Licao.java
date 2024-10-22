package Entidades;

import java.util.List;
import java.util.Objects;

public class Licao {
    private List<Exercicio> exercicios;

    public void adicionarExercio(Exercicio exercicio) {
        exercicios.add(exercicio);
    }

    public Licao() {
    }

    public Licao(List<Exercicio> exercicios) {
        this.exercicios = exercicios;
    }

    public List<Exercicio> getExercicios() {
        return exercicios;
    }

    public void setExercicios(List<Exercicio> exercicios) {
        this.exercicios = exercicios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Licao licao = (Licao) o;
        return Objects.equals(getExercicios(), licao.getExercicios());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getExercicios());
    }

    @Override
    public String toString() {
        return "Licao{" +
                "exercicios=" + exercicios +
                '}';
    }
}
