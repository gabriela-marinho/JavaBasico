package gabriela.aprendizado.OOHerenca;

public abstract class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;

    protected String nomeVisivel;

    public Pessoa(){
            nomeVisivel = "teste";
    }
    public Pessoa(String nome, String endereco, String telefone) {
        super();
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setNomeVisivel(String nomeVisivel) {
        this.nomeVisivel = nomeVisivel;
    }
    public String obterEnderecoEtiqueta(){

        return endereco;
    }

    public abstract void mostrarEnd();

}
