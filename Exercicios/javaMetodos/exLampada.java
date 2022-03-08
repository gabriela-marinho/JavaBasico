package gabriela.aprendizado.javaMetodos;




public class exLampada {
    public static void main(String[] args) {

        //INSTANCIA DA LAMPADA (objeto)
        //ATRIBUIÇÃO DE VALORES PARA SEUS ATRIBUTOS
        //estou chamando o cosntrutor dessa classe
        LampadaMetodo market = new LampadaMetodo();
        market.setMarca("nome");
        market.setQuantidadeWatt (9);
        market.setCor("branca");
        market.setConsumo (0.02);
        market.isLigada();


    }
}
