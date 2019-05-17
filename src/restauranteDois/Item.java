package restauranteDois;

import java.util.ArrayList;
import java.util.List;

public class Item {

		private String produto;
		private double preco;
		private int keyProduto;
		private static int totalProdutos = 1;
		
		public Item(String produto, double preco) {
			this.produto = produto;
			this.preco = preco;
			keyProduto = totalProdutos;
			totalProdutos++;
			
			
		}
		public String getProduto() {
			return produto;
		}
		public double getPreco() {
			return preco;
		}

		@Override
		public String toString() {
		return keyProduto + " - " + produto + " R$ " + String.format("%.2f", preco);
		}
		
}
