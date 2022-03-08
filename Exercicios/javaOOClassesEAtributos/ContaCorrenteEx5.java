package gabriela.aprendizado.javaOOClassesEAtributos;

public class ContaCorrenteEx5 {
    int numero;
    double saldo;
    boolean status;
    double limite;

    double consultar() {
        double total = limite + saldo;

        double total1 = depositar(100) + total;

        return total1;
    }

    double depositar(double envelope) {
        double deposito = envelope;

        return deposito;

    }

    double sacar(double saque) {
        if (consultar() >= saque) {
            double retirada = consultar() - saque;

        }
        return saque;
    }

    double verificar() {
        if (saldo <= 500) {
            System.out.println("");

        }
        return saldo;
    }

}
