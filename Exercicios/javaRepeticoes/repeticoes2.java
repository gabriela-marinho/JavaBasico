package gabriela.aprendizado.javaRepeticoes;

import java.util.Scanner;

public class repeticoes2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean dadosCertos = false;
        //sempre declarar as variaveis fora do escopo.
        do {
            System.out.println("Digite um nome de usuario" );
            String nome = scan.next();

            System.out.println("Digite uma senha:" );
            String senha = scan.next();

            if(nome.equals(senha)){
                //dadosCertos = false; aqui a troca da flega la de cima tbm é true
                System.out.println("usuario e senha não podem ter o mesmo nome" );
            }else{
                dadosCertos = true;
                System.out.println("usuario e senha cadastrados" );
            }
        }
            while(!dadosCertos);

    }


    }