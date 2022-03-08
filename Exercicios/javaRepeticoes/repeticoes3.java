package gabriela.aprendizado.javaRepeticoes;

import java.util.Scanner;

public class repeticoes3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean dadosValidos = false;
        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        do {

            System.out.println("Entre com o nome:");

            nome = scan.next();

            if (nome.length() >= 3){
                dadosValidos = true;
            } else {
                System.out.println("Nome precisa no mínimo 3 caracteres.");
            }
        } while (!dadosValidos);

        do {

            System.out.println("Entre com a idade:");

            idade = scan.nextInt();

            if (idade<= 150){
                dadosValidos = true;
            } else {
                System.out.println("idade entre 0 e 150");
            }
        } while (!dadosValidos);

        do {

            System.out.println("Entre com o salário:");

            salario = scan.nextDouble();

            if (salario > 0){
                dadosValidos = true;
            } else {
                System.out.println("Salário precisa ser maior que 0.");
            }
        } while (!dadosValidos);


        dadosValidos = false;

        do {

            System.out.println("Entre com o sexo:");

            sexo = scan.next();

            if (sexo.equalsIgnoreCase("f") ||
                    sexo.equalsIgnoreCase("m")){
                dadosValidos = true;
            } else {
                System.out.println("Sexo precisa ser 'f' ou 'm'.");
            }
        } while (!dadosValidos);

        do {

            System.out.println("Entre com o estado civil:");

            estadoCivil = scan.next();

            if (estadoCivil.equalsIgnoreCase("s") ||
                    estadoCivil.equalsIgnoreCase("c") ||
                    estadoCivil.equalsIgnoreCase("v") ||
                    estadoCivil.equalsIgnoreCase("d")){
                dadosValidos = true;
            } else {
                System.out.println("Estado civil precisa ser 's', 'c', 'v' ou 'd'.");
            }
        } while (!dadosValidos);



        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);
    }
}
