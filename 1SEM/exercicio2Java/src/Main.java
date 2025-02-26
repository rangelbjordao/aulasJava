import entidades.EpisodioPodcast;
import entidades.Midia;
import entidades.Musica;
import entidades.Playlist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // crio a variavel de novasMidias que vao ser adicionadas
        var novasMidias = new ArrayList<Midia>();

        // adiciono as midias nessa lista que é uma variavel
        novasMidias.add(new Musica("One", 180,
                "Metallica", "Black Album", "Metal"));
        novasMidias.add(new EpisodioPodcast("OO com Java", 3600,
                "PodJava", "JavaMan",
                "Neste episódio falamos sobre OO com Java"));
        novasMidias.add(new Musica("Enter Sandman", 360,
                "Metallica", "Black Album", "Metal"));
        novasMidias.add(new Musica("Forró do Xenhenhem", 420,
                "Elba Ramalho", "Forró", "Forró"));
        novasMidias.add(new EpisodioPodcast("OO com Python", 3600, "PodPython",
                "PythonMan", "Neste episódio falamos sobre OO com Python"));

        var novaPlaylist = new Playlist("Meus favoritos",
                new ArrayList<>());

        // adiciono as midias na playlist em um loop
        for(var midia : novasMidias){
            novaPlaylist.adicionarMidia(midia);
        }

        var playlistFiltradaPorGenero = novaPlaylist.getMusicasAgrupadasPorGenero();
        playlistFiltradaPorGenero.forEach((genero, midias) -> {
            System.out.println("Genero: " + genero);
            midias.forEach(midia -> {
                System.out.println(midia.getTitulo());
            });
        });


    }
}