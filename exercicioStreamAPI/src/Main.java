import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var numeros = new int[]{1, 2, 3, 4, 5, 6};
        var somanumerosParesAoQuadrado = Arrays
                .stream(numeros)
                .filter(numero -> numero % 2 == 0)
                .map(numero -> numero * numero);

        System.out.println(somanumerosParesAoQuadrado);

        var palavras = new String[]{"apple", "banana", "pear", "grapefruit", "kiwi"};
        var palavrasMaiusculas = Arrays
                .stream(palavras)
                .filter(palavra -> palavra.length() > 5)
                .map(String::toUpperCase);
        palavrasMaiusculas.forEach(System.out::println);

        var inteiros = new int[]{1, 4, 7, 9, 15, 6};
        var maiorMutiploDe3OrElseMinus1 = Arrays
                .stream(inteiros)
                .filter(inteiro -> inteiro % 3 == 0)
                .max()
                .orElse(-1);

        System.out.println(maiorMutiploDe3OrElseMinus1);

        var palavras2 = new String[]{"apple", "banana", "cherry", "date", };
        var c = "a";

    }
}