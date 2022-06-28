package solid.principio.inversao.dependencia.problema;

public class PessoaRepository {

    private OracleDataSource oracleDataSource;

    public PessoaRepository(){
        this.oracleDataSource = new OracleDataSource();
    }
}
