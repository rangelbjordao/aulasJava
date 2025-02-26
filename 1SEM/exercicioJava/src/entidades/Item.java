package entidades;

import java.util.Objects;

public class Item {
    private String nome;
    private String descricao;
    private double preco;

    public void informacoes() {
        System.out.println("nome: " + nome + ", descricao: " +  descricao + ", preço:" + preco);
        System.out.println("-------------------------------------");
    }

    public Item() {
    }

    public Item(String nome, String descricao, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Double.compare(getPreco(), item.getPreco()) == 0 && Objects.equals(getNome(), item.getNome()) && Objects.equals(getDescricao(), item.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getDescricao(), getPreco());
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
