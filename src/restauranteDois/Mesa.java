package restauranteDois;

import java.util.ArrayList;
import java.util.List;


public class Mesa {
	


	private static List<Object> listaPrincipal = new ArrayList<Object>();
	private int mesa;
	private int comanda;
//	int Comanda;

	public Mesa() {
		
	}
	
	public Mesa(int mesa, int comanda) {
		
		this.mesa = mesa;
		this.comanda = comanda;
	
	}
	
	public void iniciaMesas() {
		for(int i = 0; i < 10; i++) {
			listaPrincipal.add(null);
//			System.out.println("null adicionado: " + i);
		}
	}
	
	public int getNumeroMesa() {
		return mesa;
	}
	
	public int getNumeroMesa(int mesa) {
		if(this.mesa == mesa) {
			return this.mesa;
		}
		return (Integer) null;
	}
	
	public void setNumeroComanda(int comanda) {
		this.comanda = comanda;
	}
	
	public int getNumeroComanda() {
		return comanda;
	}
	
	public void setNoArray(int indice, Mesa mesa) {
		listaPrincipal.set(indice, mesa);

	}
	
	public void setNoArray(Mesa ref) {
		listaPrincipal.add(ref);

	}
	
	public void printListaPrincipal() {
		System.out.println(listaPrincipal);
	}
	
	public List<Object> getListaPrincipal() {
		return listaPrincipal;
	}

	
//	@Override
//	public boolean equals(Object ref) {
//		Mesa outra = (Mesa) ref;
//		
//		if (this.mesa != outra.mesa) {
//			return false;
//		}
//		return true;
//	}
	
	@Override
	public String toString() {	
		return "\n---------------------------\n" + "Numero da mesa: " + mesa + "\nNúmero de comandas: " + comanda;
 
	}

//	public boolean contem(Object numeroDaMesa) {
//		Mesa outra = null;
//		outra.mesa = (int) numeroDaMesa;
//		
//		if ( != outra.mesa) {
//			return false;
//	} else {
//		return true;
//	}
//
//	}
}


