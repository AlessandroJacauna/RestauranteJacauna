package restauranteDois;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestaRestaurante {
	


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		Mesa restaurante = new Mesa();
		
		restaurante.iniciaMesas();
			
		while (true) {
			
		System.out.println("=================================");
		System.out.println("MENU");
		System.out.println("1 - Mesa.");
		System.out.println("2 - Comandas.");
		System.out.println("3 - Pedido.");
		System.out.println("4 - Item.");
		System.out.println("5 - Sair.");
		
		System.out.print("Selecione uma opcao:");
		
		int comando = sc.nextInt();
		
			if(comando < 1 | comando > 5) {
				System.out.println("COMANDO INVÁLIDO");
				System.out.println();

				
			}

			if (comando == 1) {
				System.out.println("=================================");
				System.out.println("O que deseja fazer?");
				System.out.println("1 - Adicionar mesa.");
				System.out.println("2 - Consultar mesa.");
				System.out.println("3 - Fechar comanda");
				int opcaoMesa = sc.nextInt();
				
				if (opcaoMesa == 1) {
					
					System.out.println("=================================");
					System.out.println("Defina o número da mesa...");
					int novoNumeroMesa = sc.nextInt();
					System.out.println("Defina o número de comandas...");
					int novoNumeroComanda = sc.nextInt();
					Mesa mesa = new Mesa(novoNumeroMesa, novoNumeroComanda);
					mesa.setNoArray(mesa.getNumeroMesa() - 1, mesa);

					System.out.println(mesa.toString());

					
					
				} else if (opcaoMesa == 2){
					System.out.println("=================================");
					System.out.println("Digite 0 para consultar todas as mesas");
					System.out.println("ou");
					System.out.print("Digite o número da mesa:");
					int consultarMesa = sc.nextInt();
					
					if (consultarMesa == 0) {
						restaurante.printListaPrincipal();
					
						} else {
							System.out.println("=================================");
							
							restaurante.getNumeroMesa();
							
							
//							for (int i = 0; i < restaurante.getListaPrincipal().size(); i++) {
//								if (consultarMesa == restaurante.getNumeroMesa(i)) {
//									System.out.println("Acertou miseravi");
//								}
//								System.out.println("NO LAÇO");
							}
//				
					
					} else if (opcaoMesa == 3) {
					System.out.println("=================================");
					System.out.println("Você escolheu 3");
				} else {
					System.out.println("=================================");
					System.out.println("Opção inválida");
				}		
		
		}
			
			
			
			if (comando == 5) {
				System.out.println("PROGRAMA FINALIZADO.");
				break;
			}
		

	}
	sc.close();

}
	
}