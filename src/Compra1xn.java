import java.util.ArrayList;

public class Compra1xn {

    String cliente;
    ArrayList<Item1xn> itens = new ArrayList<>();

    double getValorTotalCompra() {
        double totalCompra = 0;

        for ( Item1xn item : itens ) {
            totalCompra += (item.quantidade * item.preco);
        }

        return totalCompra;
    }
}
