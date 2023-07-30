public class CompraTeste1xn {
    public static void main(String[] args) {

        Compra1xn compra1 = new Compra1xn();
        compra1.cliente = "Jota K";
        compra1.itens.add(new Item1xn("Caneta", 5, 4.00));
        compra1.itens.add(new Item1xn("Lapiz", 2, 2.00));
        compra1.itens.add(new Item1xn("Borracha", 1, 3.00));
        compra1.itens.add(new Item1xn("Caderno", 1, 20.00));

        System.out.println(compra1.itens.size());

        System.out.println("Total da Compra");
        System.out.println("Quantidade Produtos:" + compra1.itens.size());
        System.out.println(compra1.getValorTotalCompra());
    }
}
