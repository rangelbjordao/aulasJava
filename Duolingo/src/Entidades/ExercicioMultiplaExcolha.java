package Entidades;

import java.util.ArrayList;
import java.util.List;

public class ExercicioMultiplaExcolha extends Exercicio {
    private List<String> opcoes = new ArrayList<>();

    public ExercicioMultiplaExcolha(List<String> opcoes) {
        this.opcoes = opcoes;
    }

    public ExercicioMultiplaExcolha(String pergunta, String respostaCorreta, int dificuldade, List<String> opcoes) {
        super(pergunta, respostaCorreta, dificuldade);
        this.opcoes = opcoes;
    }

    //    @Override
//    public String getTipo(){
//        return "Exercicio de multipla escolha";
//    }


    public List<String> getOpcoes() {
        return opcoes;
    }

    public void setOpcoes(List<String> opcoes) {
        this.opcoes = opcoes;
    }
}
