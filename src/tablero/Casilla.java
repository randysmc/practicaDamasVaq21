package src.tablero;

public class Casilla{
    //private final char CUADRO = (char)1046;
    private final String CUADRO = "X";
    private final String BLANCO = "\u001B[37m"; 
    private final String NEGRO ="\u001B[30m";
    private FichaRoja fichaR;
    private FichaVerde fichaV;


    public Casilla(){
        fichaR = null;
        fichaV = null;

    }

    public void iniciarFichaRoja(){
        fichaR = new FichaRoja();
    }

    public void iniciarFichaVerde(){
        fichaV = new FichaVerde();
    }

    public String getCuadroBlanco(){
        return BLANCO+CUADRO;
    }
    public String getCuadroNegro(){
        return NEGRO+CUADRO;
    }

    public String getFila1(boolean esBlanco){

        
       if(esBlanco && (fichaR != null)){
            return getCuadroBlanco()+getCuadroBlanco()+fichaR.getFichaRoja()+getCuadroBlanco()+getCuadroBlanco()+getCuadroBlanco();
        }else{
            return getCuadroNegro()+getCuadroNegro()+getCuadroNegro()+getCuadroNegro()+getCuadroNegro()+getCuadroNegro();
        }
    }

    public String getFila2(boolean esBlanco){
        if(esBlanco && (fichaR != null)){
            return getCuadroBlanco()+getCuadroBlanco()+fichaR.getFichaRoja()+getCuadroBlanco()+getCuadroBlanco()+getCuadroBlanco();
        }else{
            return getCuadroNegro()+getCuadroNegro()+getCuadroNegro()+getCuadroNegro()+getCuadroNegro()+getCuadroNegro();
        }
    }   

    public String getFila3(boolean esBlanco){
        if(esBlanco &&(fichaR != null)){
            return getCuadroBlanco()+getCuadroBlanco()+getCuadroBlanco()+getCuadroBlanco()+getCuadroBlanco()+getCuadroBlanco();
        }else{
            return getCuadroNegro()+getCuadroNegro()+getCuadroNegro()+getCuadroNegro()+getCuadroNegro()+getCuadroNegro();
        }
    } 
}
