package Entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Objects;

public class Mensagem {
    private String autor;
    private String conteudo;
    private LocalDateTime data;

    public Mensagem() {
    }

    public Mensagem(String autor, String conteudo, LocalDateTime data) {
        this.autor = autor;
        this.conteudo = conteudo;
        this.data = data;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mensagem mensagem = (Mensagem) o;
        return Objects.equals(getAutor(), mensagem.getAutor()) && Objects.equals(getConteudo(), mensagem.getConteudo()) && Objects.equals(getData(), mensagem.getData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAutor(), getConteudo(), getData());
    }

    @Override
    public String toString() {
        return "Mensagem{" +
                "autor='" + autor + '\'' +
                ", conteudo='" + conteudo + '\'' +
                ", data=" + data +
                '}';
    }
}