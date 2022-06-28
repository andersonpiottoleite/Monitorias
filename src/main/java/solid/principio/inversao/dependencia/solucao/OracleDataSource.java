package solid.principio.inversao.dependencia.solucao;

import java.sql.Connection;

public class OracleDataSource implements DataSource{

    @Override
    public Connection getConnection() {
        return null;
    }
}
