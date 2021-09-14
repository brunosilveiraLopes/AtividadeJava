package calculadora;

public class Fornecedores {
	private String filial;
	private String endereco;
	private String nome;
	private String telefone;
	
	public Fornecedores(String filial, String endereco, String nome, String telefone) {
		this.filial = filial;
		this.endereco = endereco;
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public String getFilial() {
		return filial;
	}
	public String getEndereco() {
		return endereco;
	}
	public String getNome() {
		return nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setFilial(String filial) {
		this.filial = filial;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return String.format("Filial: %\tNome: %\tTelefone: %\tEndereco: %",this.filial,this.nome,this.telefone,this.endereco);
		
	}
	
}
