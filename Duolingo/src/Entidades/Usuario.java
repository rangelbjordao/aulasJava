package Entidades;

import javax.xml.transform.Source;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Usuario {
    private String nome;
    private int xp;
    private int nivel;
    private Map<Curso, Integer> progressoCurso = new HashMap<>();

    public void realizarExercicio(Exercicio exercicio, String respostaUsuario, Curso curso) {
        var acerto = exercicio.avaliarResposta(respostaUsuario);
        if (acerto) {
            System.out.println("Resposta correta!");
            xp += 10 * exercicio.getDificuldade();
            verificarNivel();
        } else {
            System.out.println("Resposta incorreta!");
        }
        progressoCurso.compute(curso, (k, progresso) -> progresso + 10);
    }

    private void verificarNivel() {
        int nivelCalculado = (xp / 100) + 1;
        if (nivelCalculado > nivel) {
            System.out.println("Parabens, voce subiu de nivel!");
            nivel = nivelCalculado;
        }
    }

    public void visualizarProgresso(Curso curso) {
        var progresso = progressoCurso.get(curso);
        System.out.println("Progresso no curso de " + curso.getIdioma() + ": " + progresso + "%");
    }

    public Usuario() {
    }

    public Usuario(String nome) {
        this.nome = nome;
        this.xp = 0;
        this.nivel = 1;
    }

    public Usuario(String nome, int xp, int nivel, Map<Curso, Integer> progressoCurso) {
        this.nome = nome;
        this.xp = xp;
        this.nivel = nivel;
        this.progressoCurso = progressoCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Map<Curso, Integer> getProgressoCurso() {
        return progressoCurso;
    }

    public void setProgressoCurso(Map<Curso, Integer> progressoCurso) {
        this.progressoCurso = progressoCurso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return getXp() == usuario.getXp() && getNivel() == usuario.getNivel() && Objects.equals(getNome(), usuario.getNome()) && Objects.equals(getProgressoCurso(), usuario.getProgressoCurso());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getXp(), getNivel(), getProgressoCurso());
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", xp=" + xp +
                ", nivel=" + nivel +
                ", progressoCurso=" + progressoCurso +
                '}';
    }
}