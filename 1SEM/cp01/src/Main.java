import entidades.EpisodioPodcast;
import entidades.Midia;
import entidades.Musica;
import entidades.Playlist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var musica1 = new Musica("one", 180, "Metallica", "Black Album", "Metal");

        var ep1 = new EpisodioPodcast("OO com Java", 3600, "PodJava", "JavaMan", "Neeste episodio falamos osbre OO com Java");

        var playlist = new Playlist(new ArrayList<>(), "Meus favoritos");
        playlist.adicionarMidia(musica1);
        playlist.adicionarMidia(ep1);

        playlist.reproduzir();
    }
}