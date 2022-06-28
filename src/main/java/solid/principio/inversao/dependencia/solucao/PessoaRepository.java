package solid.principio.inversao.dependencia.solucao;

public class PessoaRepository {

    private OracleDataSource oracleDataSource;

    public PessoaRepository(OracleDataSource oracleDataSource){
        this.oracleDataSource = oracleDataSource;
    }
    // ideal:
    /*private DataSource dataSource;

    public PessoaRepository(DataSource dataSource){
        this.dataSource = dataSource;
    }*/

}
