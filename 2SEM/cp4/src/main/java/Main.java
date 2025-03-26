import ccr.tdspa.repositories.FuncionarioRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Sistema iniciando...");

        var funcionarioRepository = new FuncionarioRepository();
        funcionarioRepository.menu(funcionarioRepository);

        logger.info("Sistema finalizando...");
    }
}

