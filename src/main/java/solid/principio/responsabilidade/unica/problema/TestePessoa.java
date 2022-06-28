package solid.principio.responsabilidade.unica.problema;

public class TestePessoa {

    public TestePessoa(Pessoa pessoa){
    }

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("José");
        p.save(p);
    }
}
