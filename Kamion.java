package Tovari;

import java.util.ArrayList;

public class Kamion {
	private String regBr;
	private ArrayList<Tovar> tovar;
	private double nosivost;
	private double teret;
	
	public Kamion(String regBr, double nosivost) {
		this.nosivost=nosivost;
		this.regBr=regBr;
		this.tovar=new ArrayList<Tovar>();
		
	}
	public boolean staviTovar(Tovar t) {
		return tovar.add(t);
	}
	public boolean skiniTovar(Tovar t) {
		return tovar.remove(t);
	}
	public double teret() {
		double sum=0;
		for (Tovar t : tovar) {
			sum+=t.tezina();
		}
		return sum;
	}
	public String getRegBr() {
		return regBr;
	}
	public double getNosivost() {
		return nosivost;
	}
	
	@Override
	public String toString() {
		return getRegBr() +"("+teret()+"/"+getNosivost()+") \n"
				+ tovar.toString();
		
	}
	
}
