package solid.principio.substituicao.liskov.resolucao;

public class JogadorBom extends Jogador implements HabilidadesEspeciaisInterface{

    public void aplicaChapeu(){
        System.out.println("aplicando chapeu");
    }

    public void aplicaCaneta(){
        System.out.println("aplicando caneta");
    }

    public void aplicaElastico(){
        System.out.println("aplicando elastico");
    }




    /* com composição
    private HabilidadesEspeciais habilidadesEspeciais;

    public JogadorBom(){
        this.habilidadesEspeciais = new HabilidadesEspeciais();
    }

    public HabilidadesEspeciais getHabilidadesEspeciais() {
        return habilidadesEspeciais;
    }

    public void setHabilidadesEspeciais(HabilidadesEspeciais habilidadesEspeciais) {
        this.habilidadesEspeciais = habilidadesEspeciais;
    }*/
}
