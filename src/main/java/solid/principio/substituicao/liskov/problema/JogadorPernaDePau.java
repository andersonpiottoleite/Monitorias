package solid.principio.substituicao.liskov.problema;

public class JogadorPernaDePau extends Jogador{

    public void aplicaChapeu(){
    }

    public void aplicaCaneta(){
    }

    public void aplicaElastico(){
       throw new PipoqueiroException("Não sei dar elastico");
    }
}
