import entidades.Bebida;
import entidades.Pedido;
import entidades.PratoPrincipal;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var pratoPrincipal1 = new PratoPrincipal("Pizza", "Pizza de mussarela", 40.00, 30);
        var bebida1 = new Bebida("guarana", "refrigerante de guarana lata", 4.5, "gelada");

        pratoPrincipal1.informacoes();
        bebida1.informacoes();

        var pedido1 = new Pedido(new ArrayList<>(), "em preparacao");
        pedido1.adicionarItem(pratoPrincipal1);
        pedido1.adicionarItem(pratoPrincipal1);
        pedido1.adicionarItem(bebida1);

        pedido1.informacoes();

        pedido1.atualizarStatus(pedido1.getStatus());
        pedido1.informacoes();

        pedido1.atualizarStatus(pedido1.getStatus());
        pedido1.informacoes();

        pedido1.removerItem(pratoPrincipal1);
        pedido1.removerItem(bebida1);
        pedido1.informacoes();
    }
}