package src.tablero;

public class Tablero{

    Casilla[][]tablero;

    public static void main(String[]args){
        Tablero tab = new Tablero();
        tab.jugar();
    }

    public Tablero(){
        tablero = new Casilla[8][8];
    }

    public void jugar(){
        iniciarTablero();
        pintarTablero();
    }

    public void iniciarTablero(){

        for(int i=0; i<8;i++){
            for(int j=0; j<8; j++){
                    tablero[i][j] = new Casilla();
            }
        }
    }

    public void pintarTablero(){
        boolean blanco =true;
        String linea1 = "";
        String linea2 = "";
        //String linea3 = "";

        for(int i=0;i<8;i++){
            blanco =!blanco;

            for(int j=0;j<8;j++){
                linea1 += tablero[i][j].getFila(blanco);
                linea2 += tablero[i][i].getFila(blanco);
            }
            System.out.println(linea1);
            System.out.println(linea2);
            //System.out.println(linea3);
            linea1= "";
            linea2= "";
            //linea3 = "";
        }

    }
}