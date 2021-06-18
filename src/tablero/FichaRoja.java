package src.tablero;

public class FichaRoja { 
    //private static final char MONEDA = (char)180;
    private static final String MONEDA ="o";
    private final String ROJA = "\u001B[31m";


    public String getFichaRoja(){
        return ROJA + MONEDA;
    }



}
