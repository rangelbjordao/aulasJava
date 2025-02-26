package Entidades;

public class ExercicioTraducao extends Exercicio{

    public ExercicioTraducao(String pergunta, String respostaCorreta, int dificuldade) {
        super(pergunta, respostaCorreta, dificuldade);
    }

    @Override
    public String getTipo(){
        return "Tradução";
    }
}
