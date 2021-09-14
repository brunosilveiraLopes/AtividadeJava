package calculadora;

public class Estoque {
	private String filial;
	private String nome;
	private String nomeDoProduto;
	
	public Estoque(String filial, String nome, String nomeDoProduto) {
		this.filial = filial;
		this.nome = nome;
		this.nomeDoProduto = nomeDoProduto;
	}
	
	public String getFilial() {
		return filial;
	}
	public String getNome() {
		return nome;
	}
	public String getNomeDoProduto() {
		return nomeDoProduto;
	}
	public void setFilial(String filial) {
		this.filial = filial;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}
	
	@Override
	public String toString() {
		return String.format("Filial: %\tNome: %\tNomeDoProduto: %s",this.filial,this.nome,this.nomeDoProduto);
	}
	
	
}

