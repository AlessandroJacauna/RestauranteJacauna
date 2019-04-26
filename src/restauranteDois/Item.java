package restauranteDois;

public class Item {

		private String produto;
		private double preco;
		
		public Item(String produto, double preco) {
			this.produto = produto;
			this.preco = preco;
		}
		public String getProduto() {
			return produto;
		}
		public double getPreco() {
			return preco;
		}
		
		@Override
		public String toString() {
		return "[" + produto + " R$ " + String.format("%.2f", preco) + "]";
		}
		
}
