import java.util.ArrayList;
import java.util.List;

public class Corrida {

    public static void main(String[] args) {


        Lebre pernaLonga = new Lebre("Perna Longa");
        Lebre sansao = new Lebre("Sansão");
        Lebre coelhoPascoa = new Lebre("Coelho da Páscoa");
        Lebre abel = new Lebre("Abel");
        Lebre capitaoCenoura = new Lebre("Capitão Cenoura");

        Thread tPernaLonga = new Thread(pernaLonga);
        Thread tSansao = new Thread(sansao);
        Thread tCoelhoDaPascoa = new Thread(coelhoPascoa);
        Thread tAbel = new Thread(abel);
        Thread tCapitaoCenoura = new Thread(capitaoCenoura);

        System.out.println("LARGADA.....");

        tPernaLonga.start();
        tCoelhoDaPascoa.start();
        tSansao.start();
        tAbel.start();
        tCapitaoCenoura.start();

        List<String> podio = new ArrayList<>();
        while(abel.isCorrendo() ||
              capitaoCenoura.isCorrendo() ||
              pernaLonga.isCorrendo() ||
              coelhoPascoa.isCorrendo() ||
              sansao.isCorrendo()) {

            if (!tAbel.isAlive() && abel.isCorrendo()) {
                podio.add(abel.getNome());
                abel.setCorrendo(false);

            }
            if (!tCapitaoCenoura.isAlive() && capitaoCenoura.isCorrendo()) {
                podio.add(capitaoCenoura.getNome());
                capitaoCenoura.setCorrendo(false);
            }
            if (!tPernaLonga.isAlive() && pernaLonga.isCorrendo()) {
                podio.add(pernaLonga.getNome());
                pernaLonga.setCorrendo(false);
            }

            if (!tCoelhoDaPascoa.isAlive() && coelhoPascoa.isCorrendo()) {
                podio.add(coelhoPascoa.getNome());
                coelhoPascoa.setCorrendo(false);
            }

            if (!tSansao.isAlive() && sansao.isCorrendo()) {
                podio.add(sansao.getNome());
                sansao.setCorrendo(false);
            }
        }

        System.out.println("\nPODIO");
        podio.forEach(System.out::println);



    }//main

}//class
