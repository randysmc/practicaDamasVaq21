 

package src.tablero;


public class Ficha {
    //private final char FICHA_ROJA = (char)180;
    private final char FICHA_VERDE = (char)180;
    private final String FICHA_ROJA = "X";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    private boolean roja;

    public Ficha(boolean roja){
        this.roja = roja;
    }


    public String getFichaRoja(){
        return ANSI_RED+FICHA_ROJA;
    }

    public String getFichaVerde(){
        return ANSI_GREEN +FICHA_VERDE;
    }






}
