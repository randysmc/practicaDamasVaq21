package src.tablero;

public class Casilla{
    private final char CUADRO = (char)190;

    private final String BLANCO = "\u001B[37m"; 
    private final String NEGRO ="\u001B[36m";
    boolean esBlanco = true;

    public Casilla(){

    }


    public String getCuadroBlanco(){
        return BLANCO+CUADRO;
    }
    public String getCuadroNegro(){
        return NEGRO+CUADRO;
    }

    public String getFila(boolean esBlanco){
        if(esBlanco){
            return getCuadroBlanco()+getCuadroBlanco()+getCuadroBlanco();
        }else{
            return getCuadroNegro()+getCuadroNegro()+getCuadroNegro();
        }

    }
    




}