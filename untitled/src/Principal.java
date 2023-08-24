import br.com.alura.screemmactch.calculos.CalculadoraDeTempo;
import br.com.alura.screemmactch.modelos.Filme;
import br.com.alura.screemmactch.modelos.Serie;


public class Principal {
    public static void main(String[] args) {
        //variavel que sabe se referenciar                  cria espaço na memoria, o objeto
        //        |                                                  |
        Filme meuFilme = new Filme();
// br.com.alura.screemmactch.br.com.alura.screemmactch.modelos.modelos.Filme é um modelo
// meuFilme é uma instancia do modelo br.com.alura.screemmactch.br.com.alura.screemmactch.modelos.modelos.Filme.
        System.out.println("-----------------------------------------------");

        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(188);
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Avaliaçoes: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Nota: " + meuFilme.pegaMedia());

        System.out.println("-----------------------------------------------");

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        System.out.println("-----------------------------------------------");

        Filme outrofilme = new Filme();
        outrofilme.setNome("avatar");
        outrofilme.setAnoDeLancamento(1982);
        outrofilme.setDuracaoEmMinutos(500);
        outrofilme.exibeFichaTecnica();
        //A classe filme autorizou que a classe principal pegasse o valor da classe filme:


        System.out.println("-----------------------------------------------");
        System.out.println("  ");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outrofilme);
        calculadora.inclui(lost);
//        System.out.println("* Tempo total de todos os filmes assistidos: " + calculadora.getTempoTotal() + " * ");

    }
}