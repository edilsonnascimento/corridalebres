import java.util.ArrayList;
import java.util.List;

public class Lebre implements Runnable{

    private Thread thread;
    public List<LebreDto> classificacao;
    private static int posicao = 1;

    public Lebre(String nomeLebre, List<LebreDto> classificacao) {
        thread = new Thread(this, nomeLebre);
        thread.start();
        this.classificacao = classificacao;
        System.out.println(nomeLebre + " Preparado....");
    }

    @Override
    public void run() {
        int distanciaPercorrida = 0;
        int pulos = 0;
        int quantidadePulos = 1;
        while(distanciaPercorrida < 20){
            pulos = Pulo.aleatorio();
            distanciaPercorrida += pulos;
            System.out.println(this.getThread().getName() + " " + quantidadePulos + "º salto foi " + pulos + "m, com um total percorrido de " + distanciaPercorrida +"m");
            quantidadePulos++;
        }
        classificacao.add(new LebreDto(thread.getName(), posicao++, quantidadePulos));
    }

    public Thread getThread() {
        return thread;
    }

}
