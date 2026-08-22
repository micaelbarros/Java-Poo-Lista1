public class main {
    public static void main(String[] args) {
        filme filme1 = new filme("Interestellar","Ficção Científica", 2014);
        filme filme2 = new filme("Toy Story","Animação", 1995);
        System.out.println(filme1.titulo + "  " + filme1.genero + "  " + filme1.anoLancamento);
        System.out.println(filme2.titulo + "  " + filme2.genero + "  " + filme2.anoLancamento);
    }
}
