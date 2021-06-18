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
                    if(i<3){
                        tablero[i][j].iniciarFichaRoja();
                    }
                    if(i>4){
                        tablero[i][j].iniciarFichaRoja();
                    }

            }
        }
    }

    public void pintarTablero(){
        boolean blanco =true;
        String linea1 = "";
        String linea2 = "";
        String linea3 = "";
        String linea4 = "";

        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                blanco =!blanco;

                linea1 += tablero[i][j].getFila1(blanco);
                linea2 += tablero[i][i].getFila2(blanco);
                linea3 += tablero[i][j].getFila3(blanco);
                if(j==7){
                    linea2+= "     "+i;
                }
                if(i==7){
                    linea4+= "   "+j+"  ";
                }
            }
            blanco = !blanco;
            System.out.println(linea1);
            System.out.println(linea2);
            System.out.println(linea3);
            linea1= "";
            linea2= "";
            linea3= "";
        }
        System.out.println(linea4);

    }
}