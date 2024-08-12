package Carro;

public class Carro extends Veiculo {
    //PERCEBEMOS AQUI O ENCAPSULAMENTO "Nem tudo precisa estar visível". 
    private void conferirCambio () {
        String cambio = "neutro";
        if (cambio != "neutro") {
            System.out.println("CAMBIO NÃO ADAPTADO.");
        } else {
            System.out.println("CAMBIO CONFERIDO.");
        }
        
    }
    private void conferirCombustivel() {
        int combustivel = 50;
        if (combustivel < 5) {
            System.out.println("COMBUSTÍVEL INSUFICIENTE.");
        } else {
            System.out.println("COMBUSTÍVEL CONFERIDO.");
        }
    }
    public void ligar() {
        conferirCombustivel();
        conferirCambio();
        System.out.println("CARRO LIGADO!");
    }
}
