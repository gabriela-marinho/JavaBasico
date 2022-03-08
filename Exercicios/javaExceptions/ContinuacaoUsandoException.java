package gabriela.aprendizado.javaExceptions;

public class ContinuacaoUsandoException  extends Exception{
    protected int numerador;
    protected int denominador;

    public ContinuacaoUsandoException(int numerador, int denominador){
        super();
        this.numerador = numerador;
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return "Resulto" + numerador + "/" + denominador + "não é inteiro";
    }
}
