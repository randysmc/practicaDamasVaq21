package src.tablero;
import src.jugadores.*;
import src.principal.*;
import src.tablero.*;


public class Ficha {
    //private final char FICHA_ROJA = (char)180;
    private final char FICHA_VERDE = (char)181;
    private final String FICHA_ROJA = "o";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    private boolean roja;
    public static final String ANSI_YELLOW = "\u001B[33m";


    public Ficha(boolean roja){
        this.roja = roja;
    }



    public String getFicha(){
        if(roja){
            return ANSI_RED +FICHA_ROJA;
        }
        return ANSI_YELLOW + FICHA_VERDE;

    }






}
