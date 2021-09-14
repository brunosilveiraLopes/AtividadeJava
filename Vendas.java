package calculadora;

public class Vendas {
	private String valores;
	private String sistema;
	private String nome;
	private String cpf;
	private String telefone;
	
	public Vendas(String valores, String sistema, String nome, String cpf, String telefone) {
		this.cpf = cpf;
		this.nome = nome;
		this.sistema = sistema;
		this.telefone = telefone;
		this.valores = valores;
	}
	
	public String getValores() {
		return valores;
	}
	public String getSistema() {
		return sistema;
	}
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setValores(String valores) {
		this.valores = valores;
	}
	public void setSistema(String sistema) {
		this.sistema = sistema;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return String.format("Valores: %\tSistema: %\tNome: %\tCpf: %",this.valores,this.sistema,this.nome,this.cpf);
		
	}
	
}
