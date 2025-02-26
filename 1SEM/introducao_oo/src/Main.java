public class Main {
    public static void main(String[] args) {

        var produto1 = new Produto("Cola-Cola", 5.0, "Refrigerante de cola", 10);

        var produto2 = new Produto("Guarana", 4.0, "Refrigerante de guarana", 5);

        var produto3 = new Produto("Fanta Kiw", 0, null, 0);
        produto3.setNome("Fanta Kiwi");
        produto3.setDescricao("Refrigerante de Kiwi");

        System.out.println(produto3.getNome());

        produto1.AdicionarEstoque(-5);
        System.out.println(produto1);

        var produtoFisico1 = new ProdutoFisico();
        produtoFisico1.setNome("Elden ring - Midia Fisica - PS4");
        produtoFisico1.setPreco(200.0);
        produtoFisico1.setDescricao("Midia fisica do jogo Elden Ring para PS4");

        produtoFisico1.setDimensao(new Dimensao(20, 20, 20));
        produtoFisico1.getCaracteristicas().add(new Caracteristica("Platafoma", "PS4"));
        produtoFisico1.getCaracteristicas().add(new Caracteristica("Disibuidora", "From Software"));

        System.out.println(produtoFisico1);
    }
}