package fiap.tds.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Colecao extends _BaseEntity{
    private String nome;
    private String codigo;
    private String dataLancamento;
}
