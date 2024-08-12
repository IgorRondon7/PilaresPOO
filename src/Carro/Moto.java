package Carro;

public class Moto extends Veiculo {
    private void verificarCombustivel() {
        System.out.println("COMBUSTÍVEL VERIFICADO.");
    }
    private void verificarMotor() {
        System.out.println("MOTOR VERIFICADO.");
    }
    public void ligar() {
        verificarMotor();
        verificarCombustivel();
        System.out.println("MOTO LIGADA!");
    }
}
