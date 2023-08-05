public class Sistema {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Maria");

        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 3.00, 2);
        compra1.adicionarItem(new Produto("Notebook", 3500), 1);
        cliente.compras.add(compra1);


        Compra compra2 = new Compra();
        compra2.adicionarItem("Caderno", 20.00, 1);
        cliente.adicionarCompra(compra2);

        System.out.println(cliente.nome);
        System.out.println("Total da Compra:");
        System.out.println(cliente.obterValorTotal());
    }
}
