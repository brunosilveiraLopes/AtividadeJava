package calculadora;

public class Transportadora {
	private String endereco;
	private String telefone;
	private String rastreamento;
	private String nome;
	
	public Transportadora(String endereco, String telefone, String rastreamento, String nome) {
		this.endereco = endereco;
		this.nome = nome;
		this.rastreamento = rastreamento;
		this.telefone = telefone;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getRastreamento() {
		return rastreamento;
	}
	public String getNome() {
		return nome;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void setRastreamento(String rastreamento) {
		this.rastreamento = rastreamento;
	}
	@Override
	public String toString() {
		return String.format("Nome: %\tRastreamento: %\tTelefone: %\tEndereco: %",this.nome,this.rastreamento,this.telefone,this.endereco);
		
	}
	
	
}
