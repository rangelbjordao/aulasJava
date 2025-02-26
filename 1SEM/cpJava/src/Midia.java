import java.util.Objects;

public class Midia {
    protected String titulo;
    protected float duracao;

    public Midia() {
    }

    public Midia(String titulo, float duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public float getDuracao() {
        return duracao;
    }

    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Midia midia = (Midia) o;
        return Float.compare(getDuracao(), midia.getDuracao()) == 0 && Objects.equals(getTitulo(), midia.getTitulo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitulo(), getDuracao());
    }

    @Override
    public String toString() {
        return "Midia{" +
                "duracao=" + duracao +
                ", titulo='" + titulo + '\'' +
                '}';
    }

    public void reproduzirMidia(){
        System.out.println("reproduzindo: " + getTitulo());
}
}
