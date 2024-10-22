package Entidades;

import java.util.Objects;

public class Exercicio {
    private String tipo;
    private String pergunta;
    private String respostaCorreta;

    public Exercicio() {
    }

    public Exercicio(String tipo, String pergunta, String respostaCorreta) {
        this.tipo = tipo;
        this.pergunta = pergunta;
        this.respostaCorreta = respostaCorreta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getRespostaCorreta() {
        return respostaCorreta;
    }

    public void setRespostaCorreta(String respostaCorreta) {
        this.respostaCorreta = respostaCorreta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exercicio exercicio = (Exercicio) o;
        return Objects.equals(getTipo(), exercicio.getTipo()) && Objects.equals(getPergunta(), exercicio.getPergunta()) && Objects.equals(getRespostaCorreta(), exercicio.getRespostaCorreta());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTipo(), getPergunta(), getRespostaCorreta());
    }

    @Override
    public String toString() {
        return "Exercicio{" +
                "tipo='" + tipo + '\'' +
                ", pergunta='" + pergunta + '\'' +
                ", respostaCorreta='" + respostaCorreta + '\'' +
                '}';
    }
}
