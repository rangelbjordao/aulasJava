package entidades;

import java.util.Objects;

public class Bebida extends Item {
    private String temperaturaBebida;

    @Override
    public void informacoes() {
        System.out.println("nome: " + getNome() + ", descricao: " +  getDescricao() + ", preço: " + getPreco() + ", Temperatura: " + temperaturaBebida);
        System.out.println("-------------------------------------");
    }

    public Bebida() {
    }

    public Bebida(String nome, String descricao, double preco, String temperaturaBebida) {
        super(nome, descricao, preco);
        this.temperaturaBebida = temperaturaBebida;
    }

    public String getTemperaturaBebida() {
        return temperaturaBebida;
    }

    public void setTemperaturaBebida(String temperaturaBebida) {
        this.temperaturaBebida = temperaturaBebida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bebida bebida = (Bebida) o;
        return Objects.equals(getTemperaturaBebida(), bebida.getTemperaturaBebida());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTemperaturaBebida());
    }

    @Override
    public String toString() {
        return "Bebida{" +
                "temperaturaArmazenamento='" + temperaturaBebida + '\'' +
                "} " + super.toString();
    }
}
