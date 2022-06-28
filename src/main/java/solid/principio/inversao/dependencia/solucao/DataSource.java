package solid.principio.inversao.dependencia.solucao;

import java.sql.Connection;

public interface DataSource {

    Connection getConnection();
}
