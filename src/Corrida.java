import java.util.ArrayList;
import java.util.List;

public class Corrida {

    public static void main(String[] args) {

        List<LebreDto> classificacao = new ArrayList<>();
        Lebre pernaLonga = new Lebre("Perna Longa", classificacao);
        Lebre sansao = new Lebre("Sansão", classificacao);
        Lebre coelhoPascoa = new Lebre("Coelho da Páscoa", classificacao);
        Lebre abel = new Lebre("Abel", classificacao);
        Lebre capitaoCenoura = new Lebre("Capitão Cenoura", classificacao);

        System.out.println("LARGADA.....");

        try {
            pernaLonga.getThread().join();
            sansao.getThread().join();
            coelhoPascoa.getThread().join();
            abel.getThread().join();
            capitaoCenoura.getThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nFim da prova, classificados: ");
        classificacao.forEach(Corrida::dados);
    }

    private static void dados(LebreDto lebreDto) {
        System.out.println(lebreDto.getPosicao() + "º " + lebreDto.getNomeLebre() + " total saltos de " + lebreDto.getTotalPulos());
    }
}
