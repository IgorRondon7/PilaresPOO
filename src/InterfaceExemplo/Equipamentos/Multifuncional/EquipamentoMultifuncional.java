package InterfaceExemplo.Equipamentos.Multifuncional;

import InterfaceExemplo.Equipamentos.Copiadora.Copiadora;
import InterfaceExemplo.Equipamentos.Digitalizadora.Digitalizadora;
import InterfaceExemplo.Equipamentos.Impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    public void copiar() {
        System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
    public void digitalizar() {
        System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
    public void imprimir() {
        System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
}