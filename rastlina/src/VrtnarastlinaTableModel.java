/*
    Ime datoteke: VrtnarastlinaTableModel.java
    Avtor datoteke: Adriana Felicijan


 */

import javax.swing.table.*;

public class VrtnarastlinaTableModel extends DefaultTableModel {

    // Konstruktor
    public VrtnarastlinaTableModel() {

        // Kliče konstruktor nadrazreda
        super();

        // V tabelo dodamo stolpce
        addColumn("Vrsta rastline");
        addColumn("Je zalita");

        // Ustvarimo naslovno vrstico
        // Ustvarimo statičen seznam objektov
        Object[] vrstica = new Object[] {"Vrsta", "Zalitost"};
        // Dodamo vrstico v tabelo
        addRow(vrstica);

    }

    // Metoda, ki doda rastlino na seznam
    // Vhodni parametri: Vr - VRTNARastlina
    // Potek/opis: Metoda, ki doda rastlino na seznam in v tabelo
    // Vrne vrednost: /
    public void addVrtnarastlina(Vrtnarastlina v) {

        // Ustvarimo naslovno vrstico
        // Ustvarimo statičen seznam objektov
        Object[] vrstica = new Object[] {v.getVrstarastline(), v.getZalitost()};

        // Dodamo vrstico v tabelo
        addRow(vrstica);

    }

}
