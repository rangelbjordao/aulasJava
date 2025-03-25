package ccr.tdspa.infrastructure;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AplicationTestConfig {

    public static Logger logger = LogManager.getLogger(AplicationTestConfig.class);

    private static final String DB_URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
    private static final String DB_USER = "rm560547";
    private static final String DB_PASSWORD = "270900";

    public static void testAplication(String[] args) {
        if (checkDatabaseConnection()) {
            logger.info("Todos os testes passaram. Iniciando a aplicação...");
        } else {
            logger.error("Um ou mais testes falharam. Por favor resolva os erros e tente novamente.");
        }
    }

    private static boolean checkDatabaseConnection() {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            if (connection != null) {
                logger.info("Conexão com o banco de dados estabelecida com sucesso.");
                return true;
            }
        } catch (SQLException e) {
            logger.error("Erro ao conectar com o banco de dados: {}", e.getMessage());
        }
        return false;
    }
}