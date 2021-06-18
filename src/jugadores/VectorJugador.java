package src.jugadores;

import java.util.*;

public class VectorJugador {

    private Jugador[] jugadores = new Jugador[5];
    private int indice;
    Scanner teclado = new Scanner(System.in);

    public VectorJugador(){
        indice=1;

    }

    public void agregarJugador(String nombre){  
        if(indice >5){
            System.out.println("No se puede ingresar, ya esta en el limite");
        }else{
            jugadores[indice] = new Jugador(nombre);
        }

        indice++;
    }

    public void agregarJugador(){
        System.out.println("Ingrese el nombre del jugador en la posicion " +indice);
        String nombre = teclado.nextLine();

        agregarJugador(nombre);
    }

    public void mostrarJugadores(){
        for(int i=0; i<indice;i++){
            System.out.println(i + "Nombre: " +jugadores[i].getNombre() + " Puntuacion = " +jugadores[i].getPuntuacion());
        }
    }
    
}
