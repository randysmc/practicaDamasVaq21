package src.tablero;



public class Casilla {
    //private final String CUADRO_BLANCO = "X";
    private final char CUADRO_BLANCO = (char)81;
    private boolean blanca;
    private final char CUADRO_NEGRO = (char)81;
    private Ficha ficha;


    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_WHITE = "\u001B[37m";


    public Casilla(boolean blanca){
        this.blanca = blanca;
        this.ficha = null;
        //ficha = new Ficha(true);

    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }


    public String getCuadroBlanco(){
        return ANSI_WHITE+CUADRO_BLANCO;
    }

    public String getCuadroNegro(){
        return ANSI_BLACK+CUADRO_NEGRO;
    }

    public void iniciarFicha(boolean blanca){
        ficha = new Ficha(blanca);
    }

    public String getFila1(){
        if(blanca){
            if(ficha != null) return getCuadroBlanco()+ficha.getFichaRoja()+ficha.getFichaRoja()+ficha.getFichaRoja()+getCuadroBlanco();
            if(ficha == null) return getCuadroBlanco()+getCuadroBlanco()+getCuadroBlanco()+getCuadroBlanco()+getCuadroBlanco();
        }
        return getCuadroNegro()+getCuadroNegro()+getCuadroNegro()+getCuadroNegro()+getCuadroNegro();
    }

        public String getFila2(){
        if(blanca){
            if(ficha != null) return getCuadroBlanco()+getCuadroBlanco()+ficha.getFichaRoja()+getCuadroBlanco()+getCuadroBlanco();
            if(ficha == null) return getCuadroBlanco()+getCuadroBlanco()+getCuadroBlanco()+getCuadroBlanco()+getCuadroBlanco();
        }
        return getCuadroNegro()+getCuadroNegro()+getCuadroNegro()+getCuadroNegro()+getCuadroNegro();
    }

            public String getFila3(){
        if(blanca){
            if(ficha != null) return getCuadroBlanco()+ficha.getFichaRoja()+ficha.getFichaRoja()+ficha.getFichaRoja()+getCuadroBlanco();
            if(ficha == null) return getCuadroBlanco()+getCuadroBlanco()+getCuadroBlanco()+getCuadroBlanco()+getCuadroBlanco();
        }
        return getCuadroNegro()+getCuadroNegro()+getCuadroNegro()+getCuadroNegro()+getCuadroNegro();
    }






}
