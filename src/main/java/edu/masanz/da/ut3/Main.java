package edu.masanz.da.ut3;

import edu.masanz.da.ut3.gui.GUI;
import edu.masanz.da.ut3.modelo.Mapa;
import edu.masanz.da.ut3.modelo.Personaje;

public class Main {

    public static void main(String[] args) {

        int numFils = 7;
        int numCols = 10;

        Mapa mapa = new Mapa(numFils, numCols);

        int filaP = 1;
        int colP = 1;

        Personaje javi = new Personaje(filaP, colP);

        GUI.dibujarMapa(mapa.getNumFils(), mapa.getNumCols(), javi.getFilaP(), javi.getColP());
        GUI.mostrarInfo(javi.getFilaP(), javi.getColP());

        while(true) {
            String accion = GUI.obtenerAccion();

            mapa.realizarAccion(javi, accion);

            GUI.dibujarMapa(mapa.getNumFils(), mapa.getNumCols(), javi.getFilaP(), javi.getColP());
            GUI.mostrarInfo(javi.getFilaP(), javi.getColP());
        }
    }

}
