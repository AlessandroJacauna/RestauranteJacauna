package restauranteDois;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Pedido {
	
	private double total = 0;
	private List<Item> itens = new ArrayList<Item>();
	
	public Pedido(){		
	}
	
	public Pedido(List<Item> itens) {
		this.itens = itens;
		getTotal();
	}
	
    public List<Item> getItem() {
        return Collections.unmodifiableList(itens);
    }
    
    public void adicionaItens(Item itens) {
    	this.itens.add(itens);
    }
    
    public double getTotal() {
    	for (Item item : itens) {
    		this.total += item.getPreco();
		}
    	return total;

    }
    
    @Override
    public String toString() {
    	return "Pedido: " + itens + "Total: R$ " + String.format("%.2f", total) ;
    }

}
