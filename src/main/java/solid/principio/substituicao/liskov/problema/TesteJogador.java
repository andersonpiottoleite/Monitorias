package solid.principio.substituicao.liskov.problema;

public class TesteJogador {

    public static void main(String[] args) {
        Jogador jogador1 = new JogadorBom();
        jogador1.setNome("Messi");
        jogador1.setTime("PSG");
        jogador1.setIdade(36);
        jogador1.tocaBola();
        jogador1.corre();
        jogador1.dominaBola();
        jogador1.aplicaCaneta();
        jogador1.aplicaChapeu();
        jogador1.aplicaElastico();
        jogador1.chuta();

        Jogador jogador2 = new JogadorPernaDePau();
        jogador2.setNome("Douglas");
        jogador2.setTime("São Paulo");
        jogador2.setIdade(35);
        jogador2.tocaBola();
        jogador2.corre();
        jogador2.dominaBola();
        jogador2.aplicaCaneta();
        jogador2.aplicaChapeu();
        jogador2.aplicaElastico();
        jogador2.chuta();


    }
}
