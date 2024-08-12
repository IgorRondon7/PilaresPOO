package InterfaceExemplo.Estabelecimento;

import InterfaceExemplo.Equipamentos.Copiadora.Copiadora;
import InterfaceExemplo.Equipamentos.Digitalizadora.Digitalizadora;
import InterfaceExemplo.Equipamentos.Digitalizadora.Scanner;
import InterfaceExemplo.Equipamentos.Impressora.Deskjet;
import InterfaceExemplo.Equipamentos.Impressora.Impressora;
import InterfaceExemplo.Equipamentos.Multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Scanner scanner = new Scanner();

        Copiadora copiadora = em;
        Digitalizadora digitalizadora = scanner;
        Impressora impressora = em;

        copiadora.copiar();
        digitalizadora.digitalizar();
        impressora.imprimir();
    }
}
