package solid.principio.substituicao.liskov.problema;

public class JogadorBom extends Jogador{

    public void aplicaChapeu(){
        System.out.println("Jogador bom aplicando chapeu");
    }

    public void aplicaCaneta(){
        System.out.println("Jogador bom aplicando caneta");
    }

    public void aplicaElastico(){
        System.out.println("Jogador bom aplicando elastico");
    }
}
