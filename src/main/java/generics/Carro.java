package generics;

public class Carro implements Comparable<Carro>{

    public Carro(String nome, int velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Carro() {
    }



    private String nome;
    private int velocidadeMaxima;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    @Override
    public int compareTo(Carro carro) {
        if (this.velocidadeMaxima > carro.getVelocidadeMaxima()){
            return  1;
        }

        if (this.velocidadeMaxima < carro.getVelocidadeMaxima() ){
            return  -1;
        }
        return 0;
    }

    public void outroMetodo(String s1, String s2) throws RuntimeException{

    }
}
