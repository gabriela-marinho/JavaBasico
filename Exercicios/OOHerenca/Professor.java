package gabriela.aprendizado.OOHerenca;

public class Professor extends Pessoa  {

    private String nomecurso;
    private double salario;

    public void verificarAcesso(){

        this.nomeVisivel = "teste";
        super.nomeVisivel = "teste";

        super.setNomeVisivel("teste");
    }

    public String getNomecurso() {
        return nomecurso;
    }

    public void setNomecurso(String nomecurso) {
        this.nomecurso = nomecurso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double calSalario(){
        return 0;
    }
    public String obterEnderecoEtiqueta(){
        String e = "Endereço Professor:";
        e += this.getEndereco();
        return e;
    }
    public void mostrarEnd(){
        System.out.println(this.obterEnderecoEtiqueta());

    }
}
