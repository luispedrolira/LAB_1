/**
 * Universidad del Valle de Guatemala
 * Programación Orientada a Objetos
 * CC2008 - Sección 10
 * Luis Pedro Lira - 23669
 */
import java.util.Random;

public class Dado {
    private int valor;
    private int resultadoDado1;
    private int resultadoDado2;
    private Random dado1;
    private Random dado2;


    Dado() {
        dado1 = new Random();
        dado2 = new Random();
        valor = 0;
    }
    
    public void lanzar() {
        resultadoDado1 = dado1.nextInt(1, 6);
        resultadoDado2 = dado2.nextInt(1, 6);
        sumarDados();
    }

    public void sumarDados() {
        int valorTotal = getValor() + getResultadoDado1() + getResultadoDado2();
        setValor(valorTotal);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

     public int getResultadoDado1() {
        return resultadoDado1;
    }

    public int getResultadoDado2() {
        return resultadoDado2;
    }


    


}
