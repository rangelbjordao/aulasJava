package entidades;

import java.util.Objects;

public class Midia {
    // Atributos
    private String titulo;
    private int duracao;


    // Metodos
    public void reproduzir() {
        System.out.println("Reproduzir midia:" + this.titulo);
    }

    // Contrutor vazio
    public Midia() {
    }

    // Construtor completo
    public Midia(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    // equals e hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Midia midia = (Midia) o;
        return getDuracao() == midia.getDuracao() && Objects.equals(getTitulo(), midia.getTitulo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitulo(), getDuracao());
    }

    //toString
    @Override
    public String toString() {
        return "Midia{" +
                "titulo='" + titulo + '\'' +
                ", duracao=" + duracao +
                '}';
    }
}