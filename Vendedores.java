package calculadora;

public class Vendedores {
	private String nome;
	private String cpf;
	private String rg;
	private String telefone;
	
	public Vendedores(String nome, String cpf, String rg, String telefone) {
		this.cpf = cpf;
		this.nome = nome;
		this.rg = rg;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getRg() {
		return rg;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return String.format("Nome: %\tCpf: %\tRG: %\tTelefone: %",this.nome,this.cpf,this.rg,this.telefone);
		
	}
	
}
