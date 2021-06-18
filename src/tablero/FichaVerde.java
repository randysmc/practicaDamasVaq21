package src.tablero;

public class FichaVerde {
    private static final String MONEDA ="o";
    private final String VERDE = "\u001B[32m";


    public String getFichaVerde(){
        return VERDE+MONEDA;
    }
    
}
