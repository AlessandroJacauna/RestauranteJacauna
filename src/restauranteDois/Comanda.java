package restauranteDois;

import java.util.ArrayList;
import java.util.List;

public class Comanda {
	
	private List<Pedido> pedidos = new ArrayList<>();
	private int comanda;
	
	public Comanda() {
	}
	
	public Comanda(int comanda) {
		
		this.comanda = comanda;
	}
	
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	
	public void adicionaPedido(Pedido pedido){
		this.pedidos.add(pedido);
	}
	
	public int getComanda() {
		return comanda;
	}
	
	public void fecharComanda() {
		for (int i = 0; i < pedidos.size(); i++) {
			System.out.println("Comanda " + (i+1) + ": ");
			System.out.println(pedidos.get(i));
			
		}
		
	}
	@Override
	public String toString() {
		return "Comanda " + comanda + " Pedidos: " + pedidos;
	}
}
