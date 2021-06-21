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
        iniciarTablero();


    }

    public void jugar(Jugador j1, Jugador j2){
        boolean hayGanador= false;

        competidor[0] = j1;
        competidor[1] = j2;
        j1.setPartidasJugadas(j1.getPartidasJugadas()+1);
        j2.setPartidasJugadas(j2.getPartidasJugadas()+1);
        int iteracion=0;

        System.out.println("los jugadores son");
        System.out.println(competidor[0].getNombre());
        System.out.println(competidor[1].getNombre());
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
                if(competidor[i].getPuntuacion() ==15){
                    hayGanador =true;
                }


            }
            iteracion++;
            System.out.println("iteracion" +iteracion);
            //pintarTablero();


        }while(!hayGanador);

        }



    /*            competidor[i].setPartidasGanadas(competidor[i].getPartidasGanadas()+1);
            competidor[i].setPuntuacion(competidor[i].getPuntuacion()+2);*/



    public void moverFicha(Jugador jug){
        int x, y, xF, yF;
        System.out.println("Pos X");
        y = Integer.parseInt(teclado.nextLine());
        System.out.println("Pos y");
        x = Integer.parseInt(teclado.nextLine());
        System.out.println("Ingrese la pos x final");
        xF = Integer.parseInt(teclado.nextLine());
        System.out.println("Ingrese pos Y final");
        yF = Integer.parseInt(teclado.nextLine());
        moverFicha(x,y,xF,yF);


    }

    public boolean moverFicha(int posx, int posy, int posxF, int posyF){
        boolean movimientoValido = false;
        if(tablero[posx][posy].hayFicha()){
            if(!tablero[posxF][posyF].hayFicha()){
                tablero[posxF][posyF].setFicha(tablero[posx][posy].getFicha());
                movimientoValido = true;
            }
        }
        return movimientoValido;
    }

    public void comerFicha(Casilla po, Casilla pf){
        pf.setFicha(po.getFicha());
        po.setFicha(null);

    }

    public void cambioFicha(Casilla po, Casilla pf){
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
    }

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
