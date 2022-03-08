package gabriela.aprendizado.javaRecursividade;

public class Ex1Fibonacci {
    public static int fibonacci(int num){

        if (num<2){
            return 1;
        }
        return fibonacci(num-1 + fibonacci(num-2));
    }
    public static int soma(int num){

        if (num == 1){
            return 1;
        }

        return num + soma(num-1);
    }
}
