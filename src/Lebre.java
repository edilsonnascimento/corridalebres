import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Lebre implements Runnable{

    private final int FIM_PROVA = 20;
    private int quantidadePulos = 1;
    private int distanciaPercorrida = 0;
    private String nome;
    private int salto;
    private int posisao;
    private boolean correndo = true;

    public Lebre(String nome) {
        this.nome = nome;
        this.salto = 0;
    }

    public static int aleatorioNaFaixa(final int primeiro, final int ultimo) {
        Random rnd = ThreadLocalRandom.current();
        return rnd.nextInt(ultimo - primeiro + 1) + primeiro;
    }

    @Override
    public void run() {
        while (distanciaPercorrida < FIM_PROVA){
            try {
                Thread.sleep(100);
                salto = aleatorioNaFaixa(1,3);
                System.out.println(this.nome + " " + this.quantidadePulos + "º Pulo" + " saltou: " + salto + " metros");
                distanciaPercorrida = distanciaPercorrida + salto;
                quantidadePulos ++;
            } catch (Exception e) {
            }
        }
    }

    public void mostraQuantidadePulos(){
        System.out.println(this.nome + " saltou: " + quantidadePulos);
    }

    public int getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public int getPosisao() {
        return posisao;
    }

    public void setPosisao(int posisao) {
        this.posisao = posisao;
    }


    public String getNome() {
        return nome;
    }

    public boolean isCorrendo() {
        return correndo;
    }

    public void setCorrendo(boolean correndo) {
        this.correndo = correndo;
    }
}
