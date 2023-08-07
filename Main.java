import java.util.Scanner;

/**
 * Universidad del Valle de Guatemala
 * Programación Orientada a Objetos
 * CC2008 - Sección 10
 * Luis Pedro Lira - 23669
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=============== PIG GAME ===============");
        System.out.println("1. Dos jugadores\n2. Tres jugadores\n3. Cuatro jugadores\n4. Salir");
        System.out.println("¿Cuántos jugadores van a jugar?");
        int  respuesta = scanner.nextInt();

        switch (respuesta){
            case 1:
            /**
             * DOS JUGADORES
             * SE CREA DOS OBJETOS DE LA CLASE JUGADOR
             */

            /**
             * El codigo, a mi parecer esta descente jaja, pero tengo un error cuando quiero preguntarle
             * al segundo jugador si quiere ceder su turno y este responde que si. Simplemente
             * no cambia de jugador y se queda siempre con el mismo jugador. Ya era muy tarde,
             * para poder intentar arreglarlo pero hice lo que pude jaja. Ojala no te perdas
             * en el codigo. Todo es lo mismo, solo que con más jugadores y ya.
             */
            
                Jugador jugador1 = new Jugador("Estuardo");
                Jugador jugador2 = new Jugador("Isabella");


                do {
                    if (jugador1.getTurnoJugador() % 2 == 0) {
                        System.out.println("Turno de Jugador 1: " + jugador1.getNombre());
                        jugador1.lanzar();
                        System.out.println(jugador1);
                        jugador1.verificarPuntaje();
                    } 
                    if (jugador1.getTurnoJugador() % 2 == 1) {
                        System.out.println("Turno de Jugador 2: " + jugador2.getNombre());
                        jugador2.lanzar();
                        System.out.println(jugador2);
                        jugador2.verificarPuntaje();
                    }
                } while ((jugador1.getPuntaje() != 100) || (jugador2.getPuntaje() != 100));

                break;

            case 2:
            /**
             * TRES JUGADORES
             * SE CREA TRES OBJETOS DE LA CLASE JUGADOR
             */
                Jugador jugador1_2 = new Jugador("Estuardo");
                Jugador jugador2_2 = new Jugador("Isabella");
                Jugador jugador3_2 = new Jugador("Luis");

                do {
                    if (jugador1_2.getTurnoJugador() % 3 == 0) {
                        System.out.println("Turno de Jugador 1: " + jugador1_2.getNombre());
                        jugador1_2.lanzar();
                        System.out.println(jugador1_2);
                        jugador1_2.verificarPuntaje();
                    } 
                    if (jugador1_2.getTurnoJugador() % 3 == 1) {
                        System.out.println("Turno de Jugador 2: " + jugador2_2.getNombre());
                        jugador2_2.lanzar();
                        System.out.println(jugador2_2);
                        jugador2_2.verificarPuntaje();
                    }
                    if (jugador1_2.getTurnoJugador() % 3 == 2) {
                        System.out.println("Turno de Jugador 2: " + jugador3_2.getNombre());
                        jugador3_2.lanzar();
                        System.out.println(jugador3_2);
                        jugador3_2.verificarPuntaje();
                    }
                } while ((jugador1_2.getPuntaje() != 100) || (jugador2_2.getPuntaje() != 100) || (jugador3_2.getPuntaje() != 100));

                break;
            case 3:
            /**
             * CUATRO JUGADORES
             * SE CREA CUATRO OBJETOS DE LA CLASE JUGADOR
             */

                Jugador jugador1_3 = new Jugador("Estuardo");
                Jugador jugador2_3 = new Jugador("Isabella");
                Jugador jugador3_3 = new Jugador("Luis");
                Jugador jugador4_3 = new Jugador("Pedro");

                do {
                    if (jugador1_3.getTurnoJugador() % 4 == 0) {
                        System.out.println("Turno de Jugador 1: " + jugador1_3.getNombre());
                        jugador1_3.lanzar();
                        System.out.println(jugador1_3);
                        jugador1_3.verificarPuntaje();
                    } 
                    if (jugador1_3.getTurnoJugador() % 4 == 1) {
                        System.out.println("Turno de Jugador 2: " + jugador2_3.getNombre());
                        jugador2_3.lanzar();
                        System.out.println(jugador2_3);
                        jugador2_3.verificarPuntaje();
                    }
                    if (jugador1_3.getTurnoJugador() % 4 == 2) {
                        System.out.println("Turno de Jugador 2: " + jugador3_3.getNombre());
                        jugador3_3.lanzar();
                        System.out.println(jugador3_3);
                        jugador3_3.verificarPuntaje();
                    }
                    if (jugador1_3.getTurnoJugador() % 4 == 3) {
                        System.out.println("Turno de Jugador 2: " + jugador4_3.getNombre());
                        jugador4_3.lanzar();
                        System.out.println(jugador4_3);
                        jugador4_3.verificarPuntaje();
                    }
                } while ((jugador1_3.getPuntaje() != 100) || (jugador2_3.getPuntaje() != 100) || (jugador3_3.getPuntaje() != 100) || (jugador4_3.getPuntaje() != 100));
                
                break;
            case 4:
                System.out.println("Gracias por jugar");
                break;
            default:
                System.out.println("Opción inválida. Adios.");
                break;
        }
    }
}
