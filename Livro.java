public class Livro {

    String titulo;
    int anoPublicacao;
    Autor autor;

    public Livro(String titulo, int anoPublicacao, Autor autor) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Título: " + titulo +
               "\nAno de publicação: " + anoPublicacao +
               "\n" + autor;
    }
}