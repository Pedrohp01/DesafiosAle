import java.util.*;
import java.util.stream.Collectors;

public class ListaProduto {

    public static void main(String[] args) {
        // Criando a lista de produtos
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Notebook", "Eletrônicos", 3499.99));
        produtos.add(new Produto("Camiseta", "Roupas", 49.90));
        produtos.add(new Produto("Cadeira Gamer", "Móveis", 899.00));
        produtos.add(new Produto("Fone de Ouvido", "Eletrônicos", 199.90));
        produtos.add(new Produto("Livro de Java", "Livros", 79.50));
        List<Produto> eletronicos = produtos.stream()
        .filter(p -> p.getCategoria().equalsIgnoreCase("Eletrônicos"))
        .collect(Collectors.toList());


 eletronicos.forEach(Produto::exibirInfo);

        produtos.stream().filter(p-> p.getPreco() > 100).forEach(Produto:: exibirInfo);

        double somaTotal = produtos.stream()
        .mapToDouble(Produto::getPreco)
        .sum();

    System.out.printf("Soma total dos preços: R$ %.2f\n", somaTotal);
    }
}
