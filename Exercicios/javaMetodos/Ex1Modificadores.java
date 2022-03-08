package gabriela.aprendizado.javaMetodos;

public class Ex1Modificadores {

    static void imprimiVl(){
        System.out.println(Contador.terValor());
    }
    public static void main(String[] args) {

        imprimiVl();
        Contador.incrementar();
        imprimiVl();
        Contador.zerar();
        imprimiVl();

        Contador.incrementar();
        Contador.incrementar();
        Contador.incrementar();

        imprimiVl();

        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();

        imprimiVl();

    }
}
