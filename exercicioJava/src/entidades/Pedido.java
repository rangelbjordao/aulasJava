package entidades;

import java.util.List;
import java.util.Objects;

public class Pedido {
    private List<Item> items;
    private String status;
    private static double total;

    public void adicionarItem(Item item) {
        if (items.contains(item)) {
            System.out.println("Item: " + item.getDescricao() + ", ja esta no pedido.");
            System.out.println("---------------------------------");
        } else {
            items.add(item);
            System.out.println("Item: " + item.getDescricao() + ", adicionado ao pedido.");
            System.out.println("---------------------------------");
            status = "em preparacao";
        }
    }

    public void removerItem(Item item) {
        items.remove(item);
        total -= item.getPreco();
    }

    public double precoTotal() {
        for (var item : items) {
            total = total + item.getPreco();
        }
        return total;
    }

    public void atualizarStatus(String novoStatus) {
        if (status.equals("em preparacao")) {
            status = "em entrega";
        } else if (status.equals("em entrega")) {
            status = "entregue";
        } else {
            status = "em preparacao";
        }
    }

    public void informacoes() {
        total = 0;
        System.out.println("Status do pedido: " + status);
        for (var item : items) {
            item.informacoes();
        }
        total = precoTotal();
        System.out.println("preço total: " + total);
        System.out.println("---------------------------------");
    }

    public Pedido() {
    }

    public Pedido(List<Item> items, String status) {
        this.items = items;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido = (Pedido) o;
        return Objects.equals(getStatus(), pedido.getStatus()) && Objects.equals(getItems(), pedido.getItems());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStatus(), getItems());
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "status='" + status + '\'' +
                ", items=" + items +
                '}';
    }
}
