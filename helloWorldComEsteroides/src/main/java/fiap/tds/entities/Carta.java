package fiap.tds.entities;

import fiap.tds.annotations.DataField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // cria getters e setters, equals, hashcode e toString
@NoArgsConstructor // cria construtor vazio
@AllArgsConstructor // cria contrutor completo
public class Carta {
    @DataField(prompt = "ID da carta")
    private int id;

    @DataField(prompt = "Nome da carta")
    private String nome;

    @DataField(prompt = "Texto da carta")
    private String texto;

    @DataField(prompt = "Artista da carta")
    private String artista;

    @DataField(prompt = "Raridade da carta")
    private String raridade;
}