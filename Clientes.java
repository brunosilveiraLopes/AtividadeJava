package calculadora;

public class Clientes {
	private String nome;
	private String numero;
	private String telefone;
	private String cpf;
	
	public Clientes(String nome, String telefone, String cpf, String numero) {
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public String getNumero() {
		return numero;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return String.format("Nome: %\tTelefone: %\tEndereco: %sNumero: %s",this.nome,this.telefone,this.cpf);
	}
	
	
}
