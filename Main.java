package calculadora;

public class Main {
	
		public static void main(String[] args) {
			//Criando os objetos
			Clientes Clie = new Clientes("Bruno Silveira Lopes","224","980113334","888-222-333-11");
			Estoque Esto = new Estoque("Bruno Varejo","Hebert richard","Nike-adidas puma edition");
			Fornecedores Forn = new Fornecedores("Varejo Hebert","Fatimas rua 777","Hebert Richard","980321332");
			Produtos Prod = new Produtos("Camisa da nike com adidas","2.799$","Loja oficial Nike");
			Transportadora Trans = new Transportadora("Endereço Sedex","21 875523123","89K382AL2 19","Sedex");
			Vendas Ven = new Vendas("833.562.312.71","Silveira Bruno","Sistema da nike","11 3244012","276mil");
			Vendedores Vende = new Vendedores("323-414-666-49","Rodrigo farah","884721402","21 987753402");

			//Imprimir os dados
			System.out.printf(
					
					"O Cliente %s Realizou uma compra de %s no valor de %s. O produto estará disponivel no %s, e sera entregue pela transportadora %s",
				Clie.getNome(),Prod.getProduto(),Prod.getPreço(),Trans.getRastreamento(), Trans.getNome());
			
	}
}
