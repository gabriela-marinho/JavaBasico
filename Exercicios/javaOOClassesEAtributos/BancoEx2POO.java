package gabriela.aprendizado.javaOOClassesEAtributos;

public class BancoEx2POO {
    public static void main(String[] args) {
        ContaCorrenteEx5 operacoes = new ContaCorrenteEx5();
        operacoes.status = false;
        operacoes.numero = 123456;
        operacoes.limite = 1000;
        operacoes.saldo =  500;

        //CHAMANDO OS MÉTODOS:

        operacoes.consultar();
        //operacoes.depositar();

        double saldo = operacoes.consultar();
        System.out.println("Seu saldo é R$:" + " " + saldo);

        double deposito1 = operacoes.depositar(100);

        double saque = operacoes.sacar(500);

        System.out.println("Vc recebeu um deposito de R$:" + " "+ deposito1);
        System.out.println("Vc realizou um saque de R$:" + " "+ saque);

    }
}
