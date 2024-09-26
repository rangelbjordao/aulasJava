package entidades;

import java.util.List;
import java.util.Objects;

public class Playlist {
    // Atributos
    private String nome;
    private List<Midia> midias;

    // Metodos
    public void adicionarMidia(Midia midia) {
        midias.add(midia);
    }

    public void removerMidia(Midia midia) {
        midias.remove(midia);
    }

    public void reproduzir() {
        System.out.println("Reproduzir playlist: " + this.nome);
        for (var midia : midias)
            midia.reproduzir();
        System.out.println("------------------");
    }

    public Playlist() {
    }

    public Playlist(List<Midia> midias, String nome) {
        this.midias = midias;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMidias(List<Midia> midias) {
        this.midias = midias;
    }

    public List<Midia> getMidias() {
        return midias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Playlist playlist = (Playlist) o;
        return Objects.equals(getNome(), playlist.getNome()) && Objects.equals(getMidias(), playlist.getMidias());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getMidias());
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "nome='" + nome + '\'' +
                ", midias=" + midias +
                '}';
    }
}