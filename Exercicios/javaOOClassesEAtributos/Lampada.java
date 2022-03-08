package gabriela.aprendizado.javaOOClassesEAtributos;

public class Lampada {
    //ATRIBUTOS
    String marca;
    String[] tipo;
    String cor;
    double quantidadeWatt;
    double consumo;
    boolean ligada;

    //MÉTODOS
    //VOID: não retorna nada
    //DOUBLE(QLQ TIPO) : tem retorno.

        void ligar(){
            ligada = true;
        }
        void desligar(){
            ligada = false;
    }
        void estado(){
            if (ligada){
                System.out.println("A lampada esta ligada,pelo metodo estado");
            }else{
                System.out.println("A lampada esta desligada, pelo metodo estado");
            }
        }
        void exibirDados(){

            System.out.println("A marca é" + marca);
        }

        double calcularConsumo (){

            System.out.println("Método calcularConsumo foi chamado");
            return quantidadeWatt * consumo;
        }



}
