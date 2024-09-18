import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Arrays ou vetores
        var nomes = new String[] {"Joao", "Maria", "Jose"};
        var numeros = new int[] {1, 2, 3, 4, 5, 6, 7, 8};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        // para cada nome dentro do vetor de nomes
        for (var nome : nomes) {
            System.out.println(nome);
        }

        // while
        var contador = 0;
        while (contador < nomes.length) {
            System.out.println(nomes[contador]);
            contador++;
        }
    }

    public static void variaveis() {

        System.out.println("Sistema ininciando...");

        var scan = new Scanner(System.in);

        System.out.println("Digite o numero 1: ");
        var numero1 = scan.nextBigDecimal();
        scan.nextLine();

        System.out.println("Digite o numero 2: ");
        var numero2 = scan.nextBigDecimal();
        scan.nextLine();

        System.out.println(numero1.add(numero2));

        String nome = "FIAP";
        System.out.println(nome);

        int numero = 10;
        System.out.println(numero + 10);

        double valor = 10.5;
        System.out.println(numero + 10.5);

        long valorGrande = 1000000000000000000L;
        short valorPequeno = 10;

        char letra = 'A';
        boolean condiçao = true;

        var temp = 30.5;
        System.out.println("A temp e de: " + temp + " graus");

        var numeroTexto = "10";
        var numeroonvetivo = Integer.parseInt(numeroTexto);

        int idade;

        idade = 10;
        idade = 20;
        idade = 30;

        var idade2 = 10;

        System.out.println("Sistema finalizando...");

    }

    public static void operadoresECondicionais() {

        var calculo = 1 + 2 - (3 * 2) / 5.0;
        System.out.println(calculo);
        calculo++;
        System.out.println(calculo);
        calculo--;
        System.out.println(calculo);

        var scanner = new Scanner(System.in);

        System.out.println("Digite a idade: ");
        var idade = scanner.nextInt();
        scanner.nextLine();

        if (idade >= 18 && idade <= 200) {
            System.out.println("A pessoa é maior de idade");
        } else if (idade > 200) {
            System.out.println("a pessoa e um vampiro");
        } else {
            System.out.println("A pessoa é menor de idade");
        }

        var notaDDD = 8;
        var notaCPT = 3;
        var notaBD = 10;

        // operador ternario
        // funcao(<condicao>) ? <valor se verdadeiro> : <valor se falso>
        // na matematica: f(x) = x > 0 ? x : -x
        System.out.println(
                notaDDD < 6 || notaCPT < 6 || notaBD < 6 ?
                        "Reprovado em pelo menos uma disciplina, " + "nao ira se formar no tempo minimo" :
                        "Aprovado em todas as disciplinas");

        System.out.println("Digite o numero:");
        var numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println(
                numero % 2 == 0 ?
                        "O numero é par" :
                        "O numero é impar"
        );
    }
}