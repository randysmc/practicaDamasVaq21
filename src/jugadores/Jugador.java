package src.jugadores;

public class Jugador {

    private String nombre;
    private int puntuacion;
    private int partidasGanadas;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntuacion = 0;
        this.partidasGanadas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }



}
