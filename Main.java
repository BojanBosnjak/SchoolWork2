package Tovari;

public class Main {

	public static void main(String[] args) {
		Kamion kam = new Kamion("BG 123-4567", 5000);
		kam.staviTovar(new Predmet("secer", 500));
		Paket p = new Paket();
		p.dodajTovar(new Predmet("radio", 3));
		p.dodajTovar(new Predmet("tv", 10));
		kam.staviTovar(p);
		kam.staviTovar(new Predmet("brasno", 300));
		System.out.println(kam);

	}

}
