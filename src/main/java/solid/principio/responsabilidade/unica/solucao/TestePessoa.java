package solid.principio.responsabilidade.unica.solucao;

public class TestePessoa {

    public static void main(String[] args) {
       Pessoa p = new Pessoa();
        p.setNome("José");

        PessoaRepository repository = new PessoaRepository();
        repository.save(p);
    }
}
