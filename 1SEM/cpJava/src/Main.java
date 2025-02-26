public class Main {
    public static void main(String[] args) {
        Musica musica1 = new Musica("Still dre", 4.1F, "2001", "Dr. Dre", "Rap");
        System.out.println(musica1);

        Podcast podcast1 = new Podcast("Debate SP", 86.3F, "Igor 3K", "Debate dos prefeitos de São Paulo", "Flow");
        System.out.println(podcast1);

        podcast1.reproduzirMidia();
        musica1.reproduzirMidia();
    }
    }
