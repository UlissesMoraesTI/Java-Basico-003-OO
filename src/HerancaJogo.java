public class HerancaJogo {
    public static void main(String[] args) {

        HerancaJogador j1 = new HerancaJogador();
        j1.x = 10;
        j1.y = 20;

        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.NORTE);

        System.out.println(j1.y);
    }
}
