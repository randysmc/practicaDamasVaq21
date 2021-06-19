package src.tablero;

public class Tablero {

    Casilla[][] tablero;

    public Tablero(){
        tablero = new Casilla[8][8];

    }

    public void jugar(){
        iniciarTablero();
        pintarTablero();
    }

    public void iniciarTablero(){
        boolean blanca = true;
        for (int i = 0; i <8; i++) {
            for(int j=0; j<8; j++){
                blanca= !blanca;
                tablero[i][j] = new Casilla(blanca);
                if(i<3 && blanca){
                    tablero[i][j].iniciarFicha(false);
                }
                if(i>4 && blanca){
                    tablero[i][j].iniciarFicha(false);
                }
            }
            blanca = !blanca;
        }
    }


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
                    linea4+="  "+j+" ";
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
