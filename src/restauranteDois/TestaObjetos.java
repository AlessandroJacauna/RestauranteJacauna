package restauranteDois;

import java.util.ArrayList;
import java.util.List;

public class TestaObjetos {

	public static void main(String[] args) {
		
		
		double total = 0;
		
		Item item1 = new Item("CocaCola", 5);
		Item item2 = new Item("Pepsi", 5);
		Item item3 = new Item("Jaca", 5);
		Item item4 = new Item("Fanta", 5);
		Item item5 = new Item("Acai", 10);
		
		List<Item> itens = new ArrayList<>();
		
		itens.add(item1);
		itens.add(item2);
		itens.add(item3);
		itens.add(item4);
		
		List<Item> itens2 = new ArrayList<>();
		itens2.add(item1);
		itens2.add(item2);
		itens2.add(item3);
		
		for (Item item : itens) {
    		total += item.getPreco();    
		}
		
		System.out.printf("%.2f", total);
		System.out.println();
		System.out.print(item3);
		System.out.print(item2);
		System.out.print(item1);
		System.out.println();
		
		System.out.println("-------------------------");
		
		List<Pedido> pedidos = new ArrayList<>();
		Pedido pedido1 = new Pedido(itens);
		Pedido pedido2 = new Pedido(itens2);
		Pedido pedido3 = new Pedido();
		pedidos.add(pedido1);
		pedidos.add(pedido2);
		pedidos.add(pedido3);
		
		System.out.println(pedido2);
		System.out.println(pedido1);
		System.out.println(pedidos + "PEDIDOS");
		
		System.out.println("----------------------------");
		
		List<Comanda> comandas = new ArrayList<>();
		Comanda comanda1 = new Comanda(5);
		comanda1.adicionaPedido(pedido1);
		Comanda comanda2 = new Comanda(2);
		comanda2.adicionaPedido(pedido2);
		System.out.println(comanda2);
		System.out.println(comanda1);
		System.out.println(comandas + "COMANDAS");
		System.out.println(comanda2.getPedidos());
		System.out.println(comanda2.getComanda());
		
	}
}
