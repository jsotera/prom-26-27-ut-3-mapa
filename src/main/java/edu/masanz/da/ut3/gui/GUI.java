package edu.masanz.da.ut3.gui;

import java.util.Scanner;

public class GUI {

    public static void dibujarMapa(int numFils, int numCols, int filaP, int colP){
        System.out.println();
        for (int fila = 0; fila<numFils; fila++){
            for (int columna = 0; columna < numCols; columna++) {
                if (filaP == fila && colP == columna) {
                    System.out.print("[P]");
                } else if(columna == 0 || columna == numCols-1 || fila == 0 || fila == numFils -1) {
                    System.out.print("[*]");
                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.println();
        }
    }

    public static void mostrarInfo(int filaP, int colP) {
        System.out.println();
        System.out.println("TE ENCUENTRAS EN: "+filaP+","+colP);
    }

    public static String obtenerAccion(){
        System.out.println();
        System.out.print("Elije una acción: ");
        Scanner teclado = new Scanner(System.in);
        String accion = teclado.nextLine().toUpperCase();
        return accion;
    }
}
