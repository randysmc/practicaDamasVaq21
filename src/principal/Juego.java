package src.principal;

import java.util.*;
import src.jugadores.*;
import src.principal.*;
import src.tablero.*;



public class Juego {
    VectorJugadores listaJugadores;
    Jugador comp1, comp2;

    private Tablero tablero = new Tablero();


    Scanner teclado = new Scanner(System.in);




    public Juego(){
        listaJugadores = new VectorJugadores();
    }






    public void iniciarComp(){

        //listaJugadores.mostrarJugadores();
        System.out.println("Seleccione a los jugadores que van a competir");
        listaJugadores.mostrarJugadores();
        System.out.println("Jugador 1");
        int jug1 = Integer.parseInt(teclado.nextLine());
        System.out.println("Jugador 2");
        int jug2 = Integer.parseInt(teclado.nextLine());
        listaJugadores.agregarCompetidor(jug1, jug2);
        System.out.println("Agregados correctamente");
        listaJugadores.mostrarCompetidores();
        listaJugadores.elegirTurnos();
        listaJugadores.mostrarCompetidores();
        System.out.println("Vamos a JUGAR");
        comp1 = listaJugadores.enviarJugador(0);
        comp2 = listaJugadores.enviarJugador(1);
        tablero.jugar(comp1, comp2);




    }

    public void menuPrincipal(){

        int eleccion =0;
        while(eleccion !=-1){
            System.out.println("Ingrese la opcion que quiera");
            System.out.println("1.Agregar jugadore, 2.Ver lista de jugadores, 3.Mostrar tablero, 4 competidores, 5 Reportes");
            System.out.println("Ingrese numero");
            eleccion = Integer.parseInt(teclado.nextLine());
            switch(eleccion){
                case 1:
                    System.out.println("Agregar un jugador");
                    listaJugadores.agregarJugador();
                    break;
                case 2:
                    System.out.println("Ver la lista de jugadores");
                    listaJugadores.mostrarJugadores();
                    break;
                case 3:
                    System.out.println("Mostrar el tablero");
                    //tablero.jugar();
                    break;
                case 4:
                    System.out.println("Agregar Competidor");
                    iniciarComp();
                    //listaJugadores.mostrarCompetidores();
                    break;
                case 5:
                    listaJugadores.mostrarReportePartidas();

                default :
                    System.out.println("No existe esa opcion");
                    break;
            }


        }
    }


}

