package calculadora;

public class Main {

	public static void main(String[] args) {
		//Criando os objetos
		Clientes Clie = new Clientes();
		Estoque Esto = new Estoque();
		Fornecedores Forn = new Fornecedores();
		Produtos Prod = new Produtos();
		Transportadora Trans = new Transportadora();
		Vendas Ven = new Vendas();
		Vendedores Vende = new Vendedores();
		
		//Popular os dados
		Clie.nomeCompleto = "Bruno Silveira Lopes";
		Clie.cpf = "888-888-888-33";
		
		Esto.nomeDoProduto = "Camiseta da Nike(Premium)";
		Esto.filial = "Nike-OFICIAL";
		
		Forn.endereco = "Rua taramram 255";
		Forn.filial = "Nikezinha";
		
		Prod.produto = "Air Jordan Edition Travis Scott";
		Prod.preço = " $4.750 dollares";
		
		Trans.rastreamento = "K3782K9182 90";
		Trans.endereco = "Correio SEDEX";
		
		Ven.sistema = "Sistema da Empresa Nike";
		Ven.nomeCompleto = "Silveira lopes Bruno";
		
		Vende.cpf = "777-666-444-20";
		Vende.nomeCompleto = "Silveira Lopes Bruno";
		
		//Imprimir os dados
		System.out.printf("O senhor %s do cpf %s gostaria de saber se tem em estoque o produto %s da filial %s. depois ele gostaria de comprar"
				+ "o produto %s pelo preço de %s, e perguntou sobre a transportada e o endereco dos fornecedores %s, %s, %s e o rastreamento dela %s para saber por onde anda o produto,"
				+ "o Vendedor do Senhor %s foi o %s do cpf %s, é só ver a venda no sistema %s e o nome dele %s.", Clie.nomeCompleto,Clie.cpf,
				Esto.nomeDoProduto,Esto.filial,Prod.produto,Prod.preço,Forn.endereco,Forn.filial,Trans.endereco,Trans.rastreamento,Clie.nomeCompleto,Vende.nomeCompleto,Vende.cpf,Ven.sistema,Ven.nomeCompleto);
	}

}
