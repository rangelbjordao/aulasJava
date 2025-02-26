package fiap.tds.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Carta extends _BaseEntity{

    private String nome;

    private String texto;

    private String artista;

    private String raridade;
}