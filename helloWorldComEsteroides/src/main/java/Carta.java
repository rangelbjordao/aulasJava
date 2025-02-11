import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Carta {
    @DataField(prompt = "Nome da carta")
    private String nome;

    @DataField(prompt = "Texto da carta")
    private String texto;

    @DataField(prompt = "Artista da carta")
    private String artista;

}