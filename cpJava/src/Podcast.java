import java.util.Objects;

public class Podcast extends Midia{
    private String nome;
    private String apresentador;
    private String descricao;

    public Podcast() {
    }

    public Podcast(String titulo, float duracao, String apresentador, String descricao, String nome) {
        super(titulo, duracao);
        this.apresentador = apresentador;
        this.descricao = descricao;
        this.nome = nome;
    }

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Podcast podcast = (Podcast) o;
        return Objects.equals(getNome(), podcast.getNome()) && Objects.equals(getApresentador(), podcast.getApresentador()) && Objects.equals(getDescricao(), podcast.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNome(), getApresentador(), getDescricao());
    }

    @Override
    public String toString() {
        return "Podcast{" +
                "apresentador='" + apresentador + '\'' +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", duracao=" + duracao +
                ", titulo='" + titulo + '\'' +
                "} " + super.toString();
    }
}
