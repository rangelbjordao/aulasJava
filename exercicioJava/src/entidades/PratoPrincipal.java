package entidades;

import java.util.Objects;

public class PratoPrincipal extends Item {
    private int tempoPreparo;

    @Override
    public void informacoes() {
        System.out.println("nome: " + getNome() + ", descricao: " +  getDescricao() + ", preço: " + getPreco() + ", Tempo de preparo: " + tempoPreparo + " minutos");
        System.out.println("-------------------------------------");
    }

    public PratoPrincipal() {
    }

    public PratoPrincipal(String nome, String descricao, double preco, int tempoPreparo) {
        super(nome, descricao, preco);
        this.tempoPreparo = tempoPreparo;
    }

    public int getTempoPreparo() {
        return tempoPreparo;
    }

    public void setTempoPreparo(int tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PratoPrincipal that = (PratoPrincipal) o;
        return getTempoPreparo() == that.getTempoPreparo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTempoPreparo());
    }

    @Override
    public String toString() {
        return "PratoPrincipal{" +
                "tempoPreparacao=" + tempoPreparo +
                "} " + super.toString();
    }
}