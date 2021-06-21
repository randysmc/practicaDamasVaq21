package src.tablero;
import src.jugadores.*;
import src.principal.*;


public class Casilla {
    private final String CUADRO_BLANCO = "X";
    //private final char CUADRO_BLANCO = (char)81;
    private boolean blanca;
    private final String CUADRO_NEGRO = "X";
    //private final char CUADRO_NEGRO = (char)81;
    private Ficha ficha;
    private boolean roja;


    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";


    public Casilla(boolean blanca){
        this.blanca = blanca;
        this.ficha = null;



    }

    public boolean estaVacia(){
        if(ficha == null)
            return true;

        return false;
    }

    public Ficha getFicha() {
        Ficha temp = this.ficha;
        this.ficha = null;
        return temp;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }


    public String getCuadroBlanco(){
        return ANSI_CYAN+CUADRO_BLANCO;
    }

    public String getCuadroNegro(){
        return ANSI_PURPLE+CUADRO_NEGRO;
    }

    public boolean hayFicha(){
        return(ficha != null);
    }

    public String getFila1(){
        if(blanca ){
            if(ficha != null) return getCuadroBlanco()+ficha.getFicha()+ficha.getFicha()+ficha.getFicha()+getCuadroBlanco();
            //return getCuadroBlanco()+ficha.getFicha(roja)+ficha.getFicha(roja)+ficha.getFicha(roja)+getCuadroBlanco();

            if(ficha == null) return getCuadroBlanco()+getCuadroBlanco()+getCuadroBlanco()+getCuadroBlanco()+getCuadroBlanco();
        }
        return getCuadroNegro()+getCuadroNegro()+getCuadroNegro()+getCuadroNegro()+getCuadroNegro();
    }

       public String getFila2(){
        if(blanca){
            if(ficha != null) return getCuadroBlanco()+getCuadroBlanco()+ficha.getFicha()+getCuadroBlanco()+getCuadroBlanco();
            if(ficha == null) return getCuadroBlanco()+getCuadroBlanco()+getCuadroBlanco()+getCuadroBlanco()+getCuadroBlanco();
        }
        return getCuadroNegro()+getCuadroNegro()+getCuadroNegro()+getCuadroNegro()+getCuadroNegro();
    }

            public String getFila3(){
        if(blanca){
            if(ficha != null) return getCuadroBlanco()+ficha.getFicha()+ficha.getFicha()+ficha.getFicha()+getCuadroBlanco();
            if(ficha == null) return getCuadroBlanco()+getCuadroBlanco()+getCuadroBlanco()+getCuadroBlanco()+getCuadroBlanco();
        }
        return getCuadroNegro()+getCuadroNegro()+getCuadroNegro()+getCuadroNegro()+getCuadroNegro();
    }






}
