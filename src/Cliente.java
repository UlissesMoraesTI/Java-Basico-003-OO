import java.util.ArrayList;

public class Cliente {
    String nome;
    ArrayList<Compra> compras = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    void adicionarCompra(Compra compra){
        this.compras.add(compra);
    }

    double obterValorTotal() {
        double total = 0;

        for ( Compra compra : compras ) {
            total += compra.obterValorTotalDaCompra();
        }

        return total;
    }
}
