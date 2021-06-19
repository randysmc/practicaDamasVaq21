package src.principal;

import src.jugadores.*;
import src.tablero.*;
import java.util.*;


public class Principal {

    VectorJugadores listaJugadores = new VectorJugadores();
    private Tablero tablero = new Tablero();
    Scanner teclado = new Scanner(System.in);

    public Principal(){
        menuPrincipal();


    }

    public void menuPrincipal(){
        System.out.println("Ingrese la opcion que quiera");
        int eleccion =0;
        while(eleccion !=-1){
            System.out.println("Ingrese numero");
            eleccion = Integer.parseInt(teclado.nextLine());
            switch(eleccion){
                case 1:
                    listaJugadores.agregarJugador();
                    break;
                case 2:
                    listaJugadores.mostrarJugadores();
                    break;
                case 3:
                    tablero.jugar();
            }
        }
    }


    public static void main(String[] args) {
        Principal p = new Principal();

    }



}
