public class CarroTeste1x1 {
    public static void main(String[] args) {

        Carro1x1 c1 = new Carro1x1();
        System.out.println(c1.estaLigado());

        c1.ligar();
        System.out.println(c1.estaLigado());

        System.out.println(c1.motor.giros());

        c1.acelerar();
        System.out.println(c1.motor.giros());

        c1.acelerar();
        System.out.println(c1.motor.giros());

        c1.frear();
        System.out.println(c1.motor.giros());

        c1.frear();
        System.out.println(c1.motor.giros());

        c1.frear();
        System.out.println(c1.motor.giros());

        c1.frear();
        System.out.println(c1.motor.giros());

        c1.frear();
        System.out.println(c1.motor.giros());


    }
}
