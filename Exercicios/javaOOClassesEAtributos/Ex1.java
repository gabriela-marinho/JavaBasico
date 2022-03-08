package gabriela.aprendizado.javaOOClassesEAtributos;

public class Ex1 {
    public static void main(String[] args) {

        //INSTANCIA DA LAMPADA (objeto)
        //ATRIBUIÇÃO DE VALORES PARA SEUS ATRIBUTOS
        Lampada market = new Lampada();
        market.marca = "scott";
        market.tipo = new String[2]; //foi instanciado o array e sua quantidade e abaixo a posição e o q esta dentro do mesmo
        market.tipo[0]="led";
        market.quantidadeWatt = 9;
        market.cor = "branca";
        market.consumo =0.02;
        //market.ligada = true; feito via método.

        //CHAMANDO O METODO
        market.calcularConsumo();
        market.exibirDados();
        market.estado();

        market.ligar();
        if (market.ligada){
            System.out.println("A lampada esta ligada");

        }else{
            System.out.println("A lampada esta desligada");
        }
//
//
//        market.desligar();
//        if (market.ligada){
//            System.out.println("A lampada esta ligada");
//
//        }else{
//            System.out.println("A lampada esta desligada");
//        }

        //CRIEI UMA VARIAVEL COM UM TIPO
//        double valorConsumo = market.calcularConsumo();
//        System.out.println("o consumo é:" + valorConsumo);
//                            //OU
//        System.out.println("o consumo é:" + market.calcularConsumo());

        //double temperatura90 = market.calcularTemperatura(90);
        //double temperatura5 = market.calcularTemperatura(5);
        //double temperatura50 = market.calcularTemperatura(50) ;

        //System.out.println("temperatuta90 é:" +  temperatura90);
        //System.out.println("temperatuta5 é:" +  temperatura5);
        //System.out.println("temperatuta50 é:" +  temperatura50);


    }
}
