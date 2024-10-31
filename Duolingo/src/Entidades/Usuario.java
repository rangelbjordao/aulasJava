package Entidades;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Usuario {
    private String nome;
    private int xp;
    private int nivel;
    private Map<Curso, Integer> progressoCursos = new HashMap<>();
    // Uma alternativa do Map seria usar uma
    // lista de uma classe

    public void realizarExercicio(Exercicio exercicio, String respostaUsuario, Curso curso)
    {
        var acerto = exercicio.avaliarResposta(respostaUsuario); // 1 - verificar a resposta do exercício
        if(acerto){ // 2 - se acertou, adicionar xp
            System.out.println("Resposta correta!"); // 3 - mostrar mensagem de acerto
            xp +=10 * exercicio.getDificuldade(); // 4 - adicionar xp
            verificarNivel(); // 5 - verificar se subiu de nível
        }
        else{
            System.out.println("Resposta incorreta!");
        }
        // calcular progresso, por exemplo, 50% de 10 exercícios em 2 lições de um curso
        //var progresso = progressoCursos.get(curso);
        //progresso += 100 / (curso.getLicoes().size() *
        //curso.getLicoes().get(0).getExercicios().size());
        //progressoCursos.put(curso, progresso);
    }

    private void verificarNivel(){
        int nivelCalculado = (xp /100) + 1;
        if(nivelCalculado > nivel){
            System.out.println("Parabéns, você subiu de nível!");
            nivel = nivelCalculado;
        }
    }

    public void visualizarProgresso(Curso curso){
        var progresso = progressoCursos.get(curso);
        System.out.println("Progresso no curso de " + curso.getIdioma() + ": " + progresso + "%");
    }

    public Usuario() {
    }

    public Usuario(String nome){
        this.nome = nome;
        this.xp = 0;
        this.nivel = 1;
    }

    public Usuario(String nome, int xp, int nivel, Map<Curso, Integer> progressoCursos) {
        this.nome = nome;
        this.xp = xp;
        this.nivel = nivel;
        this.progressoCursos = progressoCursos;
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

    public Map<Curso, Integer> getProgressoCursos() {
        return progressoCursos;
    }

    public void setProgressoCursos(Map<Curso, Integer> progressoCursos) {
        this.progressoCursos = progressoCursos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return getXp() == usuario.getXp() && getNivel() == usuario.getNivel() && Objects.equals(getNome(), usuario.getNome()) && Objects.equals(getProgressoCursos(), usuario.getProgressoCursos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getXp(), getNivel(), getProgressoCursos());
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", xp=" + xp +
                ", nivel=" + nivel +
                ", progressoCursos=" + progressoCursos +
                '}';
    }
}
