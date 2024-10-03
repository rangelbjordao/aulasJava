import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        var numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
//
//        numeros.stream()
//                .filter(numero -> numero % 2 == 0)
//                .map(numero -> numero * numero)
//                .toList().forEach(System.out::println);

//        var nomes = new String[] {"Ana", "Leo", "Bruno", "Cesar", "Amanda", "Antonio"};
//
//        var nomesComInicialA = Arrays.stream(nomes)
//                .filter(nome -> nome.startsWith("A") && nome.length() >= 3) //Filtra os nomes que comecam com a letra A
//                .map(String::toUpperCase) //Transforma os nomes em letras maiusculas
//                .sorted() //Ordena os nomes
//                .toList(); //Converte o Stream em uma lista
//
//        nomesComInicialA.forEach(System.out::println);

//        var listas = new ArrayList<ArrayList<Integer>>();
//        listas.add(new ArrayList<>(Arrays.asList(1,2)));
//        listas.add(new ArrayList<>(Arrays.asList(3,4)));
//        listas.add(new ArrayList<>(Arrays.asList(5,6)));
//
//        listas.stream()
//                .flatMap(List::stream)
//                .forEach(System.out::println);

//        var precos = Arrays.asList(50.0, 5.5, 4.5);
//        var soma = precos.stream()
//                .reduce(0.0, Double::sum);
//        System.out.println(soma);

//        var palavras = Arrays.asList("java", "python", "javascript", "html");
//
//        if (palavras.stream().noneMatch(palavra -> palavra.startsWith("j")))
//            System.out.println("Nao existe nenhum elemento que comeca com a letra j");
//        else
//            System.out.println("Existe algum elemento que comecam com a letra 'j'");

//        var numerosAleatorios = new ArrayList<Integer>();
//        for (int i = 0; i < 1000000; i++) {
//            numerosAleatorios.add((int) (Math.random() * 1000));
//        }
//        numerosAleatorios
//                .parallelStream()
//                .map(numero -> numero * 2)
//                .forEach(System.out::println);
    }
}