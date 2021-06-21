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
        System.out.println("Seleccione al Jugador 1");
        int jug1 = Integer.parseInt(teclado.nextLine());
        System.out.println("Seleccione al Jugador 2");
        int jug2 = Integer.parseInt(teclado.nextLine());
        listaJugadores.agregarCompetidor(jug1, jug2);
        System.out.println("Agregados correctamente");
        listaJugadores.mostrarCompetidores();
        listaJugadores.elegirTurnos();
        listaJugadores.mostrarCompetidores();
        System.out.println("Vamo a JUGAR");
        comp1 = listaJugadores.enviarJugador(0);
        comp2 = listaJugadores.enviarJugador(1);
        tablero.jugar(comp1, comp2);




    }

    public void menuPrincipal(){
        System.out.println("***********************************************************************");
        System.out.println("Bienvenido al prototipo del juego de damas de el lab de IPC1 Junio 2021");
        System.out.println("***********************************************************************");
        System.out.println("\n\n");

        int eleccion =0;
        while(eleccion !=-1){
            System.out.println("\n\n");
            System.out.println("Ingrese la opcion que desee de acuerdo al numero");
            System.out.println("1.Agregar jugadores (Maximo 10) , \n2.Ver lista de jugadores, \n3.Mostrar tablero, \n4 Elegir Jugadores, \n5 Reportes");
            System.out.println("-1 Salir");
            System.out.println("Ingrese numero");
            eleccion = Integer.parseInt(teclado.nextLine());
            switch(eleccion){

                case 1:
                    System.out.println("Vamos a agregar a un nuevo jugador");
                    listaJugadores.agregarJugador();
                    break;
                case 2:
                    System.out.println("Mostramos la lista de jugadores");
                    listaJugadores.mostrarJugadores();
                    break;
                case 3:
                    System.out.println("Mostrar el tablero");
                    System.out.println("Antes si se veia, ahora no jaja");
                    /*tablero.iniciarTablero();
                    tablero.pintar();
                    System.out.println("\n");*/
                    break;
                case 4:
                    System.out.println("Vamos a seleccionar a los jugadores");
                    iniciarComp();
                    break;
                case 5:
                    listaJugadores.mostrarReportePartidas();
                    break;
                case -1:
                    System.out.println("Vuelva pronto");
                    break;

                default :
                    System.out.println("No existe esa opcion");
                    break;
            }


        }
    }


}
