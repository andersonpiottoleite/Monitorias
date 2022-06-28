package solid.principio.substituicao.liskov.resolucao;

public class TesteJogador {

    public static void main(String[] args) {
        Jogador jogador1 = new JogadorBom();
        jogador1.setNome("Messi");
        jogador1.setTime("PSG");
        jogador1.setIdade(36);
        jogador1.tocaBola();
        jogador1.corre();
        jogador1.dominaBola();
        ((JogadorBom) jogador1).aplicaCaneta();
        ((JogadorBom) jogador1).aplicaChapeu();
        ((JogadorBom) jogador1).aplicaElastico();
        // ((JogadorBom) jogador1).getHabilidadesEspeciais().aplicaCaneta();
        // ((JogadorBom) jogador1).getHabilidadesEspeciais().aplicaChapeu();
        // ((JogadorBom) jogador1).getHabilidadesEspeciais().aplicaElastico();
        jogador1.chuta();

        Jogador jogador2 = new JogadorPernaDePau();
        jogador2.setNome("Douglas");
        jogador2.setTime("São Paulo");
        jogador2.setIdade(35);
        jogador2.tocaBola();
        jogador2.corre();
        jogador2.dominaBola();
        jogador2.chuta();


    }
}
