package Tovari;

import java.util.ArrayList;

public class Paket extends Tovar{
	private ArrayList<Tovar> tovar;
	
	public Paket() {
		this.tovar=new ArrayList<Tovar>();
		
	}
	public void dodajTovar(Tovar t) {//dodaje tovar u listu
		this.tovar.add(t);
	}

	@Override
	public String vrsta() {
		return toString()+"( "+tezina()+")";
	}

	@Override
	public double tezina() {
		double sum=0;
		for(Tovar t : tovar) {
			sum +=t.tezina();
		}
		return sum;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n");
		for(Tovar t : tovar) {
			sb.append(t.toString());
		}
		sb.append("\n");
		return sb.toString();
	}

}
