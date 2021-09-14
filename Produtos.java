package calculadora;

public class Produtos {
	private String produto;
	private String preço;
	private String local;
	
	public Produtos(String produto, String preço, String local) {
		this.produto = produto;
		this.preço = preço;
		this.local = local;
	}
	
	public String getProduto() {
		return produto;
	}
	public String getPreço() {
		return preço;
	}
	public String getLocal() {
		return local;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public void setPreço(String preço) {
		this.preço = preço;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	@Override
	public String toString() {
		return String.format("Produto: %\tPreço: %\tLocal: %\t",this.produto,this.preço,this.local);
		
	}
}	
