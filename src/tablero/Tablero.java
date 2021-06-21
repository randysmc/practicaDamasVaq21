package src.tablero;

import java.util.*;
import src.jugadores.*;
import src.principal.*;
import src.tablero.*;

public class Tablero {

    Casilla[][] tablero;
    VectorJugadores listaJugadores;
    Scanner teclado = new Scanner(System.in);
    Jugador[] competidor = new Jugador[2];



    public Tablero(){
        tablero = new Casilla[8][8];
        //iniciarTablero();


    }

    public void jugar(Jugador j1, Jugador j2){
        boolean hayGanador= false;
        int eleccion =1;


        competidor[0] = j1;
        competidor[1] = j2;
        iniciarTablero();
        competidor[0].setPartidasJugadas(j1.getPartidasJugadas()+1);
        competidor[1].setPartidasJugadas(j2.getPartidasJugadas()+1);
        System.out.println("\n\n");
        competidor[0].setPuntuacionParcial(0);
        competidor[1].setPuntuacionParcial(0);
        int iteracion=0;


        System.out.println("los jugadores son");
        System.out.println(0+") "+ competidor[0].getNombre());
        System.out.println(1+") "+ competidor[1].getNombre());
        //pintarTablero();
        System.out.println("Para jugar damas moveras la ficha que te corresponda");
        System.out.println("El objetivo es comer las fichas rivales haciendo movimientos validos");
        System.out.println("solo te pudes mover un espacio en diagonal");
        System.out.println("Ingresaras las coordenadas iniciales y finales \n");

        do{

            for (int i = 0; i <2; i++) {

                System.out.println("mueva una ficha");
                System.out.println("Turno de mover de " +competidor[i].getNombre());
                pintarTablero();
                moverFicha(competidor[i]);
                System.out.println("ENTER para continuar");

                System.out.println(competidor[i].getFicha());
                competidor[i].setPuntuacion(competidor[i].getPuntuacion()+competidor[i].getPuntuacionParcial());
                if(competidor[i].getPuntuacionParcial()>=9){
                    hayGanador = true;
                    break;
                }

                }
            iteracion++;
            System.out.println("Turno: " +iteracion);
            System.out.println("Desea Salir?");
            System.out.println("presione -1");
            eleccion = Integer.parseInt(teclado.nextLine());


        }while((eleccion != -1)|| hayGanador ==true);


        if(competidor[0].getPuntuacion()>competidor[1].getPuntuacion()){
           competidor[0].setPartidasGanadas(competidor[0].getPartidasGanadas()+1);
            System.out.println("GANADOR" +competidor[0].getNombre());
            System.out.println("\n\n");

        }else{
           competidor[1].setPartidasGanadas(competidor[1].getPartidasGanadas()+1);
            System.out.println("GANADOR" +competidor[1].getNombre());
            System.out.println("\n\n");

        }

    }




    public boolean comioFicha(int posxF, int posyF){
        boolean comer = false;
        if(tablero[posxF][posyF] != null){
            if(tablero[posxF][posyF].hayFicha()){
                comer =true;
            }
        }
        return comer;
    }


    public void moverFicha(Jugador jug){
        int x, y, xF, yF;
        System.out.print(" Ingresa la coordenada en x");
        y = Integer.parseInt(teclado.nextLine());
        System.out.print(" Ingresa la coordenada y");
        x = Integer.parseInt(teclado.nextLine());
        System.out.print(" Ingrese la coordenada x final");
        yF = Integer.parseInt(teclado.nextLine());
        System.out.print(" Ingrese coordenada Y final");
        xF = Integer.parseInt(teclado.nextLine());
        boolean movValido =movimientoValido(x,y,xF,yF,jug);
        if(movValido ==true){
            comerFicha(x, y,  xF,  yF, jug);
        }else{
            System.out.println("movimiento no valido");
        }



    }




    public boolean movimientoValido(int posx, int posy, int posxF, int posyF, Jugador jug){
        boolean movimientoValido = false;
        if(tablero[posx][posy].hayFicha()){

            movimientoValido =true;
        }else{
            //System.out.println("No existe ficha en esa posicion, perdio su turno");
            movimientoValido =false;
        }

        return movimientoValido;
    }

    public void comerFicha(int posx, int posy, int posxF, int posyF, Jugador jug){
        if(tablero[posxF][posyF].hayFicha()){
            tablero[posxF][posyF].setFicha(tablero[posx][posy].getFicha());
            jug.setPuntuacionParcial(jug.getPuntuacionParcial()+1);
            System.out.println(jug.getNombre()+"Ha comido una ficha");
        }
        if(!tablero[posxF][posyF].hayFicha()){
            tablero[posxF][posyF].setFicha(tablero[posx][posy].getFicha());
            System.out.println("movimiento con exito");

    }


    }

   /* public void cambioFicha(Casilla po, Casilla pf){
        pf.setFicha(po.getFicha());
        po.setFicha(null);

    }

    public boolean movimientoValido(Casilla po, Casilla pf){
        if(pf.estaVacia()&& !po.estaVacia())
            return true;
        return false;

    }
    public boolean movimientoValido(int x, int y, int n){
        x+=n;
        y+=n;
        if((x>=0)&&(x<=7) && (y>=0)&&(y<=7)){
            return true;
        }else
            return false;
    }*/

    /*
     metodo para iniciar el tablero, como poseemos 2 tipos de casilla
     mandamos un boolean para representarlas, cada iteracion cambia el valor
     boolean
     **/
    public void iniciarTablero(){

        boolean blanca = true;
        boolean roja =true;
        for (int i = 0; i <8; i++) {
            for(int j=0; j<8; j++){
                blanca= !blanca;
                tablero[i][j] = new Casilla(blanca);


                if(i<3 && blanca){
                    tablero[i][j].setFicha(new Ficha(roja));
                }
                if(i>4 && blanca){
                    tablero[i][j].setFicha(new Ficha(!roja));
                }

            }
            blanca = !blanca;
        }
    }

    /*Metodo para pintar el tablero, utilizamos get de los metodos de la clase casilla*/
    public void pintarTablero(){

        String linea1 = "";
        String linea2 = "";
        String linea3 = "";
        String linea4 = "";

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                linea1+=tablero[i][j].getFila1();
                linea2+=tablero[i][j].getFila2();
                linea3+=tablero[i][j].getFila3();
                if(j==7){
                    linea2+= "  " +i;
                }
                if(i==7){
                    linea4+="  "+j+"  ";
                }
            }
                System.out.println(linea1);
                System.out.println(linea2);
                System.out.println(linea3);

                linea1="";
                linea2="";
                linea3="";
        }
        System.out.println(linea4);
    }


}
