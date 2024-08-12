package Carro;
public class Autodromo {
    public static void main(String[] args) throws Exception {
        Carro lamborghini = new Carro();
        lamborghini.ligar();
        lamborghini.setPlaca(302015);
        lamborghini.setAnoLancamento(2018);
        lamborghini.setPaisDeOrigem("Itália");

        System.out.println("A lamborghini de placa "+lamborghini.getPlaca()+" do ano de "+lamborghini.getAnoLancamento()+
        " e do país "+lamborghini.getPaisDeOrigem() + ", é atualmente considerado um dos melhores carros já criados.");

        System.out.println("---------------------");

        Moto kawasaki = new Moto();
        kawasaki.ligar();
        kawasaki.setPlaca(208713);
        kawasaki.setAnoLancamento(2012);
        kawasaki.setPaisDeOrigem("Japão");

        System.out.println("A kawasaki de placa "+kawasaki.getPlaca()+" do ano de "+kawasaki.getAnoLancamento()+
        " e do país "+kawasaki.getPaisDeOrigem() + ", é atualmente considerada uma das melhores motos já criadas.");
    }
}
