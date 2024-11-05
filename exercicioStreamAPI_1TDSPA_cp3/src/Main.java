import java.util.Arrays;
import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {
        // ========= Exercício 1: Soma dos Números Pares =========
        // Nível: Fácil
        try {
            List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
            int result1 = sumOfEvenNumbers(list1);
            assert result1 == 6 : "Exercício 1 - Caso de Teste 1 Falhou";

            List<Integer> list2 = Arrays.asList(2, 4, 6, 8);
            int result2 = sumOfEvenNumbers(list2);
            assert result2 == 20 : "Exercício 1 - Caso de Teste 2 Falhou";

            List<Integer> list3 = Arrays.asList(1, 3, 5, 7);
            int result3 = sumOfEvenNumbers(list3);
            assert result3 == 0 : "Exercício 1 - Caso de Teste 3 Falhou";


            System.out.println("Exercício 1 passou em todos os casos de teste!");
        } catch (AssertionError e) {
            System.out.println("Exercício 1 não passou em todos os casos de teste!");
        }

        // ========= Exercício 2: Strings Maiúsculas com Mais de 3 Caracteres =========
        // Nível: Fácil
        try {
            List<String> input1 = Arrays.asList("a", "ab", "abc", "abcd");
            List<String> expected1 = Arrays.asList("ABCD");
            List<String> output1 = uppercaseLongStrings(input1);
            assert output1.equals(expected1) : "Exercício 2 - Caso de Teste 1 Falhou";

            List<String> input2 = Arrays.asList("apple", "bat", "cat", "dog");
            List<String> expected2 = Arrays.asList("APPLE");
            List<String> output2 = uppercaseLongStrings(input2);
            assert output2.equals(expected2) : "Exercício 2 - Caso de Teste 2 Falhou";

            List<String> input3 = Arrays.asList("hi", "hello", "hey", "goodbye");
            List<String> expected3 = Arrays.asList("HELLO", "GOODBYE");
            List<String> output3 = uppercaseLongStrings(input3);
            assert output3.equals(expected3) : "Exercício 2 - Caso de Teste 3 Falhou";



            System.out.println("Exercício 2 passou em todos os casos de teste!");
        } catch (AssertionError e) {
            System.out.println("Exercício 2 não passou em todos os casos de teste!");
        }

        // ========= Exercício 3: Contagem de Números Positivos =========
        // Nível: Fácil
        try {
            List<Integer> nums1 = Arrays.asList(1, -2, 3, -4, 5);
            long count1 = countPositiveNumbers(nums1);
            assert count1 == 3 : "Exercício 3 - Caso de Teste 1 Falhou";

            List<Integer> nums2 = Arrays.asList(-1, -2, -3);
            long count2 = countPositiveNumbers(nums2);
            assert count2 == 0 : "Exercício 3 - Caso de Teste 2 Falhou";

            List<Integer> nums3 = Arrays.asList(0, 1, 2, 3);
            long count3 = countPositiveNumbers(nums3);
            assert count3 == 3 : "Exercício 3 - Caso de Teste 3 Falhou";

            System.out.println("Exercício 3 passou em todos os casos de teste!");
        } catch (AssertionError e) {
            System.out.println("Exercício 3 não passou em todos os casos de teste!");
        }

        // ========= Exercício 4: Primeiro String Iniciando com um Caractere =========
        // Nível: Médio
        try {
            List<String> words1 = Arrays.asList("apple", "banana", "avocado");
            String first1 = findFirstStartingWith(words1, 'a');
            assert "apple".equals(first1) : "Exercício 4 - Caso de Teste 1 Falhou";

            List<String> words2 = Arrays.asList("carrot", "berry", "cherry");
            String first2 = findFirstStartingWith(words2, 'b');
            assert "berry".equals(first2) : "Exercício 4 - Caso de Teste 2 Falhou";

            List<String> words3 = Arrays.asList("dog", "elephant", "fox");
            String first3 = findFirstStartingWith(words3, 'z');
            assert first3 == null : "Exercício 4 - Caso de Teste 3 Falhou";

            System.out.println("Exercício 4 passou em todos os casos de teste!");
        } catch (AssertionError e) {
            System.out.println("Exercício 4 não passou em todos os casos de teste!");
        }

        // ========= Exercício 5: Soma dos Quadrados dos Números Ímpares =========
        // Nível: Médio
        try {
            List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
            int sumSquares1 = sumOfSquaresOfOddNumbers(numbers1);
            assert sumSquares1 == 35 : "Exercício 5 - Caso de Teste 1 Falhou";

            List<Integer> numbers2 = Arrays.asList(2, 4, 6);
            int sumSquares2 = sumOfSquaresOfOddNumbers(numbers2);
            assert sumSquares2 == 0 : "Exercício 5 - Caso de Teste 2 Falhou";

            List<Integer> numbers3 = Arrays.asList(1, 3, 5);
            int sumSquares3 = sumOfSquaresOfOddNumbers(numbers3);
            assert sumSquares3 == 35 : "Exercício 5 - Caso de Teste 3 Falhou";

            System.out.println("Exercício 5 passou em todos os casos de teste!");
        } catch (AssertionError e) {
            System.out.println("Exercício 5 não passou em todos os casos de teste!");
        }

        // ========= Exercício 6: Verificar se Todas as Strings são Maiúsculas =========
        // Nível: Médio
        try {
            List<String> strs1 = Arrays.asList("HELLO", "WORLD");
            boolean allUpper1 = areAllStringsUppercase(strs1);
            assert allUpper1 : "Exercício 6 - Caso de Teste 1 Falhou";

            List<String> strs2 = Arrays.asList("Hello", "WORLD");
            boolean allUpper2 = areAllStringsUppercase(strs2);
            assert !allUpper2 : "Exercício 6 - Caso de Teste 2 Falhou";

            List<String> strs3 = new ArrayList<>();
            boolean allUpper3 = areAllStringsUppercase(strs3);
            assert allUpper3 : "Exercício 6 - Caso de Teste 3 Falhou";

            System.out.println("Exercício 6 passou em todos os casos de teste!");
        } catch (AssertionError e) {
            System.out.println("Exercício 6 não passou em todos os casos de teste!");
        }

        // ========= Exercício 7: Concatenar Strings com Vírgula =========
        // Nível: Médio
        try {
            List<String> strList1 = Arrays.asList("a", "b", "c");
            String concat1 = concatenateWithComma(strList1);
            assert concat1.equals("a,b,c") : "Exercício 7 - Caso de Teste 1 Falhou";

            List<String> strList2 = Arrays.asList("hello", "world");
            String concat2 = concatenateWithComma(strList2);
            assert concat2.equals("hello,world") : "Exercício 7 - Caso de Teste 2 Falhou";

            List<String> strList3 = new ArrayList<>();
            String concat3 = concatenateWithComma(strList3);
            assert concat3.equals("") : "Exercício 7 - Caso de Teste 3 Falhou";

            System.out.println("Exercício 7 passou em todos os casos de teste!");
        } catch (AssertionError e) {
            System.out.println("Exercício 7 não passou em todos os casos de teste!");
        }

        // ========= Exercício 8: Filtrar e Ordenar Inteiros =========
        // Nível: Médio
        try {
            List<Integer> numsFilter1 = Arrays.asList(3, -1, 2, -5, 4);
            List<Integer> expectedFilter1 = Arrays.asList(2, 3, 4);
            List<Integer> outputFilter1 = filterAndSortIntegers(numsFilter1);
            assert outputFilter1.equals(expectedFilter1) : "Exercício 8 - Caso de Teste 1 Falhou";

            List<Integer> numsFilter2 = Arrays.asList(-2, -3, -1);
            List<Integer> expectedFilter2 = Arrays.asList();
            List<Integer> outputFilter2 = filterAndSortIntegers(numsFilter2);
            assert outputFilter2.equals(expectedFilter2) : "Exercício 8 - Caso de Teste 2 Falhou";

            List<Integer> numsFilter3 = Arrays.asList(5, 1, 3);
            List<Integer> expectedFilter3 = Arrays.asList(1, 3, 5);
            List<Integer> outputFilter3 = filterAndSortIntegers(numsFilter3);
            assert outputFilter3.equals(expectedFilter3) : "Exercício 8 - Caso de Teste 3 Falhou";

            System.out.println("Exercício 8 passou em todos os casos de teste!");
        } catch (AssertionError e) {
            System.out.println("Exercício 8 não passou em todos os casos de teste!");
        }

        // ========= Exercício 9: Encontrar Comprimento Máximo das Strings =========
        // Nível: Médio
        try {
            List<String> wordsLen1 = Arrays.asList("apple", "banana", "cherry");
            int maxLength1 = findMaxLength(wordsLen1);
            assert maxLength1 == 6 : "Exercício 9 - Caso de Teste 1 Falhou";

            List<String> wordsLen2 = Arrays.asList("a", "ab", "abc");
            int maxLength2 = findMaxLength(wordsLen2);
            assert maxLength2 == 3 : "Exercício 9 - Caso de Teste 2 Falhou";

            List<String> wordsLen3 = new ArrayList<>();
            int maxLength3 = findMaxLength(wordsLen3);
            assert maxLength3 == 0 : "Exercício 9 - Caso de Teste 3 Falhou";

            System.out.println("Exercício 9 passou em todos os casos de teste!");
        } catch (AssertionError e) {
            System.out.println("Exercício 9 não passou em todos os casos de teste!");
        }

        // ========= Exercício 10: Agrupar Strings por Comprimento =========
        // Nível: Difícil
        try {
            List<String> listGroup1 = Arrays.asList("a", "bb", "ccc", "dd", "eee", "f");
            Map<Integer, List<String>> expectedMap1 = new HashMap<>();
            expectedMap1.put(1, Arrays.asList("a", "f"));
            expectedMap1.put(2, Arrays.asList("bb", "dd"));
            expectedMap1.put(3, Arrays.asList("ccc", "eee"));
            Map<Integer, List<String>> resultMap1 = groupStringsByLength(listGroup1);
            assert resultMap1.equals(expectedMap1) : "Exercício 10 - Caso de Teste 1 Falhou";

            List<String> listGroup2 = Arrays.asList("apple", "bat", "car", "dog", "egg", "fan");
            Map<Integer, List<String>> expectedMap2 = new HashMap<>();
            expectedMap2.put(5, Arrays.asList("apple"));
            expectedMap2.put(3, Arrays.asList("bat", "car", "dog", "egg", "fan"));
            Map<Integer, List<String>> resultMap2 = groupStringsByLength(listGroup2);
            assert resultMap2.equals(expectedMap2) : "Exercício 10 - Caso de Teste 2 Falhou";

            List<String> listGroup3 = new ArrayList<>();
            Map<Integer, List<String>> expectedMap3 = new HashMap<>();
            Map<Integer, List<String>> resultMap3 = groupStringsByLength(listGroup3);
            assert resultMap3.equals(expectedMap3) : "Exercício 10 - Caso de Teste 3 Falhou";

            System.out.println("Exercício 10 passou em todos os casos de teste!");
        } catch (AssertionError e) {
            System.out.println("Exercício 10 não passou em todos os casos de teste!");
        }

        // ========= Exercício 11: Encontrar o Segundo Maior Número =========
        // Nível: Difícil
        try {
            List<Integer> numsSecond1 = Arrays.asList(1, 3, 5, 7, 9);
            Integer secondHighest1 = findSecondHighest(numsSecond1);
            assert secondHighest1 == 7 : "Exercício 11 - Caso de Teste 1 Falhou";

            List<Integer> numsSecond2 = Arrays.asList(5, 5, 5);
            Integer secondHighest2 = findSecondHighest(numsSecond2);
            assert secondHighest2 == null : "Exercício 11 - Caso de Teste 2 Falhou";

            List<Integer> numsSecond3 = Arrays.asList(10);
            Integer secondHighest3 = findSecondHighest(numsSecond3);
            assert secondHighest3 == null : "Exercício 11 - Caso de Teste 3 Falhou";

            System.out.println("Exercício 11 passou em todos os casos de teste!");
        } catch (AssertionError e) {
            System.out.println("Exercício 11 não passou em todos os casos de teste!");
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

        // ========= Exercício 13: Particionar Números em Primos e Não-Primos =========
        // Nível: Difícil
        try {
            List<Integer> numsPrime1 = Arrays.asList(2, 3, 4, 5, 6);
            Map<Boolean, List<Integer>> expectedPrime1 = new HashMap<>();
            expectedPrime1.put(true, Arrays.asList(2, 3, 5));
            expectedPrime1.put(false, Arrays.asList(4, 6));
            Map<Boolean, List<Integer>> outputPrime1 = partitionPrimes(numsPrime1);
            assert outputPrime1.equals(expectedPrime1) : "Exercício 13 - Caso de Teste 1 Falhou";

            List<Integer> numsPrime2 = Arrays.asList(1, 2, 3);
            Map<Boolean, List<Integer>> expectedPrime2 = new HashMap<>();
            expectedPrime2.put(true, Arrays.asList(2, 3));
            expectedPrime2.put(false, Arrays.asList(1));
            Map<Boolean, List<Integer>> outputPrime2 = partitionPrimes(numsPrime2);
            assert outputPrime2.equals(expectedPrime2) : "Exercício 13 - Caso de Teste 2 Falhou";

            List<Integer> numsPrime3 = Arrays.asList(8, 9, 10);
            Map<Boolean, List<Integer>> expectedPrime3 = new HashMap<>();
            expectedPrime3.put(true, Arrays.asList());
            expectedPrime3.put(false, Arrays.asList(8, 9, 10));
            Map<Boolean, List<Integer>> outputPrime3 = partitionPrimes(numsPrime3);
            assert outputPrime3.equals(expectedPrime3) : "Exercício 13 - Caso de Teste 3 Falhou";

            System.out.println("Exercício 13 passou em todos os casos de teste!");
        } catch (AssertionError e) {
            System.out.println("Exercício 13 não passou em todos os casos de teste!");
        }

        // ========= Exercício 14: Calcular Média dos Quadrados dos Números =========
        // Nível: Difícil
        try {
            List<Integer> numsAvg1 = Arrays.asList(1, 2, 3);
            double avg1 = averageOfSquares(numsAvg1);
            assert Math.abs(avg1 - 4.6667) < 0.0001 : "Exercício 14 - Caso de Teste 1 Falhou";

            List<Integer> numsAvg2 = Arrays.asList(4, 5, 6);
            double avg2 = averageOfSquares(numsAvg2);
            assert Math.abs(avg2 - 25.66666667) < 0.0001 : "Exercício 14 - Caso de Teste 2 Falhou";

            List<Integer> numsAvg3 = new ArrayList<>();
            double avg3 = averageOfSquares(numsAvg3);
            assert avg3 == 0.0 : "Exercício 14 - Caso de Teste 3 Falhou";

            System.out.println("Exercício 14 passou em todos os casos de teste!");
        } catch (AssertionError e) {
            System.out.println("Exercício 14 não passou em todos os casos de teste!");
        }

        // ========= Exercício 15: Encontrar o Caractere Mais Frequente =========
        // Nível: Difícil
        try {
            String str1 = "aabbbcc";
            var mostFreqChar1 = findMostFrequentCharacter(str1);
            assert mostFreqChar1 == 'b' : "Exercício 15 - Caso de Teste 1 Falhou";

            String str2 = "abcd";
            var mostFreqChar2 = findMostFrequentCharacter(str2);
            assert mostFreqChar2 != '$' : "Exercício 15 - Caso de Teste 2 Falhou";

            String str3 = "";
            var mostFreqChar3 = findMostFrequentCharacter(str3);
            assert mostFreqChar3 == '$' : "Exercício 15 - Caso de Teste 3 Falhou";

            System.out.println("Exercício 15 passou em todos os casos de teste!");
        } catch (AssertionError e) {
            System.out.println("Exercício 15 não passou em todos os casos de teste!");
        }
    }

    // ========== Métodos a serem implementados ==========

    // Exercício 1
    public static int sumOfEvenNumbers(List<Integer> numbers) {

        int somaDosPares = numbers
                .stream()
                .filter(numero -> numero % 2 == 0)
                .mapToInt(numero -> numero)
                .sum();

        return somaDosPares;
    }

    // Exercício 2
    public static List<String> uppercaseLongStrings(List<String> strings) {
        List<String> maisDe3CaracteresMaiusculas = strings
                .stream()
                .filter(palavra -> palavra.length() > 3)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        return maisDe3CaracteresMaiusculas;
    }

    // Exercício 3
    public static long countPositiveNumbers(List<Integer> numbers) {
        long contagemNumerosPositivos = numbers
                .stream()
                .filter(numero -> numero > 0)
                .count();

        return contagemNumerosPositivos;
    }

    // Exercício 4
    public static String findFirstStartingWith(List<String> words, char c) {
        String primerioComecandoCom = words
            .stream()
                .filter(palavra -> palavra.startsWith(String.valueOf(c)))
                .findFirst()
                .orElse(null);

        return primerioComecandoCom;
    }

    // Exercício 5
    public static int sumOfSquaresOfOddNumbers(List<Integer> numbers) {
         int somaQuadradoImpares = numbers
                 .stream()
                 .filter(numero -> numero % 2 == 1)
                 .mapToInt(numero -> numero * numero)
                 .sum();
        return somaQuadradoImpares;
    }

    // Exercício 6
    public static boolean areAllStringsUppercase(List<String> strings) {
        boolean verificaTodasMaiusculas = strings
                .stream()
                .allMatch(p -> p.equals(p.toUpperCase()));
        return verificaTodasMaiusculas;
    }

    // Exercício 7
    public static String concatenateWithComma(List<String> strings) {
        String concatenaComVirgula = strings
                .stream()
                .map(Object::toString)
                .collect(Collectors.joining(","));
        return concatenaComVirgula;
    }

    // Exercício 8
    public static List<Integer> filterAndSortIntegers(List<Integer> numbers) {
        List<Integer> filtraOrdenaInteiros = numbers
                .stream()
                .filter(n -> n > 0)
                .sorted()
                .collect(Collectors.toList());

        return filtraOrdenaInteiros;
    }

    // Exercício 9
    public static int findMaxLength(List<String> strings) {
        int encontraComprimentoMax = strings
                .stream()
                .mapToInt(String::length)
                .max()
                .orElse(0);

        return encontraComprimentoMax;
    }

    // Exercício 10
    public static Map<Integer, List<String>> groupStringsByLength(List<String> strings) {
        // TODO: Implementar usando Stream API
        return new HashMap<Integer, List<String>>();
    }

    // Exercício 11
    public static Integer findSecondHighest(List<Integer> numbers) {
        // TODO: Implementar usando Stream API
        return 0;
    }

    // Exercício 12
    public static List<String> findStringsWithAllVowels(List<String> strings) {
        // TODO: Implementar usando Stream API
        return new ArrayList<>();
    }

    // Exercício 13
    public static Map<Boolean, List<Integer>> partitionPrimes(List<Integer> numbers) {
        // TODO: Implementar usando Stream API
        return new HashMap<Boolean, List<Integer>>();
    }

    // Exercício 14
    public static double averageOfSquares(List<Integer> numbers) {
        // TODO: Implementar usando Stream API
        return 0.0;
    }

    // Exercício 15
    public static char findMostFrequentCharacter(String str) {
        // TODO: Implementar usando Stream API
        return '$';
    }
}