package test;

import metier.IPorte;
import metier.IPorteSecurisé;
import metier.Porte;
import metier.PorteSécurisé;

public class Test {
    public static void main(String[] args) {
        IPorte porte = new Porte();
        porte.ouvrir();
        porte.fermer();

        PorteSécurisé ps=new PorteSécurisé();
        ps.ouvrir();
        ps.fermer();
        ps.alert();
    }
}
