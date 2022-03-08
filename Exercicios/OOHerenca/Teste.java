package gabriela.aprendizado.OOHerenca;

public class Teste {
    public static void main(String[] args){
        //Pessoa pessoa = new Pessoa();

        Pessoa aluno = new Aluno();

        Pessoa professor = new Professor();

        //pessoa.setEndereco("ruas das flores,178");
        aluno.setEndereco("ruas das amarelinhas,1789");
        professor.setEndereco("ruas das acacias,18");

//        System.out.println(pessoa.obterEnderecoEtiqueta());
//        System.out.println(aluno.obterEnderecoEtiqueta());
//        System.out.println(professor.obterEnderecoEtiqueta());

        aluno.mostrarEnd();
        professor.mostrarEnd();
     }
}
