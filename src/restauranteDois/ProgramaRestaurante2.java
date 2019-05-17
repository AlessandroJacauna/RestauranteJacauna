package restauranteDois;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaRestaurante2 {



	public static void main(String[] args) {
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
		
		
//		Pedido pedido1 = new Pedido();
//		Comanda comanda1 = new Comanda(1);
//		comanda1.adicionaPedido(pedido1);
//		System.out.println(comanda1);
//		pedido1.adicionaItens(item1);
//		pedido1.adicionaItens(item4);

//		for(int i = 0; i < itens.size(); i++) {
//			System.out.println((i + 1) + "- " + itens.get(i));
//		}

		while (comando != 5) {

			System.out.println("=================================");
			System.out.println("MENU");
			System.out.println("1 - Mesa.");
			System.out.println("2 - Comandas.");
			System.out.println("3 - Pedido.");
			System.out.println("4 - Item.");
			System.out.println("5 - Sair.");

			System.out.print("Selecione uma opção: ");

			comando = sc.nextInt();

			if(comando < 1 | comando > 5) {
				System.out.println("--------COMANDO INVÁLIDO--------");
				System.out.println();				
			}

			if(comando == 1) {  //Mesa
				System.out.println("=================================");
				System.out.println("O que deseja fazer?");
				System.out.println("1 - Adicionar mesa.");
				System.out.println("2 - Consultar mesa.");
				System.out.println("3 - Fechar comanda");
				int opcaoMesa = sc.nextInt();

				if(opcaoMesa == 1) {
					System.out.println("=================================");
					System.out.println("Qual o número da mesa?");
					int novoNumeroMesa = sc.nextInt();
					System.out.println("Quantos clientes?");
					int quantosCliente = sc.nextInt();
					Mesa mesa = new Mesa(novoNumeroMesa, quantosCliente);
					restaurante.set(mesa.getNumeroMesa() -1, mesa);
					System.out.println(restaurante);

				} else
					if(opcaoMesa == 2) {
						System.out.println("=================================");
						System.out.println("Qual mesa deseja consultar?");
						int mesaParaConsulta = sc.nextInt();
						System.out.println(restaurante.get(mesaParaConsulta - 1));

					} else
						if(opcaoMesa == 3) {
							System.out.println("Qual mesa?");
							int fecharComanda = sc.nextInt();
							System.out.println(restaurante.get(fecharComanda - 1));

						} else {
							System.out.println("Opção inválida");
						}			
			}

			if(comando == 2) {//Comandas
				int comanda = 1;
				System.out.println("1 - Nova Comanda.");
				System.out.println("2 - Adicionar pedido.");
				System.out.println("3 - Consultar comanda.");
				System.out.println("4 - Fechar comanda.");
				System.out.println("Selecione uma opção: ");

				comanda = sc.nextInt();

				while (comanda < 1 | comanda > 7) {
					System.out.println("--------COMANDO INVÁLIDO--------");
					System.out.println("Selecione uma opção: ");
					System.out.println("1 - Nova Comanda.");
					System.out.println("2 - Adicionar pedido.");
					System.out.println("3 - Consultar comanda.");
					System.out.println("4 - Fechar comanda.");
					System.out.println("6 - Voltar.");				
					comanda = sc.nextInt();		
					System.out.println();		
				}
				
				if(comanda == 1) {
					System.out.println();
					System.out.println("Selecione a mesa e a comanda para ser atualizada... ");
					System.out.print("Mesa: ");
					int indiceMesa = sc.nextInt();					
					System.out.println();	
					Mesa mesaSelecionada = restaurante.get(indiceMesa - 1);
					System.out.println("Qual o número da comanda? ");
					int indiceComanda = sc.nextInt();
					Comanda novaComanda = new Comanda(indiceComanda);
					mesaSelecionada.adicionaComandas(novaComanda);
					System.out.println("Mesa Selecionada" + mesaSelecionada);
					System.out.println("Nova Comanda" + novaComanda);

				}

				if(comanda == 2) {
					System.out.println("Selecione a mesa e a comanda para ser atualizada... ");
					System.out.print("Mesa: ");
					int indiceMesa = sc.nextInt();
					
					System.out.println();
					System.out.print("Comanda: ");
					int indiceComanda = sc.nextInt();	
					Mesa mesaSelecionada = restaurante.get(indiceMesa - 1);
					Comanda comandaSelecionada = new Comanda();
					comandaSelecionada = comandas.get(indiceComanda - 1);
					Pedido pedidoSelecionado = new Pedido();
					pedidoSelecionado = pedidos.get(indiceComanda - 1);
										
					char adicionadorDePedidos = 's';
					
					while(adicionadorDePedidos != 'n') {
						System.out.println("Adicione o(s) pedido(s)... ");
						System.out.println(itens);
						int selecionadorDeItem = sc.nextInt();
						Pedido pedido = new Pedido();
						pedidoSelecionado.adicionaItens(itens.get(selecionadorDeItem - 1));
						System.out.println("Produto selecionado: " + pedidoSelecionado);

						
						
						System.out.println("Adicionar mais pedidos? s/n");
						adicionadorDePedidos = sc.next().charAt(0);
						

					}
					System.out.println("Mesa Selecionado");
					System.out.println(mesaSelecionada);
					System.out.println("Comanda Selecionado");
					System.out.println(comandaSelecionada);
					System.out.println("Pedido Selecionado");
					System.out.println(pedidoSelecionado);
					restaurante.set((mesaSelecionada.getNumeroMesa() -1), mesaSelecionada); //adiciona a mesa com a nova comanda no list Restaurante
					
					
	//				------------------------------------------------------------
	
					
//					Comanda comandaTeste = new Comanda(indiceComanda);			
//					comandas.set((mesaSelecionada.getNumeroMesa() - 1), comandaTeste);
//					System.out.println(restaurante);
//					System.out.println(comandas);
//					System.out.println(restaurante.get(mesaSelecionada.getNumeroMesa() - 1));
//					System.out.println("Quais produtos deseja adicionar?");
//					int pedidosParaAdicionar = sc.nextInt();
//					
//					comandaTeste.adicionaPedido(pedidos.get(0));

				} else 
					if(comanda == 3) {

					} else			
						if(comanda == 4) {

						} else
							if (comanda == 5){

							} else
								if (comanda == 6) {

								} else {
									
								}

			}
			
			if(comando == 3) { //Pedidos
				System.out.println("=================================");
				System.out.print("Inserir pedido para a mesa: ");
				int numeroDaMesa = sc.nextInt();
				System.out.println();
				System.out.print("Número da Comanda: ");
				int numeroDaComanda = sc.nextInt();
				System.out.println();
				
				int numeroDoItem = 1;
				while(numeroDoItem >= 1 && numeroDoItem < 7) {
					System.out.println("=================================");
					System.out.println("Quais itens deseja adiccionar?");
					System.out.println("1 - Coca-Cola");
					System.out.println("2 - Pepsi");
					System.out.println("3 - Fanta");
					System.out.println("4 - Cachorro-Quente");
					System.out.println("5 - X-Tudo");
					System.out.println("6 - Açaí");
					System.out.println("7 - Terminar/Voltar");
					numeroDoItem = sc.nextInt();	
					//Mesa mesa = new Mesa(numeroDaMesa);
					Comanda comandaTeste = new Comanda();
					Pedido pedidoTeste = new Pedido();
					
					if(numeroDoItem <1 && numeroDoItem > 7) {
						System.out.println("Comando inválido!!!");;
					}
					if(numeroDoItem == 1) {			
						
					}
				}

				
			}
			
			if(comando == 4) { // Item
				
				System.out.println("=================================");
				System.out.println("Deseja adicionar ou remover produto?");
				System.out.println("1 - Adicionar item");
				System.out.println("2 - Remover item");
				System.out.println("3 - Voltar");
				int comandoItem = sc.nextInt();
				
				if(comandoItem == 1) {
				
					System.out.println("=================================");
					System.out.println("Quantos produtos deseja adicionar? ");
					int numeroDeItens = sc.nextInt();
					
					for(int i = 0; i < numeroDeItens; i++) {
						System.out.print("Qual produto deseja adicionar? ");
						String produto = sc.next();
						sc.nextLine();
						System.out.println();
						System.out.print("Qual valor?" );
						double preco = sc.nextDouble();
						Item item = new Item(produto, preco);					
						itens.add(item);
						System.out.println();
						System.out.println(itens);
						System.out.println();
					}
					
					
				}
				if (comandoItem == 2) {
					System.out.print("Qual produto deseja remover? ");
					System.out.println();
					for(int i = 0; i < itens.size(); i++) {
						System.out.println(itens.get(i));
					}
					
					int itemRemover = sc.nextInt();
					itens.remove(itemRemover - 1);
					
					for(int i = 0; i < itens.size(); i++) {
						System.out.println(itens.get(i));
					}
					
				}
				if (comandoItem == 3) {
					System.out.println("Voltar ao menu principal.");
				}
			}
			
			
		}
		sc.close();
		System.out.println("PROGRAMA FINALIZADO!!!");
	}
}


