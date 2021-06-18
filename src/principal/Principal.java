package src.principal;
import src.jugadores.VectorJugador;
import src.tablero.*;
import java.util.*;

public class Principal {

    private VectorJugador jugadores = new VectorJugador();
    private Tablero tablero = new Tablero();
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[]args){
        Principal p = new Principal();
        

    }

    public Principal(){
        int eleccion =0;
        while(eleccion!=4){
            System.out.println("Bienvenido al juego de ajedrez");
            System.out.println("1 Ingresar usuario");
            System.out.println("2. Mostrar Jugadores");
            System.out.println("3. pintar tablero");
            eleccion = Integer.parseInt(teclado.nextLine());
            if(eleccion ==1){
                jugadores.agregarJugador();
            }
            if(eleccion ==2){
                jugadores.mostrarJugadores();
            }
            if(eleccion ==3){
                tablero.jugar();
                System.out.println("\n");
            }

        }

    }


    
}
