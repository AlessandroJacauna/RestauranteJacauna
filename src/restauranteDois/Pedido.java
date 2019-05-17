package restauranteDois;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Pedido {
	
		private int ordemPedido;
		private double total = 0;
		private List<Item> itens = new ArrayList<Item>();
		
		public Pedido(){
			getTotal();
		}
		
		public Pedido(List<Item> itens) {
			this.itens = itens;
			getTotal();
		}
		
	    public List<Item> getItens() {
	        return itens;
	    }
	    public Item getItem(int indice) {
	    	return itens.get(indice);
	    }
	    
	    public void adicionaItens(Item item) {
	    	this.itens.add(item);
	    }
	    
	    public void adicionaPrimeiroItem(Item item) {
	    	this.itens.set(0, item);
	    }
	    
	    public double getTotal() {
	    	for (Item item : itens) {
	    		this.total += item.getPreco();
			}
	    	return total;
	    }
	
	
		public int getOrdemPedido() {
			return ordemPedido;
		}
	
		public void setOrdemPedido(int ordemPedido) {
			this.ordemPedido = ordemPedido;
		}
		
	    @Override
	    public String toString() {
	    	return "\nPedido: " + itens + "Total: R$ " + String.format("%.2f", total);
	    }
	
}
