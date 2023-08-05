import java.util.ArrayList;

public class Compra {
    ArrayList<Item> itens = new ArrayList<>();

    void adicionarItem(Produto p, int qtde) {
        this.itens.add(new Item(p, qtde));
    }

    void adicionarItem(String nome, double preco, int qtde) {
        var produto = new Produto(nome, preco);
        this.itens.add(new Item(produto, qtde));
    }

    public Double obterValorTotalDaCompra(){
        double total = 0;

        for (Item item : itens) {
            total += item.quantidade * item.produto.preco;
        }

        return total;
    }
}
