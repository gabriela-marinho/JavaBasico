package gabriela.aprendizado.javaExceptions;

public class CatchJava7 {
    public static void main(String[] args) {

        int[] num = {4, 8, 16, 32, 64, 128};
        int[] deno = {2, 0, 4, 8, 0};

        for (int i=0; i<num.length; i++){
            //try só pode ter um
            try{
                System.out.println(num[i] + "/" + deno[i] + " = " + (num[i]/deno[i]));
            }
            //catch  separado por | só a partir do java 7
            //prioridade sempre dos exceptions esoecificas catch
            catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
                System.out.println("Erro ao dividir por zero");
            }

        }

    }
}
