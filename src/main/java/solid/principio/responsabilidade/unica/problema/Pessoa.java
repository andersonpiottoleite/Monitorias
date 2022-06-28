package solid.principio.responsabilidade.unica.problema;

public class Pessoa {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void save(Pessoa pessoa){
        System.out.println("Pessoa cadastrada com sucesso");
    }

}
