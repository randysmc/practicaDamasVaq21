package src.jugadores;

import java.util.Scanner;


public class VectorJugadores {
    private final int JUGADORES =10;
    Jugador[] jugador = new Jugador[JUGADORES];
    private int siguientePos;
    Scanner teclado = new Scanner(System.in);

    public VectorJugadores() {
        siguientePos=1;
    }

    public void agregarJugador(String nombre){
        if(siguientePos>JUGADORES){
            System.out.println("No se puede ingresar a otro jugador");
        }else{
            jugador[(siguientePos-1)] = new Jugador(nombre);
        }
        siguientePos++;
    }

    public void agregarJugador(){
        System.out.println("Ingrese su nombre");
        String nombre = teclado.nextLine();
        agregarJugador(nombre);
    }



    public void mostrarJugadores(){
        for (int i = 0; i < (siguientePos-1); i++) {
            System.out.println(i+" Nombre: " +jugador[i].getNombre()+
                    " puntuacion: " +jugador[i].getPuntuacion() + " ha ganado: " +
                    jugador[i].getPartidasGanadas() +" juegos");

        }

    }

    public Jugador[] getJugador() {
        return jugador;
    }

    public void setJugador(Jugador[] jugador) {
        this.jugador = jugador;
    }



}
