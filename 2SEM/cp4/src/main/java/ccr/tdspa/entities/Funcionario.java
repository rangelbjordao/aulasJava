package ccr.tdspa.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Funcionario {
    private static final String SENHA_ADMIN = "CCR2025";
    private int id;
    private boolean deleted;
    private String nome;
    private String cargo;
}
