package restauranteDois;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestaObjetos2 {

	public static void main(String[] args) {
		List<Mesa> listaMesaTeste = new ArrayList<>();
//		Mesa mesaTeste = new Mesa(10);
//		listaMesaTeste.add(mesaTeste);
//		System.out.println(listaMesaTeste.get(0));
//		System.out.println("------------------");
//		
//		
//		List<Comanda> listaComandaTeste = new ArrayList<>();		
//		Comanda comanda1 = new Comanda();
//		Comanda comanda2 = new Comanda();
//		listaComandaTeste.add(comanda1);
//		listaComandaTeste.add(comanda2);
//		System.out.println(listaComandaTeste);
//		System.out.println(listaComandaTeste.get(0)); 		//imprimir esse depois
//		System.out.println("------------------");
//			
//		List<Pedido> listaPedidoTeste = new ArrayList<>();
//		Pedido pedido1 = new Pedido();
//		Pedido pedido2 = new Pedido();
//		listaPedidoTeste.add(pedido1);
//		listaPedidoTeste.add(pedido2);
//		System.out.println(listaPedidoTeste);
//		
//		Item item1 = new Item("CocaCola", 5);
//		Item item2 = new Item("Pepsi", 5);
//		Item item3 = new Item("Jaca", 5);
//		Item item4 = new Item("Fanta", 5);
//		Item item5 = new Item("Acai", 10);
//		System.out.println("------------------");
//
//		
//		listaPedidoTeste.get(0).adicionaItens(item1);
//		listaPedidoTeste.get(0).adicionaItens(item2);
//		listaPedidoTeste.get(1).adicionaItens(item3);
//		listaPedidoTeste.get(1).adicionaItens(item4);
//		System.out.println("-----LISTA DE PEDIDOS-----");
//		System.out.println(listaPedidoTeste);
//		System.out.println(pedido1 + " <----------------PEDIDO 1");
//		
//		System.out.println("-----------------------------------");
//		listaComandaTeste.get(0).adicionaPedido(listaPedidoTeste.get(0));
//		System.out.println(listaComandaTeste);
//		
//		System.out.println(pedido1);
		
		Scanner sc = new Scanner(System.in);
		List<Mesa> restaurante = new ArrayList<>();	
		int comando = 0;

		for(int i = 0; i < 10; i++) {
			restaurante.add(null);
			//			System.out.println("null adicionado: " + i);
		}
		List<Pedido> pedidos = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			pedidos.add(null);
			//			System.out.println("null adicionado: " + i);
		}
		List<Comanda> comandas = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			comandas.add(null);
			//			System.out.println("null adicionado: " + i);
		}
		
		List<Item> itens = new ArrayList<>();
	
		
		Item item1 = new Item("Coca-cola", 6);
		Item item2 = new Item("Pepsi", 5);
		Item item3 = new Item("Fanta", 5);
		Item item4 = new Item("Cachorro-quente", 10);
		Item item5 = new Item("X-Tudo", 15);
		Item item6 = new Item("Açaí", 10);
		itens.add(item1);
		itens.add(item2);
		itens.add(item3);
		itens.add(item4);
		itens.add(item5);
		itens.add(item6);	
		
		
		Pedido pedido1 = new Pedido();
		Pedido pedido2 = new Pedido();
		Pedido pedido3 = new Pedido();

		Comanda comanda1 = new Comanda(1);
	//	comanda1.adicionaPedido(pedido1);
		System.out.println(comanda1);
		
		System.out.println("---------------");
		
		Mesa mesa1 = new Mesa(1, 5);
		Mesa mesa2 = new Mesa(2, 7);
		
		System.out.println(mesa1);
		System.out.println(mesa2);
		
		System.out.println("---------------");
		
		Comanda comanda2 = new Comanda(2);
		Comanda comanda3 = new Comanda(3);
		
		System.out.println(comanda2);
		System.out.println(comanda3);
		
		mesa1.adicionaComandas(comanda1);
		mesa1.adicionaComandas(comanda2);
		mesa1.adicionaComandas(comanda3);
		
		System.out.println(mesa1);
		System.out.println(mesa2);

		pedido1.adicionaItens(item1);
		pedido1.adicionaItens(item2);
		pedido1.adicionaItens(item3);
		pedido2.adicionaItens(item4);
		pedido3.adicionaItens(item5);
		pedido3.adicionaItens(item6);
		
		
		comanda1.adicionaPedido(pedido1);
		comanda1.adicionaPedido(pedido3);
		comanda3.adicionaPedido(pedido2);
		mesa1.adicionaComandas(comanda1);
		mesa1.adicionaComandas(comanda3);
		
		System.out.println("======================");
		System.out.println(mesa1);

	}

}
