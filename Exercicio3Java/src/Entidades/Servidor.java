package Entidades;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Servidor {
    private String nome;
    private List<Usuario> usuarios;
    private List<Mensagem> mensagens;

    public void adicionarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public void removerUsuario(Usuario usuario){
        usuarios.remove(usuario);
    }

    public void enviarMensagem(String autor, String conteudo, LocalDateTime data) {
        mensagens.add(new Mensagem(autor, conteudo, data));
    }

    public List<Mensagem> getMensagensPorAutor(String autor) {
        return mensagens.stream()
                .filter(mensagem -> mensagem.getAutor().equals(autor))
                .toList();
    }

    public List<Mensagem> getMensagensPorPalavraChave(String palavra) {
        return mensagens.stream()
                .filter(mensagem -> mensagem.getConteudo().contains(palavra))
                .toList();
    }

    public List<Mensagem> getMensagensOrdenadasPorData() {
        return mensagens.stream()
                .sorted(Comparator.comparing(Mensagem::getData))
                .toList();
    }

    public List<Mensagem> getMensagensOrdenadasPorAutor() {
        return mensagens.stream()
                .sorted(Comparator.comparing(Mensagem::getAutor))
                .toList();
    }

    public int totalDeMensagens() {
        return mensagens.size();
    }

    public Servidor() {
    }

    public Servidor(String nome, List<Usuario> usuarios, List<Mensagem> mensagens) {
        this.nome = nome;
        this.usuarios = usuarios;
        this.mensagens = mensagens;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Mensagem> getMensagens() {
        return mensagens;
    }

    public void setMensagens(List<Mensagem> mensagens) {
        this.mensagens = mensagens;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Servidor servidor = (Servidor) o;
        return Objects.equals(getNome(), servidor.getNome()) && Objects.equals(getUsuarios(), servidor.getUsuarios()) && Objects.equals(getMensagens(), servidor.getMensagens());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getUsuarios(), getMensagens());
    }

    @Override
    public String toString() {
        return "Servidor{" +
                "nome='" + nome + '\'' +
                ", usuarios=" + usuarios +
                ", mensagens=" + mensagens +
                '}';
    }
}