package solid.principio.substituicao.liskov.problema;

public class Jogador {

    private String nome;
    private String time;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void tocaBola(){
        System.out.println("Tocando a bola");
    }

    public void dominaBola(){
        System.out.println("Dominando a bola");
    }

    public void chuta(){
        System.out.println("Chutando a bola");
    }

    public void corre(){
        System.out.println("Correndo");
    }

    public void aplicaChapeu(){
        System.out.println("aplicando chapeu");
    }

    public void aplicaCaneta(){
        System.out.println("aplicando caneta");
    }

    public void aplicaElastico(){
        System.out.println("aplicando elastico");
    }
}
