public class LebreDto {

    private String nomeLebre;
    private int posicao;
    private int totalPulos;

    public LebreDto(String nomeLebre, int posicao, int totalPulos) {
        this.nomeLebre = nomeLebre;
        this.posicao = posicao;
        this.totalPulos = totalPulos;
    }

    public String getNomeLebre() {
        return nomeLebre;
    }

    public int getPosicao() {
        return posicao;
    }

    public int getTotalPulos() {
        return totalPulos;
    }
}

