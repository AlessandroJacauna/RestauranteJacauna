package restauranteDois;

import java.util.ArrayList;
import java.util.List;


public class Mesa extends Comanda{
	private List<Comanda> comandas = new ArrayList<Comanda>();
	private int numeroDaMesa;

	public Mesa(int mesa, int comandas) {		
		this.numeroDaMesa = mesa;
		for(int i = 0; i < comandas; i++) {
			this.comandas.add(i, new Comanda(i+1));
		}
	}
	
	public List<Comanda> getComandas() {
		return comandas;
	}
	
	public void iniciaMesas() {
		for(int i = 0; i < 10; i++) {
			comandas.add(null);
//			System.out.println("null adicionado: " + i);
		}
	}
	
	public void setMesa(int numeroDaMesa) {
		this.numeroDaMesa = numeroDaMesa;
		System.out.println("Mesa #" + this.numeroDaMesa + " agora é Mesa #" + numeroDaMesa);
	}
	
	public int getNumeroMesa() {
		return numeroDaMesa;
	}
	
	public void adicionaComandas(Comanda comanda) {
		this.comandas.set((comanda.getComanda() - 1), comanda);
	}
	
	@Override
	public String toString() {
		return "Mesa: " + numeroDaMesa + " Comandas: " + comandas + "\n";
	}
	
}

