package main;

import sn.isi.entities.Rn;
import sn.isi.traitement.IRn;
import sn.isi.traitement.RnImp;

public class Main {
    public static void main(String[] args) {
        IRn irn = new RnImp();
        Rn rn = irn.saisie();
        irn.affichage(rn);
    }
}
