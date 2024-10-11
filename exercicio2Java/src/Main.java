import entidades.EpisodioPodcast;
import entidades.Midia;
import entidades.Musica;
import entidades.Playlist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var musica1 = new Musica("one", 180, "Metallica", "Black Album", "Metal");

        var ep1 = new EpisodioPodcast("OO com Java", 3600, "PodJava", "JavaMan", "Neste episodio falamos sobre OO com Java");

        var musica2 = new Musica("Enter Sandman", 180, "Metallica", "Black Album", "Metal");

        var musica3 = new Musica("Forro do xenhenhem", 180, "Metallica", "Black Album", "Metal");

        var ep2 = new EpisodioPodcast("OO com Python", 3600, "PodPython", "PythonMan", "Neste episodio falamos sobre Python");


        var playlist = new Playlist(new ArrayList<>(), "Meus favoritos");

        playlist.adicionarMidia(musica1);
        playlist.adicionarMidia(ep1);
        playlist.adicionarMidia(musica2);
        playlist.adicionarMidia(musica3);
        playlist.adicionarMidia(ep2);

        var playlistFiltrada = playlist.getMidiasAgrupadasPorTipo();
        playlistFiltrada.forEach((tipo, midias) -> {
            System.out.println("Tipo " + tipo);
            midias.forEach(midia -> {
                System.out.println(midia.getTitulo());
            });
        });
    }
}