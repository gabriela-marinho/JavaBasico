package gabriela.aprendizado.javaExceptions;

public class UsandoException {
    public static void main(String[] args) {

        int[] num = {4, 8,10,15, 16, 32,40, 64, 128};
        int[] deno = {2, 0, 4, 8, 0,2,9,15};

        for (int i=0; i<num.length; i++){
            //try só pode ter um
            try{
                if(num[i] % 2 != 0){
                  //exception
                  throw new ContinuacaoUsandoException(num[i],deno[i]);
                }
                System.out.println(num[i] + "/" + deno[i] + " = " + (num[i]/deno[i]));
            }
            //catch  separado por | só a partir do java 7
            //prioridade sempre dos exceptions esoecificas catch
            catch(ArithmeticException | ArrayIndexOutOfBoundsException | ContinuacaoUsandoException e){
                System.out.println("Erro ");
                e.printStackTrace();
            }
           
        }

    }
}
