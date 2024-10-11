package entidades;

import java.util.*;
import java.util.stream.Collectors;

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
        midias.forEach(Midia::reproduzir);
        System.out.println("------------------");
    }

    public int getDuracaoTotal() {
        return midias.stream()
                .mapToInt(Midia::getDuracao)
                .sum();
    }

    public List<Midia> getMidiasPorDuracao(int duracao) {
        return midias.stream()
                .filter(midia -> midia.getDuracao() <= duracao)
                .toList();
    }

    public List<Midia> getMidiasPorTipo(Class<? extends Midia> tipo) {
        return midias.stream()
                .filter(midia -> midia.getClass().equals(tipo))
                .toList();
    }

    public List<Midia> getMidiaPorTipo(String sigla) {
        var midiasFiltradas = new ArrayList<Midia>();
        if (sigla.equals("M")) {
            for (var midia : midias)
                if (midia instanceof Musica)
                    midiasFiltradas.add(midia);
        } else {
            for (var midia : midias)
                if (midia instanceof EpisodioPodcast)
                    midiasFiltradas.add(midia);
        }
        return midiasFiltradas;
    }

    public List<Midia> getMidiasOrdenadasPorDuracao() {
        return midias.stream()
                .sorted(Comparator.comparingInt(Midia::getDuracao))
                .toList();
    }

    public List<Midia> getMidiasOrdenadasPorTitulo() {
        return midias.stream()
                .sorted(Comparator.comparing(Midia::getTitulo))
                .toList();
    }

    public Midia getMidiasMaisLongas() {
        return midias.stream()
                .max(Comparator.comparingInt(Midia::getDuracao))
                .orElse(null);
    }

    public List<Midia> getMusicasPorGenero(String genero) {
        return midias.stream()
                .filter(midia -> midia instanceof Musica)
                .filter(midia -> ((Musica) midia).getGenero().equals(genero))
                .toList();
    }

    public Map<String, List<Midia>> getMidiasAgrupadasPorTipo() {
        return midias.stream()
                .collect(Collectors.groupingBy(midia -> midia.getClass().getSimpleName()));
    }

    public Map<String, List<Midia>> getMusicasAgrupadasPorGenero() {
        return midias.stream()
                .filter(midia -> midia instanceof Musica)
                .collect(Collectors.groupingBy(midia -> ((Musica) midia).getGenero()));
    }

    public int numeroDeMidias() {
        return midias.size();
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