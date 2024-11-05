import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Exercicio 1
        // solucao 1
        var numeros = new int[]{1, 2, 3, 4, 5, 6};
        int somanumerosParesAoQuadrado = Arrays
                .stream(numeros)
                .filter(numero -> numero % 2 == 0)
                .map(numero -> numero * numero)
                .sum();

        System.out.println(somanumerosParesAoQuadrado);

        // solucao 2
        List<Integer> numeros2 = Arrays.asList(1, 2, 3, 4, 5, 6);
        int somanumerosParesAoQuadrado2 = numeros2
                .stream()
                .filter(numero -> numero % 2 == 0)
                .mapToInt(numero -> numero * numero)
                .sum();

        System.out.println(somanumerosParesAoQuadrado2);

        //Exercicio 2
        List<String> palavras = Arrays.asList("apple", "banana", "pear", "grapefruit", "kiwi");
        // var palavras = new String[]{"apple", "banana", "pear", "grapefruit", "kiwi"};
        var palavrasMaiusculas = palavras
                .stream()
                .filter(palavra -> palavra.length() > 5)
                .map(String::toUpperCase);
        palavrasMaiusculas.forEach(System.out::println);

        // Exercicio 3
        List<Integer> inteiros = Arrays.asList(1, 4, 7, 9, 15, 6);
        // var inteiros = new int[]{1, 4, 7, 9, 15, 6};
        var maiorMutiploDe3OrElseMinus1 = inteiros
                .stream()
                .filter(inteiro -> inteiro % 3 == 0)
                .max(Integer::compareTo)
                .orElse(-1);

        System.out.println(maiorMutiploDe3OrElseMinus1);

        // Exercicio 4
        List<String> palavras2 = Arrays.asList("apple", "banana", "cherry", "date");
        // var palavras2 = new String[]{"apple", "banana", "cherry", "date"};
        var c = "a";

        long totalPalavrasLetraEspecificar = palavras2
                .stream()
                .filter(palavra -> palavra.toUpperCase().contains(c.toUpperCase()))
                .count();

        System.out.println(totalPalavrasLetraEspecificar);

        // Exercicio 5
        // solucao 1
        List<Integer> inteiros2 = Arrays.asList(5, 10, 15, 20, 25, 30);

        List<Integer> numerosEmIntervalo = inteiros2.stream()
                .filter(inteiro -> inteiro >= 10 && inteiro <= 20)
                .collect(Collectors.toList());

        System.out.println(numerosEmIntervalo);


        // solucao 2
        var inteiros3 = new int[]{5, 10, 15, 20, 25, 30};

        List<Integer> numerosEmIntervalo1 = Arrays
                .stream(inteiros3)
                .filter(inteiro -> inteiro >= 10 && inteiro <= 20)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(numerosEmIntervalo1);
    }
}



// ========= Exercício 12: Encontrar Strings que Contêm Todas as Vogais =========
// Nível: Difícil
        try {
List<String> wordsVowels1 = Arrays.asList("education", "automobile", "queue", "aeiou");
List<String> expectedVowels1 = Arrays.asList("education", "aeiou");
List<String> outputVowels1 = findStringsWithAllVowels(wordsVowels1);
            assert outputVowels1.equals(expectedVowels1) : "Exercício 12 - Caso de Teste 1 Falhou";

List<String> wordsVowels2 = Arrays.asList("hello", "world");
List<String> expectedVowels2 = Arrays.asList();
List<String> outputVowels2 = findStringsWithAllVowels(wordsVowels2);
            assert outputVowels2.equals(expectedVowels2) : "Exercício 12 - Caso de Teste 2 Falhou";

List<String> wordsVowels3 = Arrays.asList("sequoia", "facetious");
List<String> expectedVowels3 = Arrays.asList("sequoia","facetious");
List<String> outputVowels3 = findStringsWithAllVowels(wordsVowels3);
            assert outputVowels3.equals(expectedVowels3) : "Exercício 12 - Caso de Teste 3 Falhou";

        System.out.println("Exercício 12 passou em todos os casos de teste!");
        } catch (AssertionError e) {
        System.out.println("Exercício 12 não passou em todos os casos de teste!");
        }