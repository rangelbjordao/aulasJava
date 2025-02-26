import java.util.Objects;

public class Musica extends Midia{
    private String artista;
    private String album;
    private String genero;



    public Musica() {
    }

    public Musica(String titulo, float duracao, String album, String artista, String genero) {
        super(titulo, duracao);
        this.album = album;
        this.artista = artista;
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Musica musica = (Musica) o;
        return Objects.equals(getArtista(), musica.getArtista()) && Objects.equals(getAlbum(), musica.getAlbum()) && Objects.equals(getGenero(), musica.getGenero());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getArtista(), getAlbum(), getGenero());
    }

    @Override
    public String toString() {
        return "Musica{" +
                "album='" + album + '\'' +
                ", artista='" + artista + '\'' +
                ", genero='" + genero + '\'' +
                ", duracao=" + duracao +
                ", titulo='" + titulo + '\'' +
                "} " + super.toString();
    }
}
