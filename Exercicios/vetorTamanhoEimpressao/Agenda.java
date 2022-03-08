package gabriela.aprendizado.estruturadados.vetorTamanhoEimpressao;

public class Agenda {
		//VARIAVEIS
	private String nome;
	private String telefone;
	private  String endereco;
	
	//CONSTRUTOR VAZIO ,DA SUPERCLASSE OBJECT
	public Agenda() {}
	
	//CONSTRUTOR COM PARAMETROS
	public Agenda(String nome, String telefone, String endereco) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	//METODOS GETS E SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Agenda [nome=" + nome + ", telefone=" + telefone + ", endereco=" + endereco + "]";
	}
	
	
	
}
