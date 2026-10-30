package edu.masanz.da.ut3.modelo;

public class Mapa {

    private int numFils = 7;
    private int numCols = 10;

    public Mapa(int numFils, int numCols){
        this.numFils = numFils;
        this.numCols = numCols;
    }

    public void realizarAccion(Personaje personaje, String accion) {
        switch (accion) {
            case "A" -> moverIzq(personaje);
            case "D" -> moverDer(personaje);
            case "S" -> moverAbajo(personaje);
            case "W" -> moverArriba(personaje);
        }
    }

    private void moverIzq(Personaje personaje) {
        if(personaje.getColP() > 1){
            personaje.setColP(personaje.getColP()-1);
        }
    }

    private void moverDer(Personaje personaje) {
        if(personaje.getColP() < numCols-2){
            personaje.setColP(personaje.getColP()+1);
        }
    }

    private void moverAbajo(Personaje personaje) {
        if(personaje.getFilaP() < numFils-2){
            personaje.setFilaP(personaje.getFilaP()+1);
        }
    }

    private void moverArriba(Personaje personaje) {
        if(personaje.getFilaP() > 1){
            personaje.setFilaP(personaje.getFilaP()-1);
        }
    }

    public int getNumFils() {
        return numFils;
    }

    public void setNumFils(int numFils) {
        this.numFils = numFils;
    }

    public int getNumCols() {
        return numCols;
    }

    public void setNumCols(int numCols) {
        this.numCols = numCols;
    }
}
