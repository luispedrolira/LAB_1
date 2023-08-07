/**
 * Universidad del Valle de Guatemala
 * Programación Orientada a Objetos
 * CC2008 - Sección 10
 * Luis Pedro Lira - 23669
 */

import java.util.Scanner; 
public class Jugador extends Dado{
    private String nombre;
    private int puntaje;
    private int turnoJugador;
    
    Jugador(String nombre){
        this.nombre = nombre;
        puntaje = 0;
        turnoJugador = 0;
    }

    public int getTurnoJugador() {
        return turnoJugador;
    }

    public String getNombre(){
        return nombre;
    }


    public int getPuntaje(){
        return puntaje;
    }

    public void setPuntaje(int puntaje){
        this.puntaje = puntaje;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int verificarPuntaje(){
        if ((getResultadoDado1() == 1) || (getResultadoDado2() == 1)){
            turnoJugador++;
            setPuntaje(0);
        }
        else{
            setPuntaje(getValor());
            cederTurno();
        }

        return puntaje;
    }

    public String toString(){
        return "Dado 1: " + getResultadoDado1() + "\n"+"Dado 2: " + getResultadoDado2();
    }

    private void cederTurno(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Puntaje actual: " + getPuntaje());
        System.out.println("¿Desea ceder el turno? (s/n)");
        String respuesta = scanner.nextLine();
        if (respuesta.equals("s")){
            turnoJugador++; 
        }
    }

}