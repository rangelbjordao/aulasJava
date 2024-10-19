import Entidades.Servidor;
import Entidades.Usuario;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var novosUsuarios = new ArrayList<Usuario>();
        var novosServideos = new ArrayList<Servidor>();

        novosUsuarios.add(new Usuario("Alice"));
        novosUsuarios.add(new Usuario("Bob"));


        var servidorProgramacao = new Servidor("Programacao", new ArrayList<>(), new ArrayList<>());

//        for (var usuario : novosUsuarios) {
//            servidorProgramacao.adicionarUsuario(usuario);
//        }

        servidorProgramacao.adicionarUsuario(novosUsuarios.get(0));
        servidorProgramacao.adicionarUsuario(novosUsuarios.get(1));

        servidorProgramacao.enviarMensagem(novosUsuarios.get(0).getNome(), "Ola, pessoal", LocalDateTime.of(2024, 10, 19, 10, 9));
        servidorProgramacao.enviarMensagem(novosUsuarios.get(1).getNome(), "Ola, Alice", LocalDateTime.of(2024, 10, 20, 11, 12));

        System.out.println(servidorProgramacao.getMensagens());

        System.out.println(servidorProgramacao.getMensagensPorAutor("Alice"));

        System.out.println(servidorProgramacao.getMensagensPorPalavraChave("Alice"));

        System.out.println(servidorProgramacao.getMensagensOrdenadasPorData());

        System.out.println(servidorProgramacao.getMensagensOrdenadasPorAutor());

        System.out.println(servidorProgramacao.totalDeMensagens());
    }
}