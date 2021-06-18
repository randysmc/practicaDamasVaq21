package jugadores;

public class Jugador{

    private String nombre;
    private int puntuacion;
    private int id;

    public Jugador(String nombre, int puntuacion){
        this.nombre = nombre;
        this.puntuacion = puntuacion;
    }
    public Jugador(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getPuntuacion(){
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion){
        this.puntuacion = puntuacion;
    }

    public int getId(){
        return id;
    }

    public void setId(){
        this.id = id;
    }


}