package Carro;

public abstract class Veiculo {
    private int anoLancamento;
    private int placa;
    private String paisDeOrigem;
    
    public int getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    public int getPlaca() {
        return placa;
    }
    public void setPlaca(int placa) {
        this.placa = placa;
    }
    public String getPaisDeOrigem() {
        return paisDeOrigem;
    }
    public void setPaisDeOrigem(String paisDeOrigem) {
        this.paisDeOrigem = paisDeOrigem;
    } 
    public abstract void ligar();
}
