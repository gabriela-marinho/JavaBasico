package gabriela.aprendizado.OOHerenca;

public class Aluno extends Pessoa{

    private String curso;
    private double[] notas;

    public void verificarAcesso(){

        this.nomeVisivel = "teste";
        super.nomeVisivel = "teste";

        super.setNomeVisivel("teste");
    }

    public Aluno() {
        super();
    }
    public Aluno(String nome, String endereco, String telefone, String curso) {
        super(nome, endereco, telefone);
        this.curso = curso;
    }


    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    public double calMedia(){
        return 0;
    }
    public boolean aprovacao(){
        return  true;
    }
    public String obterEnderecoEtiqueta(){
        String e = "Endereço Aluno:";
        e += this.getEndereco();
        return e;
    }

    public void mostrarEnd(){
            System.out.println("imprimindo aluno:");
            System.out.println(this.obterEnderecoEtiqueta());

    }
}
