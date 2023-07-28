public class Carro1x1 {
    Motor1x1 motor = new Motor1x1();

    void acelerar() {
        motor.fatorInjecao += 0.4;
    }

    void frear() {
        if (motor.fatorInjecao > 0.5) {
            motor.fatorInjecao = 0;
        } else {
            motor.fatorInjecao -= 0.4;
        }
    }

    void ligar() {
        motor.ligado = true;
    }

    void desligar() {
        motor.ligado = false;
    }

    boolean estaLigado() {
        return motor.ligado;
    }
}

