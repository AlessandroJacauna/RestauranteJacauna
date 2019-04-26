package restauranteDois;

import java.util.ArrayList;
import java.util.List;

public class Comanda {
	
	private List<Pedido> pedidos = new ArrayList<>();
	private int comanda;
	
	public Comanda(int comanda) {
		
		this.comanda = comanda;
	}
	
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	
	public void adicionaPedido(Pedido pedido){
		this.pedidos.add(pedido);
	}
	
	@Override
	public String toString() {
		return "Comanda " + comanda + " Pedidos: " + pedidos;
	}
}
