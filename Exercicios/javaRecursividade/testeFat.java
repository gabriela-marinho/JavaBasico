package gabriela.aprendizado.javaRecursividade;

public class testeFat {
    public static void main(String[] args) {

        int fatorialNaoRecursivo = Fatorial.fatorialNaoRecursivo(4);
        System.out.println(fatorialNaoRecursivo);

        int fatorial = Fatorial.fatorialRecursivo(4);
        System.out.println(fatorial);
    }

}
